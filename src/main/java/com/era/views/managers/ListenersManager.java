/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.managers;

import com.era.views.listeners.KeyListener;

/**
 *
 * @author PC
 */
public class ListenersManager {
    
    private static ListenersManager ListenersManager;
    
    
    
    private ListenersManager(){        
    }

    final public static ListenersManager getSingleton(){
        if(ListenersManager==null){
            ListenersManager = new ListenersManager();
        }
        return ListenersManager;
    }
    
    public KeyListener getKeyListener(){
        return new KeyListener();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
