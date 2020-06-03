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
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getCODE().getValue())==0){
               returnValue = Line.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Line.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getESTAC().getValue())==0){
               returnValue = Line.getEstac();
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
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getNOCAJ().getValue())==0){
               returnValue = Line.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLinesTableHeader().getSUCU().getValue())==0){
               returnValue = Line.getSucu();
           }
           return returnValue;
       };
   }
}