package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Colos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ColosTableModel  extends BaseAbstractTableModel {

   public ColosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Colos Colos = (Colos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getCOD().getValue())==0){
               returnValue = Colos.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getDESCRIP().getValue())==0){
               returnValue = Colos.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getESTAC().getValue())==0){
               returnValue = Colos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getFALT().getValue())==0){
               returnValue = Colos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getFMOD().getValue())==0){
               returnValue = Colos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getNOCAJ().getValue())==0){
               returnValue = Colos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getColossTableHeader().getSUCU().getValue())==0){
               returnValue = Colos.getSucu();
           }
           return returnValue;
       };
   }
}