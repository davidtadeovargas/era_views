/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.interfaces;

import java.awt.event.KeyEvent;
import javax.swing.text.JTextComponent;

/**
 *
 * @author PC
 */
public interface IMaxLimitReached {
    public void onMaxLimitReached(JTextComponent JTextComponent,KeyEvent e,int max);
}
