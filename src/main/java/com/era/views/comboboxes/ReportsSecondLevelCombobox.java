/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.views.comboboxes.cellrenders.ReportsSecondLevelCellRender;
import com.era.views.comboboxes.models.ReportsSecondLevel;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class ReportsSecondLevelCombobox extends BaseComboBox<ReportsSecondLevel> {
    
    public ReportsSecondLevelCombobox(){
        super(new ReportsSecondLevelCellRender());
    }
    
    @Override
    List<ReportsSecondLevel> getItems() throws Exception {        
        return null;
    }
    
    public void loadProductosItems() throws Exception {        
        
        final List<ReportsSecondLevel> items = new ArrayList<>();
        
        ReportsSecondLevel ReportsSecondLevel = new ReportsSecondLevel();
        ReportsSecondLevel.setValue("");
        items.add(ReportsSecondLevel);
        
        ReportsSecondLevel = new ReportsSecondLevel();
        ReportsSecondLevel.setCode("PRODUPMAX");
        ReportsSecondLevel.setValue("Productos arriba del máximo");
        items.add(ReportsSecondLevel);
        
        ReportsSecondLevel = new ReportsSecondLevel();
        ReportsSecondLevel.setCode("PRODDOWNMIN");
        ReportsSecondLevel.setValue("Productos abajo del máximo");
        items.add(ReportsSecondLevel);
        
        this.loadItems(items);
    }
    
    public void loadComprasItems() throws Exception {        
        
        final List<ReportsSecondLevel> items = new ArrayList<>();
        this.loadItems(items);
    }
    
    public void loadVentasItems() throws Exception {        
        
        final List<ReportsSecondLevel> items = new ArrayList<>();
        
        ReportsSecondLevel ReportsSecondLevel = new ReportsSecondLevel();
        ReportsSecondLevel.setCode("CLIENTES");
        ReportsSecondLevel.setValue("Reporte de clientes");
        items.add(ReportsSecondLevel);
        
        this.loadItems(items);
    }
    
    public void loadUsuariosItems() throws Exception {        
        
        final List<ReportsSecondLevel> items = new ArrayList<>();
        this.loadItems(items);
    }
    
    public void loadRespaldosItems() throws Exception {        
        
        final List<ReportsSecondLevel> items = new ArrayList<>();
        this.loadItems(items);
    }
    
    public void loadAlmacenItems() throws Exception {        
        
        final List<ReportsSecondLevel> items = new ArrayList<>();
        this.loadItems(items);
    }
        
    public void loadInventariosItems() throws Exception {        
        
        final List<ReportsSecondLevel> items = new ArrayList<>();
        
        ReportsSecondLevel ReportsSecondLevel = new ReportsSecondLevel();
        ReportsSecondLevel.setCode("ALMAS");
        ReportsSecondLevel.setValue("Almacenes");
        items.add(ReportsSecondLevel);
        
        this.loadItems(items);
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final ReportsSecondLevel BanksItem = (ReportsSecondLevel)ObjectItem;
        final ReportsSecondLevel BanksMethod = (ReportsSecondLevel)ObjectMethod;
        
        boolean  found = false;        
        if(BanksItem.getValue() != null && BanksItem.getValue().compareTo(BanksMethod.getValue())==0){
            found = true;
        }
        
        return found;
    }
}
