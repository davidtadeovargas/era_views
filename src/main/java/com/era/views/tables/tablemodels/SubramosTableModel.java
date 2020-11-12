package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Subramos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class SubramosTableModel  extends BaseAbstractTableModel {

   public SubramosTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Subramos Subramos = (Subramos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getCODE().getValue())==0){
               returnValue = Subramos.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getDESCRIPCION().getValue())==0){
               returnValue = Subramos.getDescripcion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getESTAC().getValue())==0){
               returnValue = Subramos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getFALT().getValue())==0){
               returnValue = Subramos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getFMOD().getValue())==0){
               returnValue = Subramos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getNOCAJ().getValue())==0){
               returnValue = Subramos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSubramossTableHeader().getSUCU().getValue())==0){
               returnValue = Subramos.getSucu();
           }
           return returnValue;
       };
   }
}