/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.views.tables.headers.ColumnTable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public abstract class BaseAbstractTableModel extends AbstractTableModel{
 
    protected List<?> items = new ArrayList<>();
    protected List<ColumnTable> header;
    protected GetValueAt GetValueAt;
    
    
    
    public BaseAbstractTableModel(final List<?> items, final List<ColumnTable> header) {
        this.header = header;
        this.items = items;        
    }
    
    public void clearRows(){
                
        items.clear();
        this.fireTableDataChanged();
    }

    public void setItems(List<?> items) {
        this.items = items;
        this.fireTableDataChanged();
    }
        
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final ColumnTable ColumnTable = this.header.get(columnIndex);
        final String value = ColumnTable.getValue();
        final Object Object = this.items.get(rowIndex);  
        
        if(GetValueAt != null){
            return GetValueAt.getValueAt(rowIndex, columnIndex, value, Object);
        }
        else{
            return "";
        }
    }
    
    @Override
    public String getColumnName(int col) {
        return this.header.get(col).getValue();
    }
    
    @Override
    public int getColumnCount() {
        return this.header.size();
    }
    
    final public Object getItem(int rowIndex){
        return this.items.get(rowIndex);
    }

    public List<?> getItems() {
        return items;
    }
        
    
    final public void removeRow(int rowIndex){
        this.items.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return items.size();
    }
    
    public interface GetValueAt{        
        public Object getValueAt(int rowIndex, int columnIndex, final String valueColumn, final Object model);
    }
}
