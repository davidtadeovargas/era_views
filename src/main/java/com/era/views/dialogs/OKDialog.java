/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class OKDialog extends BaseDialog {
    
    private OKDialogInterface OKDialogInterface;
    
    
    
    
    public OKDialog(JFrame jFrame) {
        super(jFrame);
    }

    public void setOKDialogInterface(OKDialogInterface OKDialogInterface) {
        this.OKDialogInterface = OKDialogInterface;
    }    
    
    @Override
    public void show() {
        
        //Show the dialog
        JOptionPane.showMessageDialog(jFrame, text);

        //If the interface response is not null call the method OnOkClicked()
        if(OKDialogInterface!=null){
            OKDialogInterface.OnOkClicked(jFrame);
        }
    }
    
    //Interface for callback
    public interface OKDialogInterface{
        public void OnOkClicked(JFrame jFrame);
    }
}
