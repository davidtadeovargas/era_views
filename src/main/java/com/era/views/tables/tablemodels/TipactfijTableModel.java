package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tipactfij;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class TipactfijTableModel  extends BaseAbstractTableModel {

   public TipactfijTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tipactfij Tipactfij = (Tipactfij) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getCODE().getValue())==0){
               returnValue = Tipactfij.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Tipactfij.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getESTAC().getValue())==0){
               returnValue = Tipactfij.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getFALT().getValue())==0){
               returnValue = Tipactfij.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getFMOD().getValue())==0){
               returnValue = Tipactfij.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Tipactfij.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipactfijsTableHeader().getSUCU().getValue())==0){
               returnValue = Tipactfij.getSucu();
           }
           return returnValue;
       };
   }
}