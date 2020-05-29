/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.User;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class UsersIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final User User = (User) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getCODE().getValue())==0){
            returnValue = User.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getNAME().getValue())==0){
            returnValue = User.getName();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsersTableHeader().getEMAIL().getValue())==0){
            returnValue = User.getEmail();
        }
        
        return returnValue;
    }    
}
