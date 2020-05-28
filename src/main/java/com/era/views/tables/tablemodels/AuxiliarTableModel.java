package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Auxiliar;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class AuxiliarTableModel  extends BaseAbstractTableModel {

   public AuxiliarTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Auxiliar Auxiliar = (Auxiliar) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getESTAC().getValue())==0){
               returnValue = Auxiliar.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getFALT().getValue())==0){
               returnValue = Auxiliar.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getFMOD().getValue())==0){
               returnValue = Auxiliar.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Auxiliar.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getPARTIDA().getValue())==0){
               returnValue = String.valueOf(Auxiliar.getPartida());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getSUCU().getValue())==0){
               returnValue = Auxiliar.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAuxiliarsTableHeader().getVENTA().getValue())==0){
               returnValue = String.valueOf(Auxiliar.getVenta());
           }
           return returnValue;
       };
   }
}