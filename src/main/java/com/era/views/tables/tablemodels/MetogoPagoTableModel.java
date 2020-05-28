package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.MetogoPago;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class MetogoPagoTableModel  extends BaseAbstractTableModel {

   public MetogoPagoTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final MetogoPago MetogoPago = (MetogoPago) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getCHASNUMBER().getValue())==0){
               returnValue = MetogoPago.getChasNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getCODE().getValue())==0){
               returnValue = MetogoPago.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = MetogoPago.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getFALT().getValue())==0){
               returnValue = MetogoPago.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getFMOD().getValue())==0){
               returnValue = MetogoPago.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getSTATION().getValue())==0){
               returnValue = MetogoPago.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getSUCURSAL().getValue())==0){
               returnValue = MetogoPago.getSucursal();
           }
           return returnValue;
       };
   }
}