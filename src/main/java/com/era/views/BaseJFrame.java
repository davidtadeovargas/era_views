/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import com.era.logger.LoggerUtility;
import com.era.utilities.DialogPropertiesUitlity;
import com.era.utilities.UtilitiesFactory;
import com.era.views.dialogs.DialogsFactory;
import com.era.views.utils.JComponentUtils;
import java.awt.GraphicsEnvironment;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import com.era.views.interfaces.OnJFrameVisible;
import com.era.views.tables.BaseJTable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author PC
 */
public abstract class BaseJFrame extends JFrame {
    
    protected final BaseJFrame baseJFrame = this;
    protected boolean setVisibleWithEfect;
    protected boolean closeSystemOnClose;
    protected JComponentUtils JComponentUtils = new JComponentUtils();
    protected OnJFrameVisible OnJFrameVisible;
    protected PostInitComponents PostInitComponents;
    protected BaseJTable BaseJTable;    
    
    protected String titleWindow;
    
    
    
    public BaseJFrame(final String idTextTitleWindow) {                
        
        super();
        
        try{
            
            //Get the correct properties string
            if(idTextTitleWindow == null || idTextTitleWindow.isEmpty()){
                titleWindow = "window_title_undefined";
            }
            final Properties props = DialogPropertiesUitlity.getSingleton().getProperties();                        
            this.titleWindow = props.getProperty(idTextTitleWindow);

            //Init
            JComponentUtils.setJFrame(baseJFrame);

            //Set icon frame
            JComponentUtils.setIconFrame();

            //When window is visible
            this.OnJFrameVisible = () -> {

                //Refresh the actual user            
                String sessionString = UtilitiesFactory.getSingleton().getUsersUtility().getSessionString();
                sessionString = titleWindow + ": " + sessionString;
                setTitle(sessionString);                
            };

            //When the jframe is visible
            final ComponentListener listener = new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent evt) {
                  if(OnJFrameVisible != null){
                      OnJFrameVisible.onVisible();
                  }
                }
            };
            this.addComponentListener(listener);
            
        }catch (Exception ex) {
            LoggerUtility.getSingleton().logError(BaseJFrame.class, ex);
            try {
                DialogsFactory.getSingleton().getExceptionDialog(baseJFrame, ex).show();
            } catch (Exception ex1) {
                Logger.getLogger(BaseJFrame.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    public void disposeButton(final JButton JButton){
        
        JButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            dispose();
        });
    }

    public void setReadOnly(boolean readOnly) {
        JComponentUtils.setReadOnly(readOnly);
    }
        
    public abstract List<?> getItemsToLoadInTable() throws Exception;
    
    public abstract void clearFields();
    public abstract void loadModelInFields(Object ObjectModel) throws  Exception;
    
    //Called per each jframe to do postinicialization to not change initComponents(); functionality
    protected void postInitComponents(){
        
        //All windows by default dispose
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //Callback
        if(PostInitComponents != null){
            PostInitComponents.OnPostInitComponents();
        }
    }
    
    public void loadAllItemsInTable() throws Exception {
        
        //Load all the items in the table        
        if(this.BaseJTable != null){               
            if(this.BaseJTable.cointainsRows()){
                this.BaseJTable.clearRows();
            }
            final List<?> items = getItemsToLoadInTable();
            this.BaseJTable.initTable(items);
        }
    }
    
    public void maximizedWindow(){
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | javax.swing.JFrame.MAXIMIZED_BOTH);                
    }

    public JComponentUtils getJComponentUtils() {
        return JComponentUtils;
    }
    
    public void setPropertyTitle(final String propertyId) throws Exception{
        
        final Properties props = DialogPropertiesUitlity.getSingleton().getProperties();
        String title = props.getProperty(propertyId);
        if(title==null){
            title = "";
        }
        this.setTitle(title);
    }
    
    public void setVisible(){                
        this.setVisible(true);
    }
    
    
    public void alwaysOnTop(){
        setAlwaysOnTop(true);
    }
    
    public void setDefaultButton(JButton JButton){
        getRootPane().setDefaultButton(JButton);
        UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
    }    
    
    public void close(){
        this.setVisible(false);
    }
    
    public void exitSystemOnCloseWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void onCloseWindowDoNothing(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    @Override
    public void pack() {
        super.pack(); //To change body of generated methods, choose Tools | Templates.
        
        //Init all the components with listeners and more ..
        JComponentUtils.initAllComponents(baseJFrame);
    }
    
    
    
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); //To change body of generated methods, choose Tools | Templates.
                
        if(b){
            
            LoggerUtility.getSingleton().logInfo(LoginLicenseJFrame.class, "Showing window " + this.getClass().getName());
            
            if(setVisibleWithEfect){
                
                float opacity = (float) 0.1;
                for(int x = 0; x < 10; x++){                

                    if(opacity>=1f){
                        LoggerUtility.getSingleton().logInfo(BaseJFrame.class, "Opacity reached limit: " + opacity);                        
                        continue;
                    }

                    this.setOpacity(opacity);

                    LoggerUtility.getSingleton().logInfo(BaseJFrame.class, "Setting opacity: " + opacity);
                    
                    opacity = (float) (opacity + 0.1);                    

                    try {
                        Thread.sleep(80);
                    } catch (InterruptedException ex) {                    
                    }                
                }
            }
        }
        
        //Center screen
        this.setLocationRelativeTo(null);
    }

    public void setSetVisibleWithEfect(boolean setVisibleWithEfect) {
        this.setVisibleWithEfect = setVisibleWithEfect;
    }
    
    public interface PostInitComponents{
        void OnPostInitComponents();
    }
}