/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs.especifics;

import com.era.views.dialogs.BaseDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ExceptionDialog extends BaseDialog {

    private final Exception Exception;
    
    
    
    
    public ExceptionDialog(JFrame jFrame,Exception Exception){
        
        super(jFrame);
        
        this.tittle = "Error";
        
        this.text = Exception.getMessage();
        
        this.Exception = Exception;
    }
    
    @Override
    public void show() {
        
        //Show the dialog
        JOptionPane.showMessageDialog(jFrame, text, tittle, JOptionPane.ERROR_MESSAGE);
    }    
}
