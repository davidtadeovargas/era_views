/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Almas;
import com.era.models.Kits;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class WarehousesAbstractTableModel extends AbstractTableModel {

    private List<Almas> deliveries;
    private String[] header;
    
    public WarehousesAbstractTableModel(List<Almas> deliveries, String[] header) {
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
    
    final public Almas getModel(int rowIndex){
        return this.deliveries.get(rowIndex);
    }
    
    final public void removeRow(int rowIndex){
        this.deliveries.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
