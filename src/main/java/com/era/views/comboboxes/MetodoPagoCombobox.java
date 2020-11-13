/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.CPaymentMethod;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.CPaymentMethodCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class MetodoPagoCombobox extends BaseComboBox<CPaymentMethod> {
    
    public MetodoPagoCombobox(){
        super(new CPaymentMethodCellRender());
    }

    @Override
    List<CPaymentMethod> getItems() throws Exception {
        
        //Emtpy model
        final CPaymentMethod CPaymentMethod = new CPaymentMethod();
        CPaymentMethod.setCode("");
        CPaymentMethod.setDescription("");
        
        final List<CPaymentMethod> metodos = new ArrayList<>();
        metodos.add(CPaymentMethod); //Add the empty model
        
        //Get the list of series depending the type
        List<CPaymentMethod> metodos_ = (List<CPaymentMethod>)RepositoryFactory.getInstance().getCPaymentMethodsRepository().getAll();
        
        //Add them all to the list
        metodos.addAll(metodos_);
        
        return metodos;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final CPaymentMethod MetogoPagoItem = (CPaymentMethod)ObjectItem;
        final CPaymentMethod MetogoPagoMethod = (CPaymentMethod)ObjectMethod;
        
        boolean  found = false;        
        if(MetogoPagoItem.getCode()!= null && MetogoPagoMethod != null && MetogoPagoItem.getCode().compareTo(MetogoPagoMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
