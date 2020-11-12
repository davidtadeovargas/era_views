/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.CCountry;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class CountriesAbstractTableModel extends BaseAbstractTableModel {

    public CountriesAbstractTableModel(final JTable jTable, List<CCountry> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final CCountry CCountry = (CCountry) this.items.get(rowIndex);
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = CCountry.getCode();
        }
        else if(columnIndex==1){            
            returnValue = CCountry.getDescription();
        }
        else if(columnIndex==2){
            returnValue = CCountry.getFalt().toString();
        }
        
        return returnValue;
    }
}
