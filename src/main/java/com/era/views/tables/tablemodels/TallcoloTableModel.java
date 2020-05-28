package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tallcolo;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class TallcoloTableModel  extends BaseAbstractTableModel {

   public TallcoloTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tallcolo Tallcolo = (Tallcolo) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getALMA().getValue())==0){
               returnValue = Tallcolo.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getCOLO().getValue())==0){
               returnValue = Tallcolo.getColo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getESTAC().getValue())==0){
               returnValue = Tallcolo.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getEXIST().getValue())==0){
               returnValue = String.valueOf(Tallcolo.getExist());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getFALT().getValue())==0){
               returnValue = Tallcolo.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getFMOD().getValue())==0){
               returnValue = Tallcolo.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getNOCAJ().getValue())==0){
               returnValue = Tallcolo.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getPROD().getValue())==0){
               returnValue = Tallcolo.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getSUCU().getValue())==0){
               returnValue = Tallcolo.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTallcolosTableHeader().getTALL().getValue())==0){
               returnValue = Tallcolo.getTall();
           }
           return returnValue;
       };
   }
}