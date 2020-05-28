package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Zona;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ZonaTableModel  extends BaseAbstractTableModel {

   public ZonaTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Zona Zona = (Zona) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getCOD().getValue())==0){
               returnValue = Zona.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getDESCRIP().getValue())==0){
               returnValue = Zona.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getESTAC().getValue())==0){
               returnValue = Zona.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getFALT().getValue())==0){
               returnValue = Zona.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getFMOD().getValue())==0){
               returnValue = Zona.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getNOCAJ().getValue())==0){
               returnValue = Zona.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getSUCU().getValue())==0){
               returnValue = Zona.getSucu();
           }
           return returnValue;
       };
   }
}