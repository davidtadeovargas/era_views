/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.views.tables.tablemodels.GetValueAts.ProductPriceListTableModelGetValueAt;

/**
 *
 * @author PC
 */
public class ProductPriceListIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, String valueColumn) throws Exception {
        return (String) new ProductPriceListTableModelGetValueAt().GetValueAt(rowIndex, columnIndex, valueColumn, Object);
    }
}