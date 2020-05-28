package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Unid;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class UnidTableModel  extends BaseAbstractTableModel {

   public UnidTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Unid Unid = (Unid) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getCLAVESAT().getValue())==0){
               returnValue = Unid.getClaveSAT();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getCODE().getValue())==0){
               returnValue = Unid.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Unid.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getESTAC().getValue())==0){
               returnValue = Unid.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getFALT().getValue())==0){
               returnValue = Unid.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getFMOD().getValue())==0){
               returnValue = Unid.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Unid.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getUnidsTableHeader().getSUCU().getValue())==0){
               returnValue = Unid.getSucu();
           }
           return returnValue;
       };
   }
}