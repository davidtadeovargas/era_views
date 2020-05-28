package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Partflujact;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PartflujactTableModel  extends BaseAbstractTableModel {

   public PartflujactTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Partflujact Partflujact = (Partflujact) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getESTAC().getValue())==0){
               returnValue = Partflujact.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getFALT().getValue())==0){
               returnValue = Partflujact.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getFMOD().getValue())==0){
               returnValue = Partflujact.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getIDFLUJ().getValue())==0){
               returnValue = String.valueOf(Partflujact.getIdfluj());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Partflujact.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getSEGUI().getValue())==0){
               returnValue = Partflujact.getSegui();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartflujactsTableHeader().getSUCU().getValue())==0){
               returnValue = Partflujact.getSucu();
           }
           return returnValue;
       };
   }
}