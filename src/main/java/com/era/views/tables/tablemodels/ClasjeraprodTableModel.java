package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Clasjeraprod;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ClasjeraprodTableModel  extends BaseAbstractTableModel {

   public ClasjeraprodTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Clasjeraprod Clasjeraprod = (Clasjeraprod) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getCLAS().getValue())==0){
               returnValue = Clasjeraprod.getClas();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getESTAC().getValue())==0){
               returnValue = Clasjeraprod.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getFALT().getValue())==0){
               returnValue = Clasjeraprod.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getFMOD().getValue())==0){
               returnValue = Clasjeraprod.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Clasjeraprod.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getRUT().getValue())==0){
               returnValue = Clasjeraprod.getRut();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraprodsTableHeader().getSUCU().getValue())==0){
               returnValue = Clasjeraprod.getSucu();
           }
           return returnValue;
       };
   }
}