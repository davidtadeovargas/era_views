/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs.especifics;

import com.era.views.dialogs.OKDialog;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class ErrorUserNotExistsDialog extends OKDialog{
    
    public ErrorUserNotExistsDialog(JFrame jFrame) {
        super(jFrame);                
        
        //Set the text
        this.text = "Usuario inexistente";
    }
}
