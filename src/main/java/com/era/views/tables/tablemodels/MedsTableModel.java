package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Meds;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class MedsTableModel  extends BaseAbstractTableModel {

   public MedsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Meds Meds = (Meds) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getCODE().getValue())==0){
               returnValue = Meds.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Meds.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getESTAC().getValue())==0){
               returnValue = Meds.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getFALT().getValue())==0){
               returnValue = Meds.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getFMOD().getValue())==0){
               returnValue = Meds.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Meds.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMedssTableHeader().getSUCU().getValue())==0){
               returnValue = Meds.getSucu();
           }
           return returnValue;
       };
   }
}