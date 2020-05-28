package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Clasjeraprov;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ClasjeraprovTableModel  extends BaseAbstractTableModel {

   public ClasjeraprovTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Clasjeraprov Clasjeraprov = (Clasjeraprov) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getCLAS().getValue())==0){
               returnValue = Clasjeraprov.getClas();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getESTAC().getValue())==0){
               returnValue = Clasjeraprov.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getFALT().getValue())==0){
               returnValue = Clasjeraprov.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getFMOD().getValue())==0){
               returnValue = Clasjeraprov.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Clasjeraprov.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getRUT().getValue())==0){
               returnValue = Clasjeraprov.getRut();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprovsTableHeader().getSUCU().getValue())==0){
               returnValue = Clasjeraprov.getSucu();
           }
           return returnValue;
       };
   }
}