/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import com.era.logger.LoggerUtility;
import com.era.utilities.DialogPropertiesUitlity;
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


/**
 *
 * @author PC
 */
public class BaseJFrame extends JFrame {
    
    protected final BaseJFrame baseJFrame = this;
    protected boolean setVisibleWithEfect;
    protected boolean closeSystemOnClose;
    protected JComponentUtils JComponentUtils = new JComponentUtils();
    protected OnJFrameVisible OnJFrameVisible;
    
    
    
    public BaseJFrame(){                
        
        //Init
        JComponentUtils.setJFrame(baseJFrame);
        
        //Set icon frame
        JComponentUtils.setIconFrame();
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
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
        
        JComponentUtils.initAllListenersComponentes(baseJFrame);
    }
    
    
    
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); //To change body of generated methods, choose Tools | Templates.
                
        if(b){
            
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
}
