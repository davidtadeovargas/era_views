package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Clasprov;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ClasprovTableModel  extends BaseAbstractTableModel {

   public ClasprovTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Clasprov Clasprov = (Clasprov) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getCOD().getValue())==0){
               returnValue = Clasprov.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Clasprov.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getESTAC().getValue())==0){
               returnValue = Clasprov.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getFALT().getValue())==0){
               returnValue = Clasprov.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getFMOD().getValue())==0){
               returnValue = Clasprov.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Clasprov.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasprovsTableHeader().getSUCU().getValue())==0){
               returnValue = Clasprov.getSucu();
           }
           return returnValue;
       };
   }
}