package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CClaveUnidad;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CClaveUnidadTableModel  extends BaseAbstractTableModel {

   public CClaveUnidadTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CClaveUnidad CClaveUnidad = (CClaveUnidad) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getNOMBRE().getValue())==0){
               returnValue = CClaveUnidad.getNombre();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getC_CLAVEUNIDAD().getValue())==0){
               returnValue = CClaveUnidad.getC_ClaveUnidad();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CClaveUnidad.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getESTAC().getValue())==0){
               returnValue = CClaveUnidad.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getFALT().getValue())==0){
               returnValue = CClaveUnidad.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getFMOD().getValue())==0){
               returnValue = CClaveUnidad.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CClaveUnidad.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveUnidadsTableHeader().getSUCU().getValue())==0){
               returnValue = CClaveUnidad.getSucu();
           }
           return returnValue;
       };
   }
}