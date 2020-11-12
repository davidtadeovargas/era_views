package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Anaqs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class AnaqsTableModel  extends BaseAbstractTableModel {

   public AnaqsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Anaqs Anaqs = (Anaqs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getCOD().getValue())==0){
               returnValue = Anaqs.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Anaqs.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getESTAC().getValue())==0){
               returnValue = Anaqs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getFALT().getValue())==0){
               returnValue = Anaqs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getFMOD().getValue())==0){
               returnValue = Anaqs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Anaqs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAnaqssTableHeader().getSUCU().getValue())==0){
               returnValue = Anaqs.getSucu();
           }
           return returnValue;
       };
   }
}