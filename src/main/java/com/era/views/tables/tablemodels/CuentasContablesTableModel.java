package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CuentasContables;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CuentasContablesTableModel  extends BaseAbstractTableModel {

   public CuentasContablesTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CuentasContables CuentasContables = (CuentasContables) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getCUENTA().getValue())==0){
               returnValue = CuentasContables.getCuenta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getDESCRIP().getValue())==0){
               returnValue = CuentasContables.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getESTAC().getValue())==0){
               returnValue = CuentasContables.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getFALT().getValue())==0){
               returnValue = CuentasContables.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getFMOD().getValue())==0){
               returnValue = CuentasContables.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getNOCAJ().getValue())==0){
               returnValue = CuentasContables.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCuentasContablessTableHeader().getSUCU().getValue())==0){
               returnValue = CuentasContables.getSucu();
           }
           return returnValue;
       };
   }
}