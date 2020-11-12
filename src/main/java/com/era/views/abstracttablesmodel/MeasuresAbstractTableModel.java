/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Measure;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class MeasuresAbstractTableModel extends BaseAbstractTableModel {

    public MeasuresAbstractTableModel(final JTable jTable, List<Measure> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);        
    }
}
