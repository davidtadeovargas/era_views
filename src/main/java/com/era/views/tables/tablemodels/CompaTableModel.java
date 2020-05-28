package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Compa;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CompaTableModel  extends BaseAbstractTableModel {

   public CompaTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Compa Compa = (Compa) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getCOMPA().getValue())==0){
               returnValue = Compa.getCompa();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getESTAC().getValue())==0){
               returnValue = Compa.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getFALT().getValue())==0){
               returnValue = Compa.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getFMOD().getValue())==0){
               returnValue = Compa.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getNOCAJ().getValue())==0){
               returnValue = Compa.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getPROD().getValue())==0){
               returnValue = Compa.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompasTableHeader().getSUCU().getValue())==0){
               returnValue = Compa.getSucu();
           }
           return returnValue;
       };
   }
}