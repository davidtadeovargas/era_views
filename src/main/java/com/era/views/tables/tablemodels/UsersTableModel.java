/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels;

import com.era.models.User;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class UsersTableModel extends BaseAbstractTableModel {
    
    public UsersTableModel(List<?> items, String[] header) {
        super(items,header);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final User User = (User) this.items.get(rowIndex);
        
        String returnValue = "undefined";
        if (columnIndex == 0) {
           returnValue = String.valueOf(rowIndex + 1);
        }
        else if (columnIndex == 1) {
           returnValue = User.getStation();
        }
        else if (columnIndex == 2) {
           returnValue = User.getName();
        }
        return returnValue;
    }
}
