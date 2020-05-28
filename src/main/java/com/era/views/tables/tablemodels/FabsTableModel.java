package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Fabs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class FabsTableModel  extends BaseAbstractTableModel {

   public FabsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Fabs Fabs = (Fabs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getCOD().getValue())==0){
               returnValue = Fabs.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Fabs.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getESTAC().getValue())==0){
               returnValue = Fabs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getFALT().getValue())==0){
               returnValue = Fabs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getFMOD().getValue())==0){
               returnValue = Fabs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Fabs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFabssTableHeader().getSUCU().getValue())==0){
               returnValue = Fabs.getSucu();
           }
           return returnValue;
       };
   }
}