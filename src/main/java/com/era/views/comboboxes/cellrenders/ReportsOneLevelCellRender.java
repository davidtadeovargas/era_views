/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes.cellrenders;

import com.era.views.comboboxes.models.ReportsOneLevel;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author PC
 */
public class ReportsOneLevelCellRender extends DefaultListCellRenderer {
    
    @Override
    public Component getListCellRendererComponent(
                                   JList list,
                                   Object value,
                                   int index,
                                   boolean isSelected,
                                   boolean cellHasFocus) {
        if (value instanceof ReportsOneLevel) {
            value = ((ReportsOneLevel)value).getValue();
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }
}
