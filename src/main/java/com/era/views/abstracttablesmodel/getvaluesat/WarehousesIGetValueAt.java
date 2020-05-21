/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.Warehouse;

/**
 *
 * @author PC
 */
public class WarehousesIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object,int columnIndex) {
        
        final Warehouse Warehouse = (Warehouse) Object;
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = Warehouse.getCode();
        }
        else if(columnIndex==1){
            returnValue = Warehouse.getDescription();
        }
        else if(columnIndex==2){
            returnValue = Warehouse.getResponsible();
        }
        
        return returnValue;
    }    
}
