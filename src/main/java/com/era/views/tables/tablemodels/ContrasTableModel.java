package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Contras;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ContrasTableModel  extends BaseAbstractTableModel {

   public ContrasTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Contras Contras = (Contras) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getCOMP().getValue())==0){
               returnValue = Contras.getComp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getESTAC().getValue())==0){
               returnValue = Contras.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getFALT().getValue())==0){
               returnValue = Contras.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getFECH().getValue())==0){
               returnValue = Contras.getFech().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getFMOD().getValue())==0){
               returnValue = Contras.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getID_IDP().getValue())==0){
               returnValue = String.valueOf(Contras.getId_idp());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getNOCAJ().getValue())==0){
               returnValue = Contras.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getPROV().getValue())==0){
               returnValue = Contras.getProv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getRESPON().getValue())==0){
               returnValue = Contras.getRespon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getSUCU().getValue())==0){
               returnValue = Contras.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getContrassTableHeader().getTOT().getValue())==0){
               returnValue = String.valueOf(Contras.getTot());
           }
           return returnValue;
       };
   }
}