package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Msjs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class MsjsTableModel  extends BaseAbstractTableModel {

   public MsjsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Msjs Msjs = (Msjs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMsjssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMsjssTableHeader().getESTAC().getValue())==0){
               returnValue = Msjs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMsjssTableHeader().getFALT().getValue())==0){
               returnValue = Msjs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMsjssTableHeader().getFMOD().getValue())==0){
               returnValue = Msjs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMsjssTableHeader().getMSJ().getValue())==0){
               returnValue = Msjs.getMsj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMsjssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Msjs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMsjssTableHeader().getSUCU().getValue())==0){
               returnValue = Msjs.getSucu();
           }
           return returnValue;
       };
   }
}