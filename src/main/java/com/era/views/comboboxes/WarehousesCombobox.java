/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Warehouse;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.WarehousesCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class WarehousesCombobox extends BaseComboBox<Warehouse> {
    
    public WarehousesCombobox(){
        super(new WarehousesCellRender());
    }

    @Override
    List<Warehouse> getItems() throws Exception {
        
        //Emtpy model
        final Warehouse Warehouse = new Warehouse();
        Warehouse.setCode("");
        
        final List<Warehouse> warehouses = new ArrayList<>();
        warehouses.add(Warehouse); //Add the empty model
        
        //Get the list of series depending the type
        List<Warehouse> warehouses_ = (List<Warehouse>)RepositoryFactory.getInstance().getWarehousesRepository().getAll();
        
        //Add them all to the list
        warehouses.addAll(warehouses_);
        
        return warehouses;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Warehouse WarehouseItem = (Warehouse)ObjectItem;
        final Warehouse WarehouseMethod = (Warehouse)ObjectMethod;
        
        boolean  found = false;        
        if(WarehouseItem.getCode() != null && WarehouseItem.getCode().compareTo(WarehouseMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
