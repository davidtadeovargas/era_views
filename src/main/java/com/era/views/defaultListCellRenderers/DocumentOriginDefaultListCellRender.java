/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.defaultListCellRenderers;

import com.era.models.DocumentOrigin;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author PC
 */
public class DocumentOriginDefaultListCellRender extends DefaultListCellRenderer {
    
    public DocumentOriginDefaultListCellRender( List<DocumentOrigin> documentsOrigin,
                                                JComboBox<DocumentOrigin> jcombobox){
        documentsOrigin.stream().forEach((DocumentOrigin_) -> {
            jcombobox.addItem(DocumentOrigin_);
        });
    }    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(value instanceof DocumentOrigin){
            DocumentOrigin DocumentOrigin = (DocumentOrigin) value;
            setText(DocumentOrigin.getName());
        }
        return this;
    }
}