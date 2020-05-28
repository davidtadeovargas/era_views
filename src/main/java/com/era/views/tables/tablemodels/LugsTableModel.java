package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Lugs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class LugsTableModel  extends BaseAbstractTableModel {

   public LugsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Lugs Lugs = (Lugs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getCOD().getValue())==0){
               returnValue = Lugs.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Lugs.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getESTAC().getValue())==0){
               returnValue = Lugs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getFALT().getValue())==0){
               returnValue = Lugs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getFMOD().getValue())==0){
               returnValue = Lugs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Lugs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLugssTableHeader().getSUCU().getValue())==0){
               returnValue = Lugs.getSucu();
           }
           return returnValue;
       };
   }
}