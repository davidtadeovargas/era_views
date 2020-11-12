package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Marcprod;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class MarcprodTableModel  extends BaseAbstractTableModel {

   public MarcprodTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Marcprod Marcprod = (Marcprod) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getESTAC().getValue())==0){
               returnValue = Marcprod.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getFALT().getValue())==0){
               returnValue = Marcprod.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getFMOD().getValue())==0){
               returnValue = Marcprod.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getMARC().getValue())==0){
               returnValue = Marcprod.getMarc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Marcprod.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getPROD().getValue())==0){
               returnValue = Marcprod.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMarcprodsTableHeader().getSUCU().getValue())==0){
               returnValue = Marcprod.getSucu();
           }
           return returnValue;
       };
   }
}