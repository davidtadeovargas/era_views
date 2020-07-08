package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Cortes;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CortesTableModel  extends BaseAbstractTableModel {

   public CortesTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Cortes Cortes = (Cortes) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getDIA().getValue())==0){
               returnValue = Cortes.getDia().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getESTAC().getValue())==0){
               returnValue = Cortes.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getFALT().getValue())==0){
               returnValue = Cortes.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getFMOD().getValue())==0){
               returnValue = Cortes.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getHORA().getValue())==0){
               returnValue = String.valueOf(Cortes.getHora());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getNOCAJ().getValue())==0){
               returnValue = Cortes.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortessTableHeader().getSUCU().getValue())==0){
               returnValue = Cortes.getSucu();
           }
           return returnValue;
       };
   }
}