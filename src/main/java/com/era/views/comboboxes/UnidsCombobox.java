/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Unid;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.UnidCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class UnidsCombobox extends BaseComboBox<Unid> {
    
    public UnidsCombobox(){
        super(new UnidCellRender());
    }

    @Override
    List<Unid> getItems() throws Exception {
        
        //Emtpy model
        final Unid Unid = new Unid();
        Unid.setCode("");
        
        final List<Unid> unids = new ArrayList<>();
        unids.add(Unid); //Add the empty model
        
        //Get the list of series depending the type
        List<Unid> unids_ = (List<Unid>)RepositoryFactory.getInstance().getUnidsRepository().getAll();
        
        //Add them all to the list
        unids.addAll(unids_);
        
        return unids;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Unid UnidItem = (Unid)ObjectItem;
        final Unid UnidMethod = (Unid)ObjectMethod;
        
        boolean  found = false;        
        if(UnidItem.getCode() != null && UnidItem.getCode().compareTo(UnidMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
