/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs;

import com.era.utilities.DialogPropertiesUitlity;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ExceptionDialog extends BaseDialog {

    private final Exception Exception;
    
    
    
    
    protected ExceptionDialog(JFrame jFrame,Exception Exception) throws Exception{
        
        super(jFrame);
        
        final Properties props = DialogPropertiesUitlity.getSingleton().getProperties();
        this.title = props.getProperty("system_dialog_title_error");
        
        this.text = Exception.getMessage();
        
        this.Exception = Exception;
    }
    
    @Override
    public void show() {
        
        //Show the dialog
        JOptionPane.showMessageDialog(jFrame, text, title, JOptionPane.ERROR_MESSAGE);
    }    
}
