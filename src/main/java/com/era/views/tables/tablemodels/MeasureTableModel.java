package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Measure;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class MeasureTableModel  extends BaseAbstractTableModel {

   public MeasureTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Measure Measure = (Measure) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getCODE().getValue())==0){
               returnValue = Measure.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Measure.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getESTAC().getValue())==0){
               returnValue = Measure.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getFALT().getValue())==0){
               returnValue = Measure.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getFMOD().getValue())==0){
               returnValue = Measure.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getNOCAJ().getValue())==0){
               returnValue = Measure.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMeasuresTableHeader().getSUCU().getValue())==0){
               returnValue = Measure.getSucu();
           }
           return returnValue;
       };
   }
}