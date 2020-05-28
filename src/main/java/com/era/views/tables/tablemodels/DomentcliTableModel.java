package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Domentcli;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class DomentcliTableModel  extends BaseAbstractTableModel {

   public DomentcliTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Domentcli Domentcli = (Domentcli) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCP().getValue())==0){
               returnValue = Domentcli.getCP();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCALLE().getValue())==0){
               returnValue = Domentcli.getCalle();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCEL().getValue())==0){
               returnValue = Domentcli.getCel();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCIU().getValue())==0){
               returnValue = Domentcli.getCiu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCO1().getValue())==0){
               returnValue = Domentcli.getCo1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCO2().getValue())==0){
               returnValue = Domentcli.getCo2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCO3().getValue())==0){
               returnValue = Domentcli.getCo3();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCODEMP().getValue())==0){
               returnValue = Domentcli.getCodemp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getCOL().getValue())==0){
               returnValue = Domentcli.getCol();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getESTAC().getValue())==0){
               returnValue = Domentcli.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getESTAD().getValue())==0){
               returnValue = Domentcli.getEstad();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getEXTEN().getValue())==0){
               returnValue = Domentcli.getExten();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getFALT().getValue())==0){
               returnValue = Domentcli.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getFMOD().getValue())==0){
               returnValue = Domentcli.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getLADA().getValue())==0){
               returnValue = Domentcli.getLada();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getNOCAJ().getValue())==0){
               returnValue = Domentcli.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getNOEXT().getValue())==0){
               returnValue = Domentcli.getNoext();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getNOINT().getValue())==0){
               returnValue = Domentcli.getNoint();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getPAI().getValue())==0){
               returnValue = Domentcli.getPai();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getSUCU().getValue())==0){
               returnValue = Domentcli.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getTEL().getValue())==0){
               returnValue = Domentcli.getTel();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getTELPER1().getValue())==0){
               returnValue = Domentcli.getTelper1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDomentclisTableHeader().getTELPER2().getValue())==0){
               returnValue = Domentcli.getTelper2();
           }
           return returnValue;
       };
   }
}