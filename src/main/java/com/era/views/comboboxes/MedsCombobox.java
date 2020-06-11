/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Meds;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.MedsCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class MedsCombobox extends BaseComboBox<Meds> {
    
    public MedsCombobox(){
        super(new MedsCellRender());
    }

    @Override
    List<Meds> getItems() throws Exception {
        
        //Emtpy model
        final Meds Meds = new Meds();
        Meds.setCode("");
        
        final List<Meds> meds = new ArrayList<>();
        meds.add(Meds); //Add the empty model
        
        //Get the list of series depending the type
        List<Meds> meds_ = (List<Meds>)RepositoryFactory.getInstance().getMedssRepository().getAll();
        
        //Add them all to the list
        meds.addAll(meds_);
        
        return meds;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Meds MedsItem = (Meds)ObjectItem;
        final Meds MedsMethod = (Meds)ObjectMethod;
        
        boolean  found = false;        
        if(MedsItem.getCode() != null && MedsItem.getCode().compareTo(MedsMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
