/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.DocumentOrigin;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.DocumentOriginCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class DocumentOriginCombobox extends BaseComboBox<DocumentOrigin> {
    
    public DocumentOriginCombobox(){
        super(new DocumentOriginCellRender());
    }

    @Override
    List<DocumentOrigin> getItems() throws Exception {
        
        //Emtpy model
        final DocumentOrigin DocumentOrigin = new DocumentOrigin();
        DocumentOrigin.setType("");
        
        final List<DocumentOrigin> documents  = new ArrayList<>();
        documents.add(DocumentOrigin); //Add the empty model
        
        //Get the list of series depending the type
        List<DocumentOrigin> documents_ = (List<DocumentOrigin>)RepositoryFactory.getInstance().getDocumentOriginRepository().getAll();
        
        //Add them all to the list
        documents.addAll(documents_);
        
        return documents;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final DocumentOrigin DocumentOriginItem = (DocumentOrigin)ObjectItem;
        final DocumentOrigin DocumentOriginMethod = (DocumentOrigin)ObjectMethod;
        
        boolean  found = false;        
        if(DocumentOriginItem.getType() != null && DocumentOriginItem.getType().compareTo(DocumentOriginMethod.getType())==0){
            found = true;
        }
        
        return found;
    }
}
