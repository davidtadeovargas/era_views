/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public abstract class BaseAbstractTableModel extends AbstractTableModel{
 
    protected List<?> items = new ArrayList<>();
    protected String[] header;
    
    
    
    public BaseAbstractTableModel(List<?> items, String[] header) {
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
        return this.items.get(rowIndex);
    }
    
    @Override
    public String getColumnName(int col) {
        return this.header[col];
    }
    
    @Override
    public int getColumnCount() {
        return this.header.length;
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
}
