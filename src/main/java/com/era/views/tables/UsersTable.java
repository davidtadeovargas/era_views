/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.views.tables.tablemodels.UsersTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class UsersTable extends BaseJTable {
    
    public UsersTable(){     
        super();
    }

    @Override
    public void initTable(List<?> items) {
        final UsersTableModel UsersTableModel = new UsersTableModel(items,this.ShowColumns);
        this.setModel(UsersTableModel);
    }
}
