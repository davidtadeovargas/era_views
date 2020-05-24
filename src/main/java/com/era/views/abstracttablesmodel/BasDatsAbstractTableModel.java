/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.BasDats;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;

/**
 *
 * @author PC
 */
public class BasDatsAbstractTableModel extends BaseAbstractTableModel {

    public BasDatsAbstractTableModel(List<BasDats> deliveries, List<ColumnTable> headers) {
        super(deliveries,headers);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final BasDats BasDats = (BasDats) this.items.get(rowIndex);
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = BasDats.getBd();
        }
        else if(columnIndex==1){
            returnValue = BasDats.getNom();
        }
        else if(columnIndex==2){
            returnValue = BasDats.getCodemp();
        }
        
        return returnValue;
    }
}
