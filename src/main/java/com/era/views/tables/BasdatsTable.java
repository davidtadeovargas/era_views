/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.views.tables.tablemodels.BasdatsTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class BasdatsTable extends BaseJTable {
    
    public BasdatsTable(){
        super();
    }   
    
    @Override
    public void initTable(final List<?> items) {
        
        final BasdatsTableModel BasdatsTableModel = new BasdatsTableModel(items,this.ShowColumns);
        this.setModel(BasdatsTableModel);
    }
}
