package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Consec;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ConsecTableModel  extends BaseAbstractTableModel {

   public ConsecTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Consec Consec = (Consec) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = Consec.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getCONSEC().getValue())==0){
               returnValue = String.valueOf(Consec.getConsec());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Consec.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getFALT().getValue())==0){
               returnValue = Consec.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getFMOD().getValue())==0){
               returnValue = Consec.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getSERIE().getValue())==0){
               returnValue = Consec.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getSTATION().getValue())==0){
               returnValue = Consec.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Consec.getSucursal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConsecsTableHeader().getTYPE().getValue())==0){
               returnValue = Consec.getType();
           }
           return returnValue;
       };
   }
}