/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Banks;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.BanksCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class BanksCombobox extends BaseComboBox<Banks> {
    
    public BanksCombobox(){
        super(new BanksCellRender());
    }
    
    @Override
    List<Banks> getItems() throws Exception {
        
        //Emtpy model
        final Banks Banks = new Banks();
        Banks.setName("");
        
        final List<Banks> banks = new ArrayList<>();
        banks.add(Banks); //Add the empty model
        
        //Get the list of series depending the type
        List<Banks> banks_ = (List<Banks>)RepositoryFactory.getInstance().getBanksRepository().getAll();
        
        //Add them all to the list
        banks.addAll(banks_);
        
        return banks;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Banks BanksItem = (Banks)ObjectItem;
        final Banks BanksMethod = (Banks)ObjectMethod;
        
        boolean  found = false;        
        if(BanksItem.getCode() != null && BanksItem.getCode().compareTo(BanksMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
