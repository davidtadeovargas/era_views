/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Pes;
import com.era.views.tables.headers.ColumnTable;
import javax.swing.JTable;
import java.util.List;

/**
 *
 * @author PC
 */
public class WeightsAbstractTableModel extends BaseAbstractTableModel {

    public WeightsAbstractTableModel(final JTable jTable, List<Pes> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);
    }
}
