package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Measure;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class MeasureTableModel  extends BaseAbstractTableModel {

   public MeasureTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Measure Measure = (Measure) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = Measure.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getCODE().getValue())==0){
               returnValue = Measure.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Measure.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getFALT().getValue())==0){
               returnValue = Measure.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getFMOD().getValue())==0){
               returnValue = Measure.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getSTATION().getValue())==0){
               returnValue = Measure.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Measure.getSucursal();
           }
           return returnValue;
       };
   }
}