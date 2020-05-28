package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Ubiad;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class UbiadTableModel  extends BaseAbstractTableModel {

   public UbiadTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Ubiad Ubiad = (Ubiad) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getCOD().getValue())==0){
               returnValue = Ubiad.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Ubiad.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getESTAC().getValue())==0){
               returnValue = Ubiad.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getFALT().getValue())==0){
               returnValue = Ubiad.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getFMOD().getValue())==0){
               returnValue = Ubiad.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Ubiad.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUbiadsTableHeader().getSUCU().getValue())==0){
               returnValue = Ubiad.getSucu();
           }
           return returnValue;
       };
   }
}