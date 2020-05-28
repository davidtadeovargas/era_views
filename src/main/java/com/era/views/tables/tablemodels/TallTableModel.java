package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tall;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class TallTableModel  extends BaseAbstractTableModel {

   public TallTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tall Tall = (Tall) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getCOD().getValue())==0){
               returnValue = Tall.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Tall.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getESTAC().getValue())==0){
               returnValue = Tall.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getFALT().getValue())==0){
               returnValue = Tall.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getFMOD().getValue())==0){
               returnValue = Tall.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Tall.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallsTableHeader().getSUCU().getValue())==0){
               returnValue = Tall.getSucu();
           }
           return returnValue;
       };
   }
}