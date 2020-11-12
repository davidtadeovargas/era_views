/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.viewscontrollers;

import com.era.logger.LoggerUtility;
import com.era.utilities.DialogPropertiesUitlity;
import com.era.views.dialogs.DialogsFactory;
import com.era.views.dialogs.ErrorDialogJFrame;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ErrorDialogViewController extends ErrorDialogJFrame {
    
    private OnOkButtonActionPerformed OnOkButtonActionPerformed;
    private Properties props;
    
    
    public ErrorDialogViewController(){      
        
        try{                        

            this.props = DialogPropertiesUitlity.getSingleton().getProperties();
            
            okButton.addActionListener((java.awt.event.ActionEvent evt) -> {
                okButtonActionPerformed(evt);
            });        
            
        }catch (Exception ex) {
            LoggerUtility.getSingleton().logError(ErrorDialogViewController.class, ex);
            try {
                DialogsFactory.getSingleton().getExceptionDialog(baseJFrame, ex).show();
            } catch (Exception ex1) {
                Logger.getLogger(ErrorDialogViewController.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void clearFields(){
    }
    
    public void setIdText(final String idText) {
        final String finalString = props.getProperty(idText);
        this.mainText.setText(finalString);
    }
    
    @Override
    public void loadModelInFields(Object ObjectModel) throws  Exception {        
    }
    
    public void setText(final String text) {
        this.mainText.setText(text);
    }
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        dispose();
        
        if(OnOkButtonActionPerformed != null){
            OnOkButtonActionPerformed.okButtonActionPerformed(evt);
        }     
    }

    public void setOnOkButtonActionPerformed(OnOkButtonActionPerformed OnOkButtonActionPerformed) {
        this.OnOkButtonActionPerformed = OnOkButtonActionPerformed;
    }        

    @Override
    public List<?> getItemsToLoadInTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
