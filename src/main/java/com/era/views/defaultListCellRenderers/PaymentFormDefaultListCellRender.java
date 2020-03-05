/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.defaultListCellRenderers;

import com.era.models.PaymentForm;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author PC
 */
public class PaymentFormDefaultListCellRender extends DefaultListCellRenderer {
    
    public PaymentFormDefaultListCellRender( List<PaymentForm> paymentForms,
                                             JComboBox<PaymentForm> jcombobox){
        paymentForms.stream().forEach((PaymentForm_) -> {
            jcombobox.addItem(PaymentForm_);
        });
    }    
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(value instanceof PaymentForm){
            PaymentForm PaymentForm = (PaymentForm) value;
            setText(PaymentForm.getDescription());
        }
        return this;
    }
}
