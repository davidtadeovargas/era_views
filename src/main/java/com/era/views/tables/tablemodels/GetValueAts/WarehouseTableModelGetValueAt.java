/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Warehouse;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class WarehouseTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final Warehouse Warehouse = (Warehouse) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getADDRESS1().getValue())==0){
            returnValue = Warehouse.getAddress1();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getADDRESS2().getValue())==0){
            returnValue = Warehouse.getAddress2();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getADDRESS3().getValue())==0){
            returnValue = Warehouse.getAddress3();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getCODE().getValue())==0){
            returnValue = Warehouse.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = Warehouse.getDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getESTAC().getValue())==0){
            returnValue = Warehouse.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getFALT().getValue())==0){
            returnValue = Warehouse.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getFMOD().getValue())==0){
            returnValue = Warehouse.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getNOCAJ().getValue())==0){
            returnValue = Warehouse.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getRESPONSABLE().getValue())==0){
            returnValue = Warehouse.getResponsable();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getSUCU().getValue())==0){
            returnValue = Warehouse.getSucu();
        }
        return returnValue;
    }
}
