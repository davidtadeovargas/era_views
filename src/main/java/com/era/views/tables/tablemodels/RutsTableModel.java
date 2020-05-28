package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Ruts;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class RutsTableModel  extends BaseAbstractTableModel {

   public RutsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Ruts Ruts = (Ruts) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getESTAC().getValue())==0){
               returnValue = Ruts.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getFALT().getValue())==0){
               returnValue = Ruts.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getFMOD().getValue())==0){
               returnValue = Ruts.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Ruts.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getNOM().getValue())==0){
               returnValue = Ruts.getNom();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getPROGRAM().getValue())==0){
               returnValue = Ruts.getProgram();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getRUT().getValue())==0){
               returnValue = Ruts.getRut();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRutssTableHeader().getSUCU().getValue())==0){
               returnValue = Ruts.getSucu();
           }
           return returnValue;
       };
   }
}