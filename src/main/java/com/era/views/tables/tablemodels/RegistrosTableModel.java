package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Registros;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class RegistrosTableModel  extends BaseAbstractTableModel {

   public RegistrosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Registros Registros = (Registros) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistrossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistrossTableHeader().getESTAC().getValue())==0){
               returnValue = Registros.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistrossTableHeader().getFALT().getValue())==0){
               returnValue = Registros.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistrossTableHeader().getFMOD().getValue())==0){
               returnValue = Registros.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistrossTableHeader().getNOCAJ().getValue())==0){
               returnValue = Registros.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getRegistrossTableHeader().getSUCU().getValue())==0){
               returnValue = Registros.getSucu();
           }
           return returnValue;
       };
   }
}