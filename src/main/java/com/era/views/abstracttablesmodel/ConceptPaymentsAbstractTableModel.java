/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Conceppag;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class ConceptPaymentsAbstractTableModel extends BaseAbstractTableModel {

    public ConceptPaymentsAbstractTableModel(final JTable jTable, List<Conceppag> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);
    }
}
