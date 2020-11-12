/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.CUsoCFDI;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.UsoCFDICellRender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author PC
 */
public class UsoCFDICombobox extends BaseComboBox<CUsoCFDI> {

    public UsoCFDICombobox(){
        super(new UsoCFDICellRender());
    }
    
    @Override
    List<CUsoCFDI> getItems() throws Exception {
        
        //Emtpy model
        final CUsoCFDI CUsoCFDI = new CUsoCFDI();
        CUsoCFDI.setDescription("");
        
        final List<CUsoCFDI> usos = new ArrayList<>();
        usos.add(CUsoCFDI);
        usos.addAll((Collection<? extends CUsoCFDI>) RepositoryFactory.getInstance().getCUsoCFDIsRepository().getAll());
        
        return usos;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final CUsoCFDI CUsoCFDIItem = (CUsoCFDI)ObjectItem;
        final CUsoCFDI CUsoCFDIMethod = (CUsoCFDI)ObjectMethod;
        
        boolean  found = false;        
        if(CUsoCFDIItem.getCode() != null && CUsoCFDIItem.getCode().compareTo(CUsoCFDIMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
