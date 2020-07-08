/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.MetogoPago;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.MetodoPagoCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class MetodoPagoCombobox extends BaseComboBox<MetogoPago> {
    
    public MetodoPagoCombobox(){
        super(new MetodoPagoCellRender());
    }

    @Override
    List<MetogoPago> getItems() throws Exception {
        
        //Emtpy model
        final MetogoPago MetogoPago = new MetogoPago();
        MetogoPago.setCode("");
        
        final List<MetogoPago> metodos = new ArrayList<>();
        metodos.add(MetogoPago); //Add the empty model
        
        //Get the list of series depending the type
        List<MetogoPago> metodos_ = (List<MetogoPago>)RepositoryFactory.getInstance().getMetogoPagosRepository().getAll();
        
        //Add them all to the list
        metodos.addAll(metodos_);
        
        return metodos;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final MetogoPago MetogoPagoItem = (MetogoPago)ObjectItem;
        final MetogoPago MetogoPagoMethod = (MetogoPago)ObjectMethod;
        
        boolean  found = false;        
        if(MetogoPagoItem.getCode() != null && MetogoPagoItem.getCode().compareTo(MetogoPagoMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
