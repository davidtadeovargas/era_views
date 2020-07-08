package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Modelprod;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ModelprodTableModel  extends BaseAbstractTableModel {

   public ModelprodTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Modelprod Modelprod = (Modelprod) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getESTAC().getValue())==0){
               returnValue = Modelprod.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getFALT().getValue())==0){
               returnValue = Modelprod.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getFMOD().getValue())==0){
               returnValue = Modelprod.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getMODE().getValue())==0){
               returnValue = Modelprod.getMode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Modelprod.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getPROD().getValue())==0){
               returnValue = Modelprod.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelprodsTableHeader().getSUCU().getValue())==0){
               returnValue = Modelprod.getSucu();
           }
           return returnValue;
       };
   }
}