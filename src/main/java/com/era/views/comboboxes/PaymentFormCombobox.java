/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.PaymentForm;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.PaymentFormCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class PaymentFormCombobox extends BaseComboBox<PaymentForm> {
    
    public PaymentFormCombobox(){
        super(new PaymentFormCellRender());
    }
    
    @Override
    List<PaymentForm> getItems() throws Exception {
        
        //Emtpy model
        final PaymentForm PaymentForm = new PaymentForm();
        PaymentForm.setDescription("");
        
        final List<PaymentForm> payments = new ArrayList<>();
        payments.add(PaymentForm); //Add the empty model
        
        //Get all the payment methods
        List<PaymentForm> paymentForms = (List<PaymentForm>)RepositoryFactory.getInstance().getPaymentFormsRepository().getAll();
        
        //Add them all to the list
        payments.addAll(paymentForms);
        
        return payments;
    }
}
