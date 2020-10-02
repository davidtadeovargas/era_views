/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.CPaymentForm;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.CPaymentFormCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class MetodoPagoCombobox extends BaseComboBox<CPaymentForm> {
    
    public MetodoPagoCombobox(){
        super(new CPaymentFormCellRender());
    }

    @Override
    List<CPaymentForm> getItems() throws Exception {
        
        //Emtpy model
        final CPaymentForm CPaymentForm = new CPaymentForm();
        CPaymentForm.setC_FormaPago("");
        CPaymentForm.setDescription("");
        
        final List<CPaymentForm> metodos = new ArrayList<>();
        metodos.add(CPaymentForm); //Add the empty model
        
        //Get the list of series depending the type
        List<CPaymentForm> metodos_ = (List<CPaymentForm>)RepositoryFactory.getInstance().getCPaymentFormsRepository().getAll();
        
        //Add them all to the list
        metodos.addAll(metodos_);
        
        return metodos;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final CPaymentForm MetogoPagoItem = (CPaymentForm)ObjectItem;
        final CPaymentForm MetogoPagoMethod = (CPaymentForm)ObjectMethod;
        
        boolean  found = false;        
        if(MetogoPagoItem.getC_FormaPago()!= null && MetogoPagoItem.getC_FormaPago().compareTo(MetogoPagoMethod.getC_FormaPago())==0){
            found = true;
        }
        
        return found;
    }
}
