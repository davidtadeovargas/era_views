package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Existalma;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ExistalmaTableModel  extends BaseAbstractTableModel {

   public ExistalmaTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Existalma Existalma = (Existalma) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getALMA().getValue())==0){
               returnValue = Existalma.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getESTAC().getValue())==0){
               returnValue = Existalma.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getEXIST().getValue())==0){
               returnValue = String.valueOf(Existalma.getExist());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getFALT().getValue())==0){
               returnValue = Existalma.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getFMOD().getValue())==0){
               returnValue = Existalma.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getNOCAJ().getValue())==0){
               returnValue = Existalma.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getPROD().getValue())==0){
               returnValue = Existalma.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getExistalmasTableHeader().getSUCU().getValue())==0){
               returnValue = Existalma.getSucu();
           }
           return returnValue;
       };
   }
}