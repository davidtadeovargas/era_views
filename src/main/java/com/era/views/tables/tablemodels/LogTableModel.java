package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Log;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class LogTableModel  extends BaseAbstractTableModel {

   public LogTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Log Log = (Log) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getACCIO().getValue())==0){
               returnValue = Log.getAccio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getCODE().getValue())==0){
               returnValue = Log.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Log.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getESTAC().getValue())==0){
               returnValue = Log.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getFALT().getValue())==0){
               returnValue = Log.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getFMOD().getValue())==0){
               returnValue = Log.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Log.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getSUCU().getValue())==0){
               returnValue = Log.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLogsTableHeader().getTYPE().getValue())==0){
               returnValue = Log.getType();
           }
           return returnValue;
       };
   }
}