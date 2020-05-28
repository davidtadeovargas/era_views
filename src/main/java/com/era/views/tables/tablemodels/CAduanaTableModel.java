package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CAduana;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CAduanaTableModel  extends BaseAbstractTableModel {

   public CAduanaTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CAduana CAduana = (CAduana) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getC_ADUANA().getValue())==0){
               returnValue = CAduana.getC_Aduana();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CAduana.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getESTAC().getValue())==0){
               returnValue = CAduana.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getFALT().getValue())==0){
               returnValue = CAduana.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getFMOD().getValue())==0){
               returnValue = CAduana.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getNOCAJ().getValue())==0){
               returnValue = CAduana.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCAduanasTableHeader().getSUCU().getValue())==0){
               returnValue = CAduana.getSucu();
           }
           return returnValue;
       };
   }
}