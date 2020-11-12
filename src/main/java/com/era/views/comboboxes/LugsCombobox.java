/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Lugs;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.LugsCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class LugsCombobox extends BaseComboBox<Lugs> {
    
    public LugsCombobox(){
        super(new LugsCellRender());
    }

    @Override
    List<Lugs> getItems() throws Exception {
        
        //Emtpy model
        final Lugs Lugs = new Lugs();
        Lugs.setCode("");
        
        final List<Lugs> lugs = new ArrayList<>();
        lugs.add(Lugs); //Add the empty model
        
        //Get the list of series depending the type
        List<Lugs> lugs_ = (List<Lugs>)RepositoryFactory.getInstance().getLugssRepository().getAll();
        
        //Add them all to the list
        lugs.addAll(lugs_);
        
        return lugs;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Lugs LugsItem = (Lugs)ObjectItem;
        final Lugs LugsMethod = (Lugs)ObjectMethod;
        
        boolean  found = false;        
        if(LugsItem.getCode() != null && LugsItem.getCode().compareTo(LugsMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
