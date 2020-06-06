/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import com.era.views.utils.JComponentUtils;
import javax.swing.JDialog;

/**
 *
 * @author PC
 */
public class BaseJDialog extends JDialog{
    
    protected JComponentUtils JComponentUtils = new JComponentUtils();
    private boolean previouslyVisible;
    
    
    
    
    public BaseJDialog(){
        super();
        this.setTitle("Easy Retail Admin");
        
        JComponentUtils.setJDialog(this);
    }
    
    public void setVisible(){
        this.setVisible(true);                
    }
    
    @Override
    public void setVisible(boolean b) {
        
        //Center screen
        this.setLocationRelativeTo(null);
        
        super.setVisible(b);
        
        if(b){
            JComponentUtils.initAllComponents(this);
        }
    }
}
