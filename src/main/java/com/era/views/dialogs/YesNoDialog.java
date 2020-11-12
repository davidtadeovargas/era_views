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
public class YesNoDialog extends BaseDialog {
    
    private YesNoDialogInterface YesNoDialogInterface;
    
    
    
    
    protected YesNoDialog(JFrame jFrame) throws Exception {
        super(jFrame);
        
        //Show the dialog
        int n = JOptionPane.showConfirmDialog(jFrame,text,title,JOptionPane.YES_NO_OPTION);

        //If the user clicked on Yes
        if(n==JOptionPane.OK_OPTION){
           
            //If the interface response is not null call the specific interface method
            if(this.YesNoDialogInterface!=null){
                YesNoDialogInterface.OnYesClicked(jFrame);
            }
        }

        //If the user clicked on No
        if(n==JOptionPane.OK_OPTION){
           
            //If the interface response is not null call the specific interface method
            if(this.YesNoDialogInterface!=null){
                YesNoDialogInterface.OnNoClicked(jFrame);
            }
        }        
    }

    public void setYesNoDialogInterface(YesNoDialogInterface YesNoDialogInterface) {
        this.YesNoDialogInterface = YesNoDialogInterface;
    }    
    
    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public interface YesNoDialogInterface{
        public void OnYesClicked(final JFrame jFrame);
        public void OnNoClicked(final JFrame jFrame);
    }
}
