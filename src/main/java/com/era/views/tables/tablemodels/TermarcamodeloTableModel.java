package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Termarcamodelo;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class TermarcamodeloTableModel  extends BaseAbstractTableModel {

   public TermarcamodeloTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Termarcamodelo Termarcamodelo = (Termarcamodelo) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getESTAC().getValue())==0){
               returnValue = Termarcamodelo.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getFALT().getValue())==0){
               returnValue = Termarcamodelo.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getFMOD().getValue())==0){
               returnValue = Termarcamodelo.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getMARC().getValue())==0){
               returnValue = Termarcamodelo.getMarc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getMODEL().getValue())==0){
               returnValue = Termarcamodelo.getModel();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getNOCAJ().getValue())==0){
               returnValue = Termarcamodelo.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTermarcamodelosTableHeader().getSUCU().getValue())==0){
               returnValue = Termarcamodelo.getSucu();
           }
           return returnValue;
       };
   }
}