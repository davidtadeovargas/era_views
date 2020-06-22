/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.panels;

import com.era.repositories.Repository;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class BaseJPanel extends JPanel {

    public OnButonClic OnButonClic;
    protected OnIteration OnIteration;
    protected Repository Repository;
    
    public void loadAllButtonsFromRepository() throws Exception {
        final List<Object> items = (List<Object>)Repository.getAll();
        loadAllButtons(items,new BoxLayout(this, BoxLayout.Y_AXIS));
    }
    
    public void loadAllButtonsPageAxis(final List<?> items) throws Exception {        
        loadAllButtons(items,new BoxLayout(this, BoxLayout.PAGE_AXIS));
    }
    
    private void loadAllButtons(final List<?> items, final LayoutManager LayoutManager) throws Exception {                
        
        //Remove all the items
        removeAll();
        revalidate();
        repaint();
        
        //Change the layout
        setLayout(LayoutManager);
        
        for(Object Object_:items){
            
            //Render             
            if(OnIteration!=null){
                
                JButton JButton = OnIteration.onRender(Object_);
                
                if(JButton!=null){

                    //Config the button
                    JButton.setHorizontalTextPosition(JButton.CENTER);
                    JButton.setVerticalTextPosition(JButton.CENTER);
                    JButton.setPreferredSize(new Dimension(110, 110));
                    JButton.setBackground(Color.white);
                    JButton.setAlignmentY(TOP_ALIGNMENT);
                    JButton.addActionListener((ActionEvent e) -> {

                        if(OnButonClic!=null){
                            OnButonClic.onClic(Object_);
                        }
                    });                    
                    
                    add(JButton);
                    scrollRectToVisible(JButton.getBounds());
                }
            }
        }
    }
    
    public interface OnIteration {
        public JButton onRender(Object Object); 
    }
    public interface OnButonClic {
        public void onClic(Object Object); 
    }

    public void setOnButtonClic(OnButonClic OnButonClic) {
        this.OnButonClic = OnButonClic;
    }        
}
