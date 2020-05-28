package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Concepnot;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ConcepnotTableModel  extends BaseAbstractTableModel {

   public ConcepnotTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Concepnot Concepnot = (Concepnot) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getCONCEP().getValue())==0){
               returnValue = Concepnot.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Concepnot.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getESTAC().getValue())==0){
               returnValue = Concepnot.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getFALT().getValue())==0){
               returnValue = Concepnot.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getFMOD().getValue())==0){
               returnValue = Concepnot.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Concepnot.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepnotsTableHeader().getSUCU().getValue())==0){
               returnValue = Concepnot.getSucu();
           }
           return returnValue;
       };
   }
}