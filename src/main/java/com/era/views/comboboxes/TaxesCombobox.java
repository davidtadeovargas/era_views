/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Tax;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.TaxCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class TaxesCombobox extends BaseComboBox<Tax> {
    
    public TaxesCombobox(){
        super(new TaxCellRender());
    }

    @Override
    List<Tax> getItems() throws Exception {
        
        //Emtpy model
        final Tax Tax = new Tax();
        Tax.setCode("");
        
        final List<Tax> taxes = new ArrayList<>();
        taxes.add(Tax); //Add the empty model
        
        //Get the list of series depending the type
        List<Tax> taxes_ = (List<Tax>)RepositoryFactory.getInstance().getTaxesRepository().getAll();
        
        //Add them all to the list
        taxes.addAll(taxes_);
        
        return taxes;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Tax TaxItem = (Tax)ObjectItem;
        final Tax TaxMethod = (Tax)ObjectMethod;
        
        boolean  found = false;        
        if(TaxItem.getCode() != null && TaxItem.getCode().compareTo(TaxMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
