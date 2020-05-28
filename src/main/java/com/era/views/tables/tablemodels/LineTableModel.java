package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Line;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class LineTableModel  extends BaseAbstractTableModel {

   public LineTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Line Line = (Line) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = Line.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getCODE().getValue())==0){
               returnValue = Line.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Line.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getFALT().getValue())==0){
               returnValue = Line.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getFMOD().getValue())==0){
               returnValue = Line.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getIMAGE().getValue())==0){
               returnValue = Line.getImage();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getSTATION().getValue())==0){
               returnValue = Line.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Line.getSucursal();
           }
           return returnValue;
       };
   }
}