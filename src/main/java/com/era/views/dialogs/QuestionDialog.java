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
public class QuestionDialog extends BaseDialog {
    
    private OKDialogInterface OKDialogInterface;
    
    
    
    
    protected QuestionDialog(JFrame jFrame) throws Exception {
        super(jFrame);
    }

    public void setOKDialogInterface(OKDialogInterface OKDialogInterface) {
        this.OKDialogInterface = OKDialogInterface;
    }    
    
    @Override
    public void show() {
        
        //Show the dialog
        Object[] op = {"Si","No"};
        int iRes    = JOptionPane.showOptionDialog(jFrame, text, this.title, JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
        JOptionPane.showMessageDialog(jFrame, text);
        if(iRes==JOptionPane.YES_OPTION) {
            //If the interface response is not null call the method OnOkClicked()
            if(OKDialogInterface!=null){
                OKDialogInterface.OnOkClicked(jFrame);
            }
        }                    
    }
    
    //Interface for callback
    public interface OKDialogInterface{
        public void OnOkClicked(JFrame jFrame);
    }
}
