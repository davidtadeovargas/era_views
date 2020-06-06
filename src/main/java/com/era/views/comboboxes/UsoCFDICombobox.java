/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.UsoCFDI;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.UsoCFDICellRender;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class UsoCFDICombobox extends BaseComboBox<UsoCFDI>{
    
    public UsoCFDICombobox(){
        super(new UsoCFDICellRender());
    }
    
    @Override
    List<UsoCFDI> getItems() throws Exception {
        
        //Emtpy model
        final UsoCFDI UsoCFDI = new UsoCFDI();
        UsoCFDI.setDescription("");
        
        final List<UsoCFDI> usos = new ArrayList<>();
        usos.add(UsoCFDI); //Add the empty model
        
        //Get all the usos methods
        final List<UsoCFDI> usosDB = (List<UsoCFDI>)RepositoryFactory.getInstance().getUsoCFDIsRepository().getAll();
        
        //Add them all to the list
        usos.addAll(usosDB);
        
        return usos;
    }
}
