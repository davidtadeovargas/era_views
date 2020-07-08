package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Flujact;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class FlujactTableModel  extends BaseAbstractTableModel {

   public FlujactTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Flujact Flujact = (Flujact) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getESTAC().getValue())==0){
               returnValue = Flujact.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getFALT().getValue())==0){
               returnValue = Flujact.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getFMOD().getValue())==0){
               returnValue = Flujact.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Flujact.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getSUCU().getValue())==0){
               returnValue = Flujact.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getTIT().getValue())==0){
               returnValue = Flujact.getTit();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getUSRENVI().getValue())==0){
               returnValue = Flujact.getUsrenvi();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFlujactsTableHeader().getUSRRECIB().getValue())==0){
               returnValue = Flujact.getUsrrecib();
           }
           return returnValue;
       };
   }
}