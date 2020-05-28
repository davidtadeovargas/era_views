package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Clasemp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ClasempTableModel  extends BaseAbstractTableModel {

   public ClasempTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Clasemp Clasemp = (Clasemp) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getCOD().getValue())==0){
               returnValue = Clasemp.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Clasemp.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getESTAC().getValue())==0){
               returnValue = Clasemp.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getFALT().getValue())==0){
               returnValue = Clasemp.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getFMOD().getValue())==0){
               returnValue = Clasemp.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Clasemp.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasempsTableHeader().getSUCU().getValue())==0){
               returnValue = Clasemp.getSucu();
           }
           return returnValue;
       };
   }
}