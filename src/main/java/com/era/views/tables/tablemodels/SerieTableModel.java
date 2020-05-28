package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Serie;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class SerieTableModel  extends BaseAbstractTableModel {

   public SerieTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Serie Serie = (Serie) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = Serie.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getCONSECUTIVE().getValue())==0){
               returnValue = String.valueOf(Serie.getConsecutive());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Serie.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getESTATION().getValue())==0){
               returnValue = Serie.getEstation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getFALT().getValue())==0){
               returnValue = Serie.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getFMOD().getValue())==0){
               returnValue = Serie.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getSERIE().getValue())==0){
               returnValue = Serie.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Serie.getSucursal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getTYPE().getValue())==0){
               returnValue = Serie.getType();
           }
           return returnValue;
       };
   }
}