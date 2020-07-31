/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.repositories.models.ProductPriceListModel;
import com.era.utilities.UtilitiesFactory;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class ProductPriceListTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
                
        final ProductPriceListModel ProductPriceListModel = (ProductPriceListModel) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductPriceListTableHeader().getROWNUMBER().getValue())==0){
           returnValue = String.valueOf(rowIndex + 1);
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductPriceListTableHeader().getCODE().getValue())==0){
            returnValue = ProductPriceListModel.getProductCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductPriceListTableHeader().getLIST().getValue())==0){
            returnValue = String.valueOf(ProductPriceListModel.getPriceList());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProductPriceListTableHeader().getPRICE().getValue())==0){
           final String price = UtilitiesFactory.getSingleton().getNumbersUtility().toMoneyFormat(ProductPriceListModel.getPrice());
           returnValue = price;
        }
            
        return returnValue;
    }
}
