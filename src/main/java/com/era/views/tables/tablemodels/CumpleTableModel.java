package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Cumple;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CumpleTableModel  extends BaseAbstractTableModel {

   public CumpleTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Cumple Cumple = (Cumple) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getA().getValue())==0){
               returnValue = Cumple.getA();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getANIO().getValue())==0){
               returnValue = Cumple.getAnio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getCODEMP().getValue())==0){
               returnValue = Cumple.getCodemp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getDE().getValue())==0){
               returnValue = Cumple.getDe();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getESTAD().getValue())==0){
               returnValue = Cumple.isEstad()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getFALT().getValue())==0){
               returnValue = Cumple.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getFCUMPLE().getValue())==0){
               returnValue = Cumple.getFcumple();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getFHOY().getValue())==0){
               returnValue = Cumple.getFhoy().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getFMOD().getValue())==0){
               returnValue = Cumple.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getNOCAJ().getValue())==0){
               returnValue = Cumple.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getSER().getValue())==0){
               returnValue = Cumple.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getSUCU().getValue())==0){
               returnValue = Cumple.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCumplesTableHeader().getUSUARIO().getValue())==0){
               returnValue = Cumple.getUsuario();
           }
           return returnValue;
       };
   }
}