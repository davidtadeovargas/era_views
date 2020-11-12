package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Serieprod;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class SerieprodTableModel  extends BaseAbstractTableModel {

   public SerieprodTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Serieprod Serieprod = (Serieprod) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getALMA().getValue())==0){
               returnValue = Serieprod.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getCOMEN().getValue())==0){
               returnValue = Serieprod.getComen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getESTAC().getValue())==0){
               returnValue = Serieprod.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getEXIST().getValue())==0){
               returnValue = String.valueOf(Serieprod.getExist());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getFALT().getValue())==0){
               returnValue = Serieprod.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getFMOD().getValue())==0){
               returnValue = Serieprod.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Serieprod.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getPROD().getValue())==0){
               returnValue = Serieprod.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getSER().getValue())==0){
               returnValue = Serieprod.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSerieprodsTableHeader().getSUCU().getValue())==0){
               returnValue = Serieprod.getSucu();
           }
           return returnValue;
       };
   }
}