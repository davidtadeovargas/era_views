package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Conceppag;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ConceppagTableModel  extends BaseAbstractTableModel {

   public ConceppagTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Conceppag Conceppag = (Conceppag) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getCONCEP().getValue())==0){
               returnValue = Conceppag.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Conceppag.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getESTAC().getValue())==0){
               returnValue = Conceppag.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getFALT().getValue())==0){
               returnValue = Conceppag.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getFMOD().getValue())==0){
               returnValue = Conceppag.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Conceppag.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConceppagsTableHeader().getSUCU().getValue())==0){
               returnValue = Conceppag.getSucu();
           }
           return returnValue;
       };
   }
}