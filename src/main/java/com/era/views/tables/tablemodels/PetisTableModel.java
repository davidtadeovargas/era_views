package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Petis;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PetisTableModel  extends BaseAbstractTableModel {

   public PetisTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Petis Petis = (Petis) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getESTAC().getValue())==0){
               returnValue = Petis.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getESTACDESTIN().getValue())==0){
               returnValue = Petis.getEstacdestin();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getESTAD().getValue())==0){
               returnValue = Petis.isEstad()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getFALT().getValue())==0){
               returnValue = Petis.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getFMOD().getValue())==0){
               returnValue = Petis.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getNOCAJ().getValue())==0){
               returnValue = Petis.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getNOMARCH().getValue())==0){
               returnValue = Petis.getNomarch();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getPATH().getValue())==0){
               returnValue = Petis.getPath();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getSUCU().getValue())==0){
               returnValue = Petis.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPetissTableHeader().getVAL().getValue())==0){
               returnValue = Petis.isVal()? "Si":"No";
           }
           return returnValue;
       };
   }
}