/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.CPaymentForm;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.PaymentFormCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class PaymentFormCombobox extends BaseComboBox<CPaymentForm> {
    
    public PaymentFormCombobox(){
        super(new PaymentFormCellRender());
    }
    
    @Override
    List<CPaymentForm> getItems() throws Exception {
        
        //Emtpy model
        final CPaymentForm PaymentForm = new CPaymentForm();
        PaymentForm.setDescription("");
        
        final List<CPaymentForm> payments = new ArrayList<>();
        payments.add(PaymentForm); //Add the empty model
        
        //Get all the payment methods
        List<CPaymentForm> paymentForms = (List<CPaymentForm>)RepositoryFactory.getInstance().getPaymentFormsRepository().getAll();
        
        //Add them all to the list
        payments.addAll(paymentForms);
        
        return payments;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final CPaymentForm PaymentFormItem = (CPaymentForm)ObjectItem;
        final CPaymentForm PaymentFormMethod = (CPaymentForm)ObjectMethod;
        
        boolean  found = false;        
        if(PaymentFormItem.getC_FormaPago() != null && PaymentFormItem.getC_FormaPago().compareTo(PaymentFormMethod.getC_FormaPago())==0){
            found = true;
        }
        
        return found;
    }
}
