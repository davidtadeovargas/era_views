/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.UsoCFDI;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.PrinterListCellRender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author PC
 */
public class UsoCFDICombobox extends BaseComboBox<UsoCFDI> {

    public UsoCFDICombobox(){
        super(new PrinterListCellRender());
    }
    
    @Override
    List<UsoCFDI> getItems() throws Exception {
        
        //Emtpy model
        final UsoCFDI UsoCFDI = new UsoCFDI();
        UsoCFDI.setDescription("");
        
        final List<UsoCFDI> usos = new ArrayList<>();
        usos.add(UsoCFDI);
        usos.addAll((Collection<? extends UsoCFDI>) RepositoryFactory.getInstance().getUsoCFDIsRepository().getAll());
        
        return usos;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final UsoCFDI UsoCFDIItem = (UsoCFDI)ObjectItem;
        final UsoCFDI UsoCFDIMethod = (UsoCFDI)ObjectMethod;
        
        boolean  found = false;        
        if(UsoCFDIItem.getCode() != null && UsoCFDIItem.getCode().compareTo(UsoCFDIMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
