/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs;

import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public abstract class BaseDialog {
    
    protected JFrame jFrame;
    protected String tittle;
    protected String text;
    
    
    
    protected BaseDialog(final JFrame jFrame){
        
        //Init the frame instance
        this.jFrame = jFrame;
        
        //Set the tittle of the dialog
        this.tittle = "Mensjae de Sistema";
    }

    //Show the dialog
    public abstract void show();
    
    //Set the text of the dialog
    public void setText(String text) {
        this.text = text;
    }
}
