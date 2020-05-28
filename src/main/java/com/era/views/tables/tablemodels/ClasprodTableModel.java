package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Clasprod;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ClasprodTableModel  extends BaseAbstractTableModel {

   public ClasprodTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Clasprod Clasprod = (Clasprod) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getCOD().getValue())==0){
               returnValue = Clasprod.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Clasprod.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getESTAC().getValue())==0){
               returnValue = Clasprod.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getFALT().getValue())==0){
               returnValue = Clasprod.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getFMOD().getValue())==0){
               returnValue = Clasprod.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Clasprod.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprodsTableHeader().getSUCU().getValue())==0){
               returnValue = Clasprod.getSucu();
           }
           return returnValue;
       };
   }
}