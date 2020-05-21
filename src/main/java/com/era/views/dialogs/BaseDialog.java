/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs;

import com.era.utilities.DialogPropertiesUitlity;
import java.util.Properties;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public abstract class BaseDialog {
    
    protected JFrame jFrame;
    protected String title;
    protected String text;
    protected Properties props;
    
    
    protected BaseDialog(final JFrame jFrame) throws Exception {
        
        //Init the frame instance
        this.jFrame = jFrame;
        
        props = DialogPropertiesUitlity.getSingleton().getProperties();
        
        //Set the tittle of the dialog
        this.title = props.getProperty("system_dialog_title");
    }

    //Show the dialog
    public abstract void show();
    
    //Set the text of the dialog
    public void setText(String text) {
        this.text = text;
    }
    
    //Set the text of the dialog
    public void setPropertyText(String propertyId) throws Exception {
        
        if(propertyId == null){
            throw new Exception("Property does not exists");
        }
        
        final String value = props.getProperty(propertyId);
        if(value==null){
            throw new Exception("Property does not exists");
        }
        this.setText(value);
    }
}
