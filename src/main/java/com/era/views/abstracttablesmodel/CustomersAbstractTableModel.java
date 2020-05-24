/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.Company;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;

/**
 *
 * @author PC
 */
public class CustomersAbstractTableModel extends BaseAbstractTableModel {

    public CustomersAbstractTableModel(List<Company> deliveries, List<ColumnTable> header) {
        super(deliveries,header);
    }
}
