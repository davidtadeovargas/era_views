package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Estadiscor;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class EstadiscorTableModel  extends BaseAbstractTableModel {

   public EstadiscorTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Estadiscor Estadiscor = (Estadiscor) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getCORR().getValue())==0){
               returnValue = Estadiscor.getCorr();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getCORRDE().getValue())==0){
               returnValue = Estadiscor.getCorrde();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getESTAC().getValue())==0){
               returnValue = Estadiscor.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getESTAD().getValue())==0){
               returnValue = Estadiscor.getEstad();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getEXPORT().getValue())==0){
               returnValue = Estadiscor.isExport()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getFALT().getValue())==0){
               returnValue = Estadiscor.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getFMOD().getValue())==0){
               returnValue = Estadiscor.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getMOTIV().getValue())==0){
               returnValue = Estadiscor.getMotiv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Estadiscor.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getNODOC().getValue())==0){
               returnValue = Estadiscor.getNodoc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getSUCU().getValue())==0){
               returnValue = Estadiscor.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEstadiscorsTableHeader().getTIPDOC().getValue())==0){
               returnValue = Estadiscor.getTipdoc();
           }
           return returnValue;
       };
   }
}