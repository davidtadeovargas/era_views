/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.listeners;

import com.era.views.impls.LimitMaxSizeTextComponentImp;
import com.era.views.interfaces.IMaxLimitReached;
import java.awt.event.KeyEvent;
import javax.swing.text.JTextComponent;

/**
 *
 * @author PC
 */
public class KeyListener {
    
    private IMaxLimitReached IMaxLimitReached;
    private int max;
    
    
    
    //Set maximum limit characters of the field
    public void setMaxCharactersLimit(final int max){
        this.IMaxLimitReached = new LimitMaxSizeTextComponentImp();
        this.max = max;
    }
    
    //Add global keylistener to the control
    public void addKeyListener(final JTextComponent JTextComponent){
        
        JTextComponent.addKeyListener(new java.awt.event.KeyListener(){
            
            @Override
            public void keyPressed(KeyEvent e){
                
                //Control the max limit size characters in the control
                if(JTextComponent.getText().length() > max+1) {
                    if(IMaxLimitReached!=null){
                        IMaxLimitReached.onMaxLimitReached(JTextComponent,e,max);
                    }
                }else if(JTextComponent.getText().length() > max) {
                    if(IMaxLimitReached!=null){
                        IMaxLimitReached.onMaxLimitReached(JTextComponent,e,max);
                    }
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
