/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.BasDats;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class BasDatsAbstractTableModel extends AbstractTableModel {

    private final List<BasDats> deliveries;
    private final String[] headers;
    
    public BasDatsAbstractTableModel(List<BasDats> deliveries, String[] headers) {
        this.headers = headers;
        this.deliveries = deliveries;        
    }
    
    @Override
    public int getRowCount() {
        return deliveries.size();
    }
    
    @Override
    public String getColumnName(int col) {
        return headers[col];
    }

    @Override
    public int getColumnCount() {
        return this.headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final BasDats BasDats = this.deliveries.get(rowIndex);
        
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
    
    final public BasDats getModel(int rowIndex){
        return this.deliveries.get(rowIndex);
    }
    
    final public void removeRow(int rowIndex){
        this.deliveries.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
