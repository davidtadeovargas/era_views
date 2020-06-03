/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Warehouse;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;

/**
 *
 * @author PC
 */
public class WarehousesAbstractTableModel extends BaseAbstractTableModel {

    public WarehousesAbstractTableModel(List<Warehouse> deliveries, List<ColumnTable> header) {
        super(deliveries,header);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final Warehouse Warehouse = (Warehouse) this.items.get(rowIndex);
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = Warehouse.getCode();
        }
        else if(columnIndex==1){            
            returnValue = Warehouse.getDescription();
        }
        else if(columnIndex==2){
            returnValue = Warehouse.getResponsable();
        }
        
        return returnValue;
    }
}
