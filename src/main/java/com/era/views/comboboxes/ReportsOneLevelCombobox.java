/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.views.comboboxes.cellrenders.ReportsOneLevelCellRender;
import com.era.views.comboboxes.models.ReportsOneLevel;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class ReportsOneLevelCombobox extends BaseComboBox<ReportsOneLevel> {
    
    public ReportsOneLevelCombobox(){
        super(new ReportsOneLevelCellRender());
    }
    
    @Override
    List<ReportsOneLevel> getItems() throws Exception {
        
        //Emtpy model
        ReportsOneLevel ReportsOneLevel = new ReportsOneLevel();
        ReportsOneLevel.setValue("");
        ReportsOneLevel.setCode("");
        
        final List<ReportsOneLevel> items = new ArrayList<>();
        items.add(ReportsOneLevel); //Add the empty model
        
        ReportsOneLevel = new ReportsOneLevel();
        ReportsOneLevel.setValue("Compras");
        ReportsOneLevel.setCode("COMPRAS");
        items.add(ReportsOneLevel);
        
        ReportsOneLevel = new ReportsOneLevel();
        ReportsOneLevel.setValue("Ventas");
        ReportsOneLevel.setCode("VENTAS");
        items.add(ReportsOneLevel);
        
        ReportsOneLevel = new ReportsOneLevel();
        ReportsOneLevel.setValue("Usuarios");
        ReportsOneLevel.setCode("USUARIOS");
        items.add(ReportsOneLevel);
        
        ReportsOneLevel = new ReportsOneLevel();
        ReportsOneLevel.setValue("Respaldos");
        ReportsOneLevel.setCode("RESPALDOS");
        items.add(ReportsOneLevel);
                
        ReportsOneLevel = new ReportsOneLevel();
        ReportsOneLevel.setValue("Almacen");
        ReportsOneLevel.setCode("ALMACEN");
        items.add(ReportsOneLevel);
        
        ReportsOneLevel = new ReportsOneLevel();
        ReportsOneLevel.setValue("Productos");
        ReportsOneLevel.setCode("PRODUCTOS");
        items.add(ReportsOneLevel);
        
        return items;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final ReportsOneLevel BanksItem = (ReportsOneLevel)ObjectItem;
        final ReportsOneLevel BanksMethod = (ReportsOneLevel)ObjectMethod;
        
        boolean  found = false;        
        if(BanksItem.getValue() != null && BanksItem.getValue().compareTo(BanksMethod.getValue())==0){
            found = true;
        }
        
        return found;
    }
}
