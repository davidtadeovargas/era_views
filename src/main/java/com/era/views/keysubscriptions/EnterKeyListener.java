/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.keysubscriptions;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class EnterKeyListener {
    
    private IKeyPressed IKeyPressed;
    private List<JTextField> JTextFieldList = new ArrayList();    
    
    private static EnterKeyListener EnterKeyListener;
    
    
    
    private EnterKeyListener(){        
    }
    
    public static EnterKeyListener getSingleton(){
        if(EnterKeyListener==null){
            EnterKeyListener = new EnterKeyListener();            
        }
        return EnterKeyListener;
    }
    
    public void setIKeyPressed(IKeyPressed IKeyPressed) {
        this.IKeyPressed = IKeyPressed;
    }

    public void addJTextField(JTextField JTextField) {
        if(JTextField==null){
            JTextFieldList = new ArrayList();
        }
        JTextFieldList.add(JTextField);
    }    

    public void register(){
        
        for(JTextField JTextField_:JTextFieldList){
            JTextField_.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        if(IKeyPressed!=null){
                            IKeyPressed.pressed();
                        }
                    }
                }
            });
        }            
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
}
