package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ModificaImpuestos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ModificaImpuestosTableModel  extends BaseAbstractTableModel {

   public ModificaImpuestosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ModificaImpuestos ModificaImpuestos = (ModificaImpuestos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getESTAC().getValue())==0){
               returnValue = ModificaImpuestos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getFALT().getValue())==0){
               returnValue = ModificaImpuestos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getFMOD().getValue())==0){
               returnValue = ModificaImpuestos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getNOCAJ().getValue())==0){
               returnValue = ModificaImpuestos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getPARTIDA().getValue())==0){
               returnValue = String.valueOf(ModificaImpuestos.getPartida());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getSUCU().getValue())==0){
               returnValue = ModificaImpuestos.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getTOTAL_ANTERIOR().getValue())==0){
               returnValue = ModificaImpuestos.getTotal_anterior().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModificaImpuestossTableHeader().getTOTAL_NUEVO().getValue())==0){
               returnValue = ModificaImpuestos.getTotal_nuevo().toString();
           }
           return returnValue;
       };
   }
}