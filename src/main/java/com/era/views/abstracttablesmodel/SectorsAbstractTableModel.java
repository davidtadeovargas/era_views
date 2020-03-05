/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Sectores;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class SectorsAbstractTableModel extends AbstractTableModel {

    private List<Sectores> deliveries;
    private String[] header;
    
    public SectorsAbstractTableModel(List<Sectores> deliveries, String[] header) {
        this.header = header;
        this.deliveries = deliveries;        
    }
    
    @Override
    public int getRowCount() {
        return deliveries.size();
    }

    @Override
    public int getColumnCount() {
        return this.header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.deliveries.get(rowIndex);
    }
    
    final public Sectores getModel(int rowIndex){
        return this.deliveries.get(rowIndex);
    }
    
    final public void removeRow(int rowIndex){
        this.deliveries.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
