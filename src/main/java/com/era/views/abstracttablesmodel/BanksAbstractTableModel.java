/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Banco;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class BanksAbstractTableModel extends BaseAbstractTableModel {

    public BanksAbstractTableModel(final JTable jTable, List<Banco> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);        
    }
}
