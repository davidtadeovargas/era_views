package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tips;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class TipsTableModel  extends BaseAbstractTableModel {

   public TipsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tips Tips = (Tips) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getCOD().getValue())==0){
               returnValue = Tips.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Tips.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getESTAC().getValue())==0){
               returnValue = Tips.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getFALT().getValue())==0){
               returnValue = Tips.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getFMOD().getValue())==0){
               returnValue = Tips.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Tips.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipssTableHeader().getSUCU().getValue())==0){
               returnValue = Tips.getSucu();
           }
           return returnValue;
       };
   }
}