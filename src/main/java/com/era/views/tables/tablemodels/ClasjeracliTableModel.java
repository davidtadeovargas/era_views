package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Clasjeracli;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ClasjeracliTableModel  extends BaseAbstractTableModel {

   public ClasjeracliTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Clasjeracli Clasjeracli = (Clasjeracli) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getCLAS().getValue())==0){
               returnValue = Clasjeracli.getClas();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getESTAC().getValue())==0){
               returnValue = Clasjeracli.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getFALT().getValue())==0){
               returnValue = Clasjeracli.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getFMOD().getValue())==0){
               returnValue = Clasjeracli.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getNOCAJ().getValue())==0){
               returnValue = Clasjeracli.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getRUT().getValue())==0){
               returnValue = Clasjeracli.getRut();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasjeraclisTableHeader().getSUCU().getValue())==0){
               returnValue = Clasjeracli.getSucu();
           }
           return returnValue;
       };
   }
}