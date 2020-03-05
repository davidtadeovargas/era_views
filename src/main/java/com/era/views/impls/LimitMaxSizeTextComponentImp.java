/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.impls;

import com.era.views.interfaces.IMaxLimitReached;
import java.awt.event.KeyEvent;
import javax.swing.text.JTextComponent;

/**
 *
 * @author PC
 */
public class LimitMaxSizeTextComponentImp implements IMaxLimitReached {

    @Override
    public void onMaxLimitReached(JTextComponent JTextComponent,KeyEvent e,int max) {
        
        //Consume the event and short the string
        e.consume();
        String shortened = JTextComponent.getText().substring(0, max);
        JTextComponent.setText(shortened);
    }
}
