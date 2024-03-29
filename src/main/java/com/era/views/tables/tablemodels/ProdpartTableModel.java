package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Prodpart;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ProdpartTableModel  extends BaseAbstractTableModel {

   public ProdpartTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Prodpart Prodpart = (Prodpart) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getCODE().getValue())==0){
               returnValue = Prodpart.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getESTAC().getValue())==0){
               returnValue = Prodpart.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getFALT().getValue())==0){
               returnValue = Prodpart.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getFMOD().getValue())==0){
               returnValue = Prodpart.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Prodpart.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getPART().getValue())==0){
               returnValue = Prodpart.getPart();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getProdpartsTableHeader().getSUCU().getValue())==0){
               returnValue = Prodpart.getSucu();
           }
           return returnValue;
       };
   }
}