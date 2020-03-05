/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.defaultListCellRenderers;

import com.era.models.DocumentOrigin;
import com.era.models.UsoCFDI;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author PC
 */
public class UsoCFDIDefaultListCellRender extends DefaultListCellRenderer {
    
    public UsoCFDIDefaultListCellRender(List<UsoCFDI> usosCFDI,
                                        JComboBox<UsoCFDI> jcombobox){
        usosCFDI.stream().forEach((UsoCFDI_) -> {
            jcombobox.addItem(UsoCFDI_);
        });
    }    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(value instanceof UsoCFDI){
            UsoCFDI UsoCFDI = (UsoCFDI) value;
            setText(UsoCFDI.getCode());
        }
        return this;
    }
}
