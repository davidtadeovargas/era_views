/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.views.tables.tablemodels.EmpresasTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class EmpresasTable extends BaseJTable {
    
    public EmpresasTable(){     
        super();
    }

    @Override
    public void initTable(List<?> items) {
        
        final EmpresasTableModel EmpresasTableModel = new EmpresasTableModel(items,this.ShowColumns);
        this.setModel(EmpresasTableModel);
    }
}
