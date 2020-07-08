package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.MetogoPago;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class MetogoPagoTableModel  extends BaseAbstractTableModel {

   public MetogoPagoTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final MetogoPago MetogoPago = (MetogoPago) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getCODE().getValue())==0){
               returnValue = MetogoPago.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = MetogoPago.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getESTAC().getValue())==0){
               returnValue = MetogoPago.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getFALT().getValue())==0){
               returnValue = MetogoPago.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getFMOD().getValue())==0){
               returnValue = MetogoPago.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getNOCAJ().getValue())==0){
               returnValue = MetogoPago.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMetogoPagosTableHeader().getSUCU().getValue())==0){
               returnValue = MetogoPago.getSucu();
           }
           return returnValue;
       };
   }
}