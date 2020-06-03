package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Pes;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PesTableModel  extends BaseAbstractTableModel {

   public PesTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Pes Pes = (Pes) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getCODE().getValue())==0){
               returnValue = Pes.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getDESCRIP().getValue())==0){
               returnValue = Pes.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getESTAC().getValue())==0){
               returnValue = Pes.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getFALT().getValue())==0){
               returnValue = Pes.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getFMOD().getValue())==0){
               returnValue = Pes.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getNOCAJ().getValue())==0){
               returnValue = Pes.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPessTableHeader().getSUCU().getValue())==0){
               returnValue = Pes.getSucu();
           }
           return returnValue;
       };
   }
}