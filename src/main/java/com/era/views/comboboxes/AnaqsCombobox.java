/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Anaqs;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.AnaqsCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class AnaqsCombobox extends BaseComboBox<Anaqs> {
    
    public AnaqsCombobox(){
        super(new AnaqsCellRender());
    }

    @Override
    List<Anaqs> getItems() throws Exception {
        
        //Emtpy model
        final Anaqs Anaqs = new Anaqs();
        Anaqs.setCode("");
        
        final List<Anaqs> anaqs = new ArrayList<>();
        anaqs.add(Anaqs); //Add the empty model
        
        //Get the list of series depending the type
        List<Anaqs> anaqs_ = (List<Anaqs>)RepositoryFactory.getInstance().getAnaqssRepository().getAll();
        
        //Add them all to the list
        anaqs.addAll(anaqs_);
        
        return anaqs;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Anaqs AnaqsItem = (Anaqs)ObjectItem;
        final Anaqs AnaqsMethod = (Anaqs)ObjectMethod;
        
        boolean  found = false;        
        if(AnaqsItem.getCode() != null && AnaqsItem.getCode().compareTo(AnaqsMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
