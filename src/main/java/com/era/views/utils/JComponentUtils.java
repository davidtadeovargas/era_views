/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.utils;

import com.era.logger.LoggerUtility;
import com.era.utilities.UtilitiesFactory;
import com.era.views.BaseJFrame;
import com.era.views.keysubscriptions.EnterKeyListener;
import java.awt.Component;
import javax.swing.ButtonModel;
import java.awt.Container;
import javax.swing.AbstractButton;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.event.ChangeListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
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
    protected ALT_TEvent ALT_TEvent;
    protected ALT_TEvent ALT_FEvent;
    protected ALT_TEvent ALT_REvent;
    protected F4Event F4Event;
    protected F11Event F11Event;
    protected EnterEvent EnterEvent;
    private boolean componentsAlreadyInit;
    private boolean F2EventFired;
    private boolean F4EventFired;
    private int f4EventsFired = 0;
    private boolean readOnly;
    private Container mainContainer;
    
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

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
        
        readOnly(mainContainer);
    }

    public void setF11Event(F11Event F11Event) {
        this.F11Event = F11Event;
    }
        
    public void setDisposeInEscapeEvent(final JFrame jFrame, boolean disposeInEscapeEvent) {
        this.JFrame = jFrame;
        this.disposeInEscapeEvent = disposeInEscapeEvent;
    }
        
    
    //When a key is pressed
    private void vKeyPreEsc(java.awt.event.KeyEvent evt){
                
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "KeyEvent.VK_ESCAPE pressed");
            
            System.gc();
            if(JFrame!=null && disposeInEscapeEvent){
                JFrame.dispose();
            }
            if(JDialog!=null){
                JDialog.dispose();
            }                                
            
            if(EscapeEvent!=null){
                EscapeEvent.onEvent();
            }
        }
        else if(evt.isAltDown() && evt.getKeyCode() == KeyEvent.VK_T){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "ALT_TEvent pressed");
            
            if(ALT_TEvent!=null){                
                ALT_TEvent.onEvent();
            }            
        }
        else if(evt.isAltDown() && evt.getKeyCode() == KeyEvent.VK_F){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "ALT_FEvent pressed");
            
            if(ALT_FEvent!=null){                
                ALT_FEvent.onEvent();
            }            
        }
        else if(evt.isAltDown() && evt.getKeyCode() == KeyEvent.VK_R){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "ALT_REvent pressed");
            
            if(ALT_REvent!=null){                
                ALT_REvent.onEvent();
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
        else if(evt.getKeyCode() == KeyEvent.VK_F11){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "KeyEvent.VK_F11 pressed");
            
            if(F11Event!=null){
                F11Event.onEvent();
            }
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "KeyEvent.VK_ENTER pressed");
            
            if(EnterEvent!=null){
                EnterEvent.onEvent();
            }
        }
    }

    public void setALT_FEvent(ALT_TEvent ALT_FEvent) {
        this.ALT_FEvent = ALT_FEvent;
    }

    public void setALT_REvent(ALT_TEvent ALT_REvent) {
        this.ALT_REvent = ALT_REvent;
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
    
    public void limitCharacters(final JTextComponent JTextComponent, int maxlength){
        
        JTextComponent.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) { 
                if (JTextComponent.getText().length() >= maxlength ) // limit textfield to 3 characters
                    e.consume(); 
            }  
        });
    }
    
    public void moneyFormat(final JTextComponent JTextComponent){
        
        //Only decimals
        onlyDecimals(JTextComponent);
        
        //Format money on focus lost
        JTextComponent.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                
                String text = "";
                try{
                    
                    //Prevent empty string
                    if(JTextComponent.getText().trim().isEmpty()){
                        text = "0";
                    }
                    else{
                        text = JTextComponent.getText().trim();
                    }
                    
                    text = UtilitiesFactory.getSingleton().getNumbersUtility().toMoneyFormat(text);
                    
                }catch(Exception ex){
                    JTextComponent.setText(text);
                }
                
                //Set the new formatted value
                JTextComponent.setText(text);
            }
        });
    }
    
    public void onlyDecimals(final JTextComponent JTextComponent){
        
        JTextComponent.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                
                if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
                    evt.consume();
                }
                if(evt.getKeyChar()=='.' && JTextComponent.getText().contains(".")){
                    evt.consume();
                }
            }
        });
        
        JTextComponent.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                
                //Get the text
                String text = JTextComponent.getText().trim();

                //If is empty
                if(text.isEmpty()){
                    JTextComponent.setText("0.0");
                }
                
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
    
    
    public void onRadioButtonChangeListener(JRadioButton JRadioButton, final OnRadioButtonChange OnRadioButtonChange){
        
        JRadioButton.addChangeListener((ChangeEvent e) -> {
            
            AbstractButton aButton = (AbstractButton)e.getSource();
            ButtonModel aModel = aButton.getModel();
            boolean armed = aModel.isArmed();
            boolean pressed = aModel.isPressed();
            boolean selected = aModel.isSelected();
            
            if(selected){
                if(OnRadioButtonChange!=null){
                    OnRadioButtonChange.onChecked();
                }
            }
            else{
                if(OnRadioButtonChange!=null){
                    OnRadioButtonChange.onUncheked();
                }
            }
        });
    }
    
    public void onCheckboxChangeListener(JCheckBox JCheckBox, final OnCheckboxChange OnCheckboxChange){
        
        // Define ChangeListener
        ChangeListener changeListener = (ChangeEvent changeEvent) -> {
            AbstractButton abstractButton =
                    (AbstractButton)changeEvent.getSource();
            ButtonModel buttonModel = abstractButton.getModel();
            boolean armed = buttonModel.isArmed();
            boolean pressed = buttonModel.isPressed();
            boolean selected = buttonModel.isSelected();
            
            if(selected){
                if(OnCheckboxChange!=null){
                    OnCheckboxChange.onChecked();
                }
            }
            else{
                if(OnCheckboxChange!=null){
                    OnCheckboxChange.onUncheked();
                }
            }
            
        };        
        JCheckBox.addChangeListener(changeListener);
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
    
    public void interceptWindowClosingEvent(final WindowClosingEvent WindowClosingEvent){
        
        JFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                if(WindowClosingEvent!=null){
                    WindowClosingEvent.onEvent();
                }
            }
        });
    }
    
    public void interceptWindowClosingToButton(JButton JButton){
        
        JFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    if(JButton!=null){
                        JButton.doClick();
                    }
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
    
    public void addFocusLost(final JTextComponent JTextComponent, final Focus Focus){
        
        JTextComponent.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(Focus!=null){
                    Focus.onFocus(e);
                }
            }
        });
    }
    
    public void addFocusGained(final JTextComponent JTextComponent, final Focus Focus){
        
        JTextComponent.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if(Focus!=null){
                    Focus.onFocus(e);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {                
            }
        });
    }
    
    public interface Focus{
        public void onFocus(FocusEvent e);
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
                String content = JTextComponent.getText();
                content = content.replace("|", "").replace("¬", "").replace("'", "''");
                JTextComponent.setText(content);
            }
        });
    }
    
    public void disableAllComponents(final Container c){
        
        Component[] comps = c.getComponents();
        for (Component comp : comps) {
            comp.setEnabled(false);
            if (comp instanceof Container){
                disableAllComponents((Container) comp);
            }
        }
    }
    
    public void enableAllComponents(final Container c){
        Component[] comps = c.getComponents();
        for (Component comp : comps) {
            comp.setEnabled(true);
            if (comp instanceof Container){
                enableAllComponents((Container) comp);
            }
        }
    }
    
    public void initAllComponents(final Container c){
        if(!componentsAlreadyInit){
            this.mainContainer = c;
            initAllBaseComponents(c);            
            componentsAlreadyInit = true;
        }        
    }
    
    private void readOnly(Container comp_){
        
        Component[] comps = comp_.getComponents();        
        for (Component comp : comps) {
            if (comp instanceof Container){                                                
                readOnly((Container) comp);
            }
            
            if(readOnly){ //Read only
                comp.setEnabled(false);
            }
        }
    }
    
    private List<Component> initAllBaseComponents(final Container c){
        
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<>();
        for (Component comp : comps) {
            compList.add(comp);
            LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Found component in container " + comp.getClass().getName());
            addComponentToKeyPress(comp);
            if (comp instanceof Container){
                LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of Container");
                
                //All textfield componentes
                if (comp instanceof JTextField){
                    if(readOnly){ //Read only
                        comp.setEnabled(false);
                    }
                    LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of JTextField");
                    selectAllTextInControlOnFocus((JTextComponent) comp);
                }
                else if (comp instanceof JTextArea){
                    if(readOnly){ //Read only
                        comp.setEnabled(false);
                    }
                    LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of JTextArea");
                    selectAllTextInControlOnFocus((JTextComponent) comp);
                }
                else if (comp instanceof JPasswordField){
                    if(readOnly){ //Read only
                        comp.setEnabled(false);
                    }
                    LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of JPasswordField");
                    selectAllTextInControlOnFocus((JTextComponent) comp);
                }
                else if (comp instanceof JComboBox){
                    if(readOnly){ //Read only
                        comp.setEnabled(false);
                    }
                }
                else if (comp instanceof JButton){
                    if(readOnly){ //Read only
                        final JButton JButton = (JButton)comp;
                        if(JButton.getText().compareTo("...")==0){
                            comp.setEnabled(false);
                        }                        
                    }
                    LoggerUtility.getSingleton().logInfo(JComponentUtils.class, "Component instance of JButton");                    
                }
                
                compList.addAll(initAllBaseComponents((Container) comp));
            }
        }
        return compList;        
    }
    
    public interface EscapeEvent {
        public void onEvent();
    }
    public interface WindowClosingEvent {
        public void onEvent();
    }
    public interface F2Event {
        public void onEvent();
    }
    public interface ALT_TEvent {
        public void onEvent();
    }
    public interface ALT_REvent {
        public void onEvent();
    }
    public interface ALT_FEvent {
        public void onEvent();
    }
    public interface F4Event {
        public void onEvent();
    }
    public interface F11Event {
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

    public void setALT_TEvent(ALT_TEvent ALT_TEvent) {
        this.ALT_TEvent = ALT_TEvent;
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
    
    public interface OnRadioButtonChange{
        void onChecked();
        void onUncheked();
    }
    
    public interface OnCheckboxChange{
        void onChecked();
        void onUncheked();
    }
}
