/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Serie;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class SeriesAbstractTableModel extends BaseAbstractTableModel {

    public SeriesAbstractTableModel(final JTable jTable, List<Serie> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);        
    }
}
