/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.viewscontrollers;

import com.era.views.RegisterWebsiteJFrame;
import java.util.List;

/**
 *
 * @author PC
 */
public class RegisterWebsiteViewController extends RegisterWebsiteJFrame {

    private OnURLLabelClicked OnURLLabelClicked;
    private OnOKButtonClicked OnOKButtonClicked;
    
    
    
    
    public RegisterWebsiteViewController(){
        
        OKjButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            OKjButtonActionPerformed(evt);
        });
        urlJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urlJLabelMouseClicked(evt);
            }
        });
    }
    
    @Override
    public void clearFields(){
    }
    
    @Override
    public void loadModelInFields(Object ObjectModel) throws  Exception {        
    }
    
    private void urlJLabelMouseClicked(java.awt.event.MouseEvent evt) {                                       
        
        if(OnURLLabelClicked!=null){
            OnURLLabelClicked.onClicked(evt);
        }
        
    }
    
    private void OKjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        if(OnOKButtonClicked!=null){
            OnOKButtonClicked.onClicked(evt);
        }
        
    }
    
    public OnURLLabelClicked getOnURLLabelClicked() {
        return OnURLLabelClicked;
    }

    public void setOnURLLabelClicked(OnURLLabelClicked OnURLLabelClicked) {
        this.OnURLLabelClicked = OnURLLabelClicked;
    }

    public OnOKButtonClicked getOnOKButtonClicked() {
        return OnOKButtonClicked;
    }

    public void setOnOKButtonClicked(OnOKButtonClicked OnOKButtonClicked) {
        this.OnOKButtonClicked = OnOKButtonClicked;
    }

    @Override
    public List<?> getItemsToLoadInTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public interface OnURLLabelClicked{
        public void onClicked(java.awt.event.MouseEvent evt);
    }
    
    public interface OnOKButtonClicked{
        public void onClicked(java.awt.event.ActionEvent evt);
    }
}
