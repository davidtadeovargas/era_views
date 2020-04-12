/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.utils;

import com.era.logger.LoggerUtility;
import com.era.views.BaseJFrame;
import com.era.views.keysubscriptions.EnterKeyListener;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.text.JTextComponent;

/**
 *
 * @author PC
 */
public class JComponentUtils {
    
    private boolean disposeInEscapeEvent;
    private JFrame JFrame;
    private JDialog JDialog;
    private EscapeEvent EscapeEvent;
    protected F2Event F2Event;
    protected F4Event F4Event;
    protected EnterEvent EnterEvent;
    private boolean alreadyAddedKeylisteners;
    private boolean F2EventFired;
    private boolean F4EventFired;
    private int f4EventsFired = 0;
    
    
    public void addComponentToKeyPress(Component Component){
        Component.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                vKeyPreEsc(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        });
    }
    
    //When a key is pressed
    private void vKeyPreEsc(java.awt.event.KeyEvent evt){
                
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "KeyEvent.VK_ESCAPE pressed");
            
            System.gc();
            if(JFrame!=null){
                JFrame.dispose();
            }
            if(JDialog!=null){
                JDialog.dispose();
            }                                
            
            if(EscapeEvent!=null){
                EscapeEvent.onEvent();
            }
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F2){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "KeyEvent.VK_F2 pressed");
            
            if(F2Event!=null){
                F2EventFired = true;
                F2Event.onEvent();
            }
        }
        else if(evt.getKeyCode() == KeyEvent.VK_F4){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "KeyEvent.VK_F4 pressed");
            
            if(F4Event!=null){
                
                if(f4EventsFired==1){
                    f4EventsFired = 0;
                }
                else{
                    F4EventFired = true;
                    ++f4EventsFired;
                    F4Event.onEvent();
                }   
            }
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "KeyEvent.VK_ENTER pressed");
            
            if(EnterEvent!=null){
                EnterEvent.onEvent();
            }
        }
    }
    
    public boolean F2EventFired(){
        final boolean val = F2EventFired;
        F2EventFired = false;
        return val;
    }
    
    public boolean F4EventFired(){
        final boolean val = F4EventFired;
        F4EventFired = false;        
        return val;
    }
    
    public void onlyNumbers(final JComponent JComponent){
        JComponent.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent evt) {
                if(((evt.getKeyChar() < '0') || (evt.getKeyChar() > '9')) && (evt.getKeyChar() != '\b') && (evt.getKeyChar() != '.'))         
                    evt.consume();
            }

            @Override
            public void keyPressed(KeyEvent e) {                
            }

            @Override
            public void keyReleased(KeyEvent e) {                
            }            
        });
    }
    
    public void onKeyTypedToMayus(JTextField JTextField){
        
        JTextField.addKeyListener(new KeyListener(){
                @Override
                public void keyTyped(KeyEvent e) {
                    
                    //Convert the character tu mayus
                    if(Character.isLowerCase(e.getKeyChar()))       
                        e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
                }

                @Override
                public void keyPressed(KeyEvent e) {                    
                }

                @Override
                public void keyReleased(KeyEvent e) {                    
                }                
            });
    }
    
    
    public void addJTextFieldsWhenEnterKeyIsPressed(List<JTextField> JTextFields,JToggleButton JButton){
        
        final EnterKeyListener EnterKeyListener_ = EnterKeyListener.getSingleton();
        JTextFields.stream().forEach((JTextField_) -> {
            EnterKeyListener_.addJTextField(JTextField_);
        });
        EnterKeyListener_.setIKeyPressed(() -> {
            JButton.doClick();            
        });
        EnterKeyListener_.register();
    }
    
    public void interceptWindowClosingToButton(JButton JButton){
        
        JFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    JButton.doClick();
                }
            });
    }
    
    public void limitTextPasswordField(JPasswordField JPasswordField, int limit){
                
        JPasswordField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
                //Get the text
                String text = new String(JPasswordField.getPassword());

                //If exceds the limit the cut it
                if(text.length()> limit)
                    JPasswordField.setText(text.substring(0, 255));
            }

            @Override
            public void keyPressed(KeyEvent e) {                    
            }

            @Override
            public void keyReleased(KeyEvent e) {                    
            }
        });
        JPasswordField.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                //Get the text
                String text = new String(JPasswordField.getPassword());

                //If exceds the limit the cut it
                if(text.length()> limit)
                    JPasswordField.setText(text.substring(0, 255));
            }
        });
    }
    
    public void limitTextField(JTextComponent JTextComponent, int limit){
                
        JTextComponent.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
                //Get the text
                String text = JTextComponent.getText();

                //If exceds the limit the cut it
                if(text.length()> limit)
                    JTextComponent.setText(text.substring(0, 255));
            }

            @Override
            public void keyPressed(KeyEvent e) {                    
            }

            @Override
            public void keyReleased(KeyEvent e) {                    
            }
        });
        JTextComponent.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                //Get the text
                String text = JTextComponent.getText();

                //If exceds the limit the cut it
                if(text.length()> limit)
                    JTextComponent.setText(text.substring(0, 255));
            }
        });
    }
    
    //Método para establecer el ícono de la aplicación
    public void setIconFrame(){
        
        final String logoImage = "/imgs/logo.png";
        
        //Si el cliente tiene un logo personalizado entonces la imágen será esa
        Image imgIcon;
        if(new File(new java.io.File("").getAbsolutePath() + "\\Logo.jpg").exists())
            imgIcon = Toolkit.getDefaultToolkit().getImage(new java.io.File("").getAbsolutePath() + "\\Logo.jpg");
        else
            imgIcon = new ImageIcon(BaseJFrame.class.getResource(logoImage)).getImage();
        
        if(JFrame!=null){
            JFrame.setIconImage(imgIcon);
        }            
    }
    
    public void selectAllTextInControlOnFocus(JTextComponent JTextComponent){
        
        LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "selectAllTextInControlOnFocus for " + JTextComponent.getClass().getName());
        
        JTextComponent.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                JTextComponent.setSelectionStart(0);JTextComponent.setSelectionEnd(JTextComponent.getText().length());        
                JTextComponent.setSelectionEnd(JTextComponent.getText().length());
            }
            @Override
            public void focusLost(FocusEvent e) {               
            }
        });        
    }
    
    public void initAllListenersComponentes(final Container c){
        if(!alreadyAddedKeylisteners){
            initAllBaseComponentsListeners(c);
            alreadyAddedKeylisteners = true;
        }        
    }
    
    private List<Component> initAllBaseComponentsListeners(final Container c){
        
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<>();
        for (Component comp : comps) {
            compList.add(comp);
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Found component in container " + comp.getClass().getName());
            addComponentToKeyPress(comp);
            if (comp instanceof Container){
                LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of Container");
                
                if (comp instanceof JTextField){
                    LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of JTextField");
                    selectAllTextInControlOnFocus((JTextComponent) comp);
                }
                else if (comp instanceof JTextArea){
                    LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of JTextArea");
                    selectAllTextInControlOnFocus((JTextComponent) comp);
                }
                else if (comp instanceof JPasswordField){
                    LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of JPasswordField");
                    selectAllTextInControlOnFocus((JTextComponent) comp);
                }
                
                compList.addAll(initAllBaseComponentsListeners((Container) comp));                
            }
        }
        return compList;        
    }
    
    public interface EscapeEvent {
        public void onEvent();
    }
    public interface F2Event {
        public void onEvent();
    }
    public interface F4Event {
        public void onEvent();
    }
    public interface EnterEvent {
        public void onEvent();
    }

    public void setJFrame(JFrame JFrame) {
        this.JFrame = JFrame;
    }

    public void setEscapeEvent(EscapeEvent EscapeEvent) {
        this.EscapeEvent = EscapeEvent;
    }

    public void setF2Event(F2Event F2Event) {
        this.F2Event = F2Event;
    }

    public void setF4Event(F4Event F4Event) {
        this.F4Event = F4Event;
    }

    public void setEnterEvent(EnterEvent EnterEvent) {
        this.EnterEvent = EnterEvent;
    }

    public void setJDialog(JDialog JDialog) {
        this.JDialog = JDialog;
    }
    
    
}
