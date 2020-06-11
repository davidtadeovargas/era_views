/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.Supplier;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class SuppliersIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final Supplier Supplier = (Supplier) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCODE().getValue())==0){
            returnValue = Supplier.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getNAME().getValue())==0){
            returnValue = Supplier.getName();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getRFC().getValue())==0){
            returnValue = Supplier.getRfc();
        }
        
        return returnValue;
    }    
}
