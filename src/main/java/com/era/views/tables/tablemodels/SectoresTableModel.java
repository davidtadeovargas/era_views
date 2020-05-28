package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Sectores;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class SectoresTableModel  extends BaseAbstractTableModel {

   public SectoresTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Sectores Sectores = (Sectores) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getCODIGO().getValue())==0){
               returnValue = Sectores.getCodigo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getDESCRIPCION().getValue())==0){
               returnValue = Sectores.getDescripcion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getESTAC().getValue())==0){
               returnValue = Sectores.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getFALT().getValue())==0){
               returnValue = Sectores.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getFMOD().getValue())==0){
               returnValue = Sectores.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getNOCAJ().getValue())==0){
               returnValue = Sectores.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getSUCU().getValue())==0){
               returnValue = Sectores.getSucu();
           }
           return returnValue;
       };
   }
}