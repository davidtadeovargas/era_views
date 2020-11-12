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
public class ErrorOKDialog extends OKDialog {

    public ErrorOKDialog(JFrame jFrame) throws Exception {
        super(jFrame);
        
        this.title = props.getProperty("system_dialog_title_error");
    }
}
