/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.views.tables.tablemodels.GetValueAts.UserTableModelGetValueAt;

/**
 *
 * @author PC
 */
public class UsersIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) throws Exception {
        return (String) new UserTableModelGetValueAt().GetValueAt(rowIndex, columnIndex, valueColumn, Object);
    }    
}
