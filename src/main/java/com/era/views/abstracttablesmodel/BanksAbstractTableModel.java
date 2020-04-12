/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Banco;
import java.util.List;

/**
 *
 * @author PC
 */
public class BanksAbstractTableModel extends BaseAbstractTableModel {

    public BanksAbstractTableModel(List<Banco> deliveries, String[] header) {
        super(deliveries,header);        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.items.get(rowIndex);
    }
}
