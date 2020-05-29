/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes.cellrenders;

import java.awt.Component;
import javax.swing.JList;
import com.era.datamodels.PrinterDataModel;
import javax.swing.DefaultListCellRenderer;

/**
 *
 * @author PC
 */
public class PrinterListCellRender extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
                                   JList list,
                                   Object value,
                                   int index,
                                   boolean isSelected,
                                   boolean cellHasFocus) {
        if (value instanceof PrinterDataModel) {
            value = ((PrinterDataModel)value).getName();
        }
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        return this;
    }
    
}
