package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CUsoCFDI;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class UsoCFDITableModel  extends BaseAbstractTableModel {

   public UsoCFDITableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CUsoCFDI UsoCFDI = (CUsoCFDI) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getCODE().getValue())==0){
               returnValue = UsoCFDI.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = UsoCFDI.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getESTAC().getValue())==0){
               returnValue = UsoCFDI.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getFALT().getValue())==0){
               returnValue = UsoCFDI.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getFMOD().getValue())==0){
               returnValue = UsoCFDI.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getNOCAJ().getValue())==0){
               returnValue = UsoCFDI.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUsoCFDIsTableHeader().getSUCU().getValue())==0){
               returnValue = UsoCFDI.getSucu();
           }
           return returnValue;
       };
   }
}