package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Responsable;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ResponsableTableModel  extends BaseAbstractTableModel {

   public ResponsableTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Responsable Responsable = (Responsable) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getCODE().getValue())==0){
               returnValue = Responsable.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getDESCRIP().getValue())==0){
               returnValue = Responsable.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getESTAC().getValue())==0){
               returnValue = Responsable.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getFALT().getValue())==0){
               returnValue = Responsable.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getFMOD().getValue())==0){
               returnValue = Responsable.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getNOCAJ().getValue())==0){
               returnValue = Responsable.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getResponsablesTableHeader().getSUCU().getValue())==0){
               returnValue = Responsable.getSucu();
           }
           return returnValue;
       };
   }
}