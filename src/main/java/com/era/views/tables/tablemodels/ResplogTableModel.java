package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Resplog;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ResplogTableModel  extends BaseAbstractTableModel {

   public ResplogTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Resplog Resplog = (Resplog) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getESTAC().getValue())==0){
               returnValue = Resplog.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getFALT().getValue())==0){
               returnValue = Resplog.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getFMOD().getValue())==0){
               returnValue = Resplog.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getMSJ().getValue())==0){
               returnValue = Resplog.getMsj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Resplog.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getPATHA().getValue())==0){
               returnValue = Resplog.getPatha();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getPATHAMYSQ().getValue())==0){
               returnValue = Resplog.getPathamysq();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getPATHDE().getValue())==0){
               returnValue = Resplog.getPathde();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getPATHDEMYSQ().getValue())==0){
               returnValue = Resplog.getPathdemysq();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getRETURN_().getValue())==0){
               returnValue = String.valueOf(Resplog.getReturn_());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getSUCU().getValue())==0){
               returnValue = Resplog.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResplogsTableHeader().getTIP().getValue())==0){
               returnValue = Resplog.isTip()? "Si":"No";
           }
           return returnValue;
       };
   }
}