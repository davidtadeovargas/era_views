package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tax;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class TaxTableModel  extends BaseAbstractTableModel {

   public TaxTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tax Tax = (Tax) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = Tax.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getCODE().getValue())==0){
               returnValue = Tax.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getFALT().getValue())==0){
               returnValue = Tax.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getFMOD().getValue())==0){
               returnValue = Tax.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getRETENTION().getValue())==0){
               returnValue = Tax.isRetention()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getSTATION().getValue())==0){
               returnValue = Tax.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Tax.getSucursal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getVALUE().getValue())==0){
               returnValue = String.valueOf(Tax.getValue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getXMLTAX().getValue())==0){
               returnValue = Tax.getXmlTax();
           }
           return returnValue;
       };
   }
}