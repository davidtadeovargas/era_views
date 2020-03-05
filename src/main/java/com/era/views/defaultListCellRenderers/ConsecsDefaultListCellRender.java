/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.defaultListCellRenderers;

import com.era.models.Consec;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author PC
 */
public class ConsecsDefaultListCellRender extends DefaultListCellRenderer {
    
    public ConsecsDefaultListCellRender(List<Consec> consecs,
                                        JComboBox<Consec> jcombobox){
        consecs.stream().forEach((Consec_) -> {
            jcombobox.addItem(Consec_);
        });
    }    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(value instanceof Consec){
            Consec Consec = (Consec) value;
            setText(Consec.getSerie());
        }
        return this;
    }
}