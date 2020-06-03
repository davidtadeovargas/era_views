package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Sucursal;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class SucursalTableModel  extends BaseAbstractTableModel {

   public SucursalTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Sucursal Sucursal = (Sucursal) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getCODZONA().getValue())==0){
               returnValue = Sucursal.getCodZona();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getCODE().getValue())==0){
               returnValue = Sucursal.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Sucursal.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getESTAC().getValue())==0){
               returnValue = Sucursal.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getFALT().getValue())==0){
               returnValue = Sucursal.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getFMOD().getValue())==0){
               returnValue = Sucursal.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Sucursal.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSucursalsTableHeader().getSUCU().getValue())==0){
               returnValue = Sucursal.getSucu();
           }
           return returnValue;
       };
   }
}