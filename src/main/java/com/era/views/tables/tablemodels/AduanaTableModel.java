package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Aduana;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class AduanaTableModel  extends BaseAbstractTableModel {

   public AduanaTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Aduana Aduana = (Aduana) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getCODIGO().getValue())==0){
               returnValue = Aduana.getCodigo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getDESCRIPCION().getValue())==0){
               returnValue = Aduana.getDescripcion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getESTAC().getValue())==0){
               returnValue = Aduana.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getFALT().getValue())==0){
               returnValue = Aduana.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getFMOD().getValue())==0){
               returnValue = Aduana.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getNOCAJ().getValue())==0){
               returnValue = Aduana.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAduanasTableHeader().getSUCU().getValue())==0){
               returnValue = Aduana.getSucu();
           }
           return returnValue;
       };
   }
}