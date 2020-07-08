package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Ords;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class OrdsTableModel  extends BaseAbstractTableModel {

   public OrdsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Ords Ords = (Ords) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getEJE().getValue())==0){
               returnValue = Ords.getEje();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getESTAC().getValue())==0){
               returnValue = Ords.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getFALT().getValue())==0){
               returnValue = Ords.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getFENT().getValue())==0){
               returnValue = Ords.getFent().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getFMOD().getValue())==0){
               returnValue = Ords.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getIMPUE().getValue())==0){
               returnValue = String.valueOf(Ords.getImpue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Ords.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getPROV().getValue())==0){
               returnValue = Ords.getProv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getSUBTOT().getValue())==0){
               returnValue = String.valueOf(Ords.getSubtot());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getSUCU().getValue())==0){
               returnValue = Ords.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getOrdssTableHeader().getTOTAL().getValue())==0){
               returnValue = String.valueOf(Ords.getTotal());
           }
           return returnValue;
       };
   }
}