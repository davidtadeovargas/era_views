package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Grals;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class GralsTableModel  extends BaseAbstractTableModel {

   public GralsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Grals Grals = (Grals) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getCOD().getValue())==0){
               returnValue = Grals.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Grals.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getESTAC().getValue())==0){
               returnValue = Grals.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getFALT().getValue())==0){
               returnValue = Grals.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getFMOD().getValue())==0){
               returnValue = Grals.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Grals.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGralssTableHeader().getSUCU().getValue())==0){
               returnValue = Grals.getSucu();
           }
           return returnValue;
       };
   }
}