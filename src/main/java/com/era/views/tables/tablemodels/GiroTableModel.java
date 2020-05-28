package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Giro;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class GiroTableModel  extends BaseAbstractTableModel {

   public GiroTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Giro Giro = (Giro) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getDESCRIP().getValue())==0){
               returnValue = Giro.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getESTAC().getValue())==0){
               returnValue = Giro.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getFALT().getValue())==0){
               returnValue = Giro.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getFMOD().getValue())==0){
               returnValue = Giro.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getGIR().getValue())==0){
               returnValue = Giro.getGir();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getNOCAJ().getValue())==0){
               returnValue = Giro.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getSUCU().getValue())==0){
               returnValue = Giro.getSucu();
           }
           return returnValue;
       };
   }
}