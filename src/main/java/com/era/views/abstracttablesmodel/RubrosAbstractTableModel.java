/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Rubr;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class RubrosAbstractTableModel extends BaseAbstractTableModel {

    public RubrosAbstractTableModel(final JTable jTable, List<Rubr> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);
    }
}
