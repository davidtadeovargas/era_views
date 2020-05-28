package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Conceps;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ConcepsTableModel  extends BaseAbstractTableModel {

   public ConcepsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Conceps Conceps = (Conceps) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getCONCEP().getValue())==0){
               returnValue = Conceps.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Conceps.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getESTAC().getValue())==0){
               returnValue = Conceps.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getFALT().getValue())==0){
               returnValue = Conceps.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getFMOD().getValue())==0){
               returnValue = Conceps.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Conceps.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getSUCU().getValue())==0){
               returnValue = Conceps.getSucu();
           }
           return returnValue;
       };
   }
}