package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Resp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class RespTableModel  extends BaseAbstractTableModel {

   public RespTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Resp Resp = (Resp) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getESTAC().getValue())==0){
               returnValue = Resp.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getESTACRES().getValue())==0){
               returnValue = Resp.getEstacres();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getFALT().getValue())==0){
               returnValue = Resp.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getFMOD().getValue())==0){
               returnValue = Resp.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getHRS().getValue())==0){
               returnValue = String.valueOf(Resp.getHrs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Resp.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRespsTableHeader().getSUCU().getValue())==0){
               returnValue = Resp.getSucu();
           }
           return returnValue;
       };
   }
}