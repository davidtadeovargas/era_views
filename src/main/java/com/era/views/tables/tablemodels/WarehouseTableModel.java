package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Warehouse;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class WarehouseTableModel  extends BaseAbstractTableModel {

   public WarehouseTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

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
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = Warehouse.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getCODE().getValue())==0){
               returnValue = Warehouse.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Warehouse.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getFALT().getValue())==0){
               returnValue = Warehouse.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getFMOD().getValue())==0){
               returnValue = Warehouse.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getRESPONSIBLE().getValue())==0){
               returnValue = Warehouse.getResponsible();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getSTATION().getValue())==0){
               returnValue = Warehouse.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getWarehousesTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Warehouse.getSucursal();
           }
           return returnValue;
       };
   }
}