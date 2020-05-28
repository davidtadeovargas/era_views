package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.AsientosContables;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class AsientosContablesTableModel  extends BaseAbstractTableModel {

   public AsientosContablesTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final AsientosContables AsientosContables = (AsientosContables) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getCONCEPTO().getValue())==0){
               returnValue = AsientosContables.getConcepto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getDOCUMENTO().getValue())==0){
               returnValue = AsientosContables.getDocumento();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getESTAC().getValue())==0){
               returnValue = AsientosContables.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getFALT().getValue())==0){
               returnValue = AsientosContables.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getFECHA_ALTA().getValue())==0){
               returnValue = AsientosContables.getFecha_alta().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getFECHA_MODIFICACION().getValue())==0){
               returnValue = AsientosContables.getFecha_modificacion().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getFMOD().getValue())==0){
               returnValue = AsientosContables.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getFRECUENCIA().getValue())==0){
               returnValue = AsientosContables.getFrecuencia();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getIDSERIE().getValue())==0){
               returnValue = String.valueOf(AsientosContables.getIdSerie());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getIDSERIEPAGO().getValue())==0){
               returnValue = String.valueOf(AsientosContables.getIdSeriePago());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getNOCAJ().getValue())==0){
               returnValue = AsientosContables.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getNOMBRE().getValue())==0){
               returnValue = AsientosContables.getNombre();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getSUCU().getValue())==0){
               returnValue = AsientosContables.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getAsientosContablessTableHeader().getTIPO().getValue())==0){
               returnValue = String.valueOf(AsientosContables.getTipo());
           }
           return returnValue;
       };
   }
}