package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Marcs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class MarcsTableModel  extends BaseAbstractTableModel {

   public MarcsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Marcs Marcs = (Marcs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getCOD().getValue())==0){
               returnValue = Marcs.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Marcs.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getESTAC().getValue())==0){
               returnValue = Marcs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getFALT().getValue())==0){
               returnValue = Marcs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getFMOD().getValue())==0){
               returnValue = Marcs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Marcs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcssTableHeader().getSUCU().getValue())==0){
               returnValue = Marcs.getSucu();
           }
           return returnValue;
       };
   }
}