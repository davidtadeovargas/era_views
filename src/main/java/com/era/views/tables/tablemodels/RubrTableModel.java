package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Rubr;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class RubrTableModel  extends BaseAbstractTableModel {

   public RubrTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Rubr Rubr = (Rubr) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getCODE().getValue())==0){
               returnValue = Rubr.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Rubr.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getESTAC().getValue())==0){
               returnValue = Rubr.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getFALT().getValue())==0){
               returnValue = Rubr.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getFMOD().getValue())==0){
               returnValue = Rubr.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Rubr.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRubrsTableHeader().getSUCU().getValue())==0){
               returnValue = Rubr.getSucu();
           }
           return returnValue;
       };
   }
}