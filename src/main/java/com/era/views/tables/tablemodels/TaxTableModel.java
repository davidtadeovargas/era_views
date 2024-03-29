package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tax;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class TaxTableModel  extends BaseAbstractTableModel {

   public TaxTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tax Tax = (Tax) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getCODE().getValue())==0){
               returnValue = Tax.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getESTAC().getValue())==0){
               returnValue = Tax.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getFALT().getValue())==0){
               returnValue = Tax.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getFMOD().getValue())==0){
               returnValue = Tax.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Tax.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getRETENTION().getValue())==0){
               returnValue = Tax.isRetention()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTaxsTableHeader().getSUCU().getValue())==0){
               returnValue = Tax.getSucu();
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