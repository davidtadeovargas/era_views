package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Terprodcompa;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class TerprodcompaTableModel  extends BaseAbstractTableModel {

   public TerprodcompaTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Terprodcompa Terprodcompa = (Terprodcompa) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getESTAC().getValue())==0){
               returnValue = Terprodcompa.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getFALT().getValue())==0){
               returnValue = Terprodcompa.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getFMOD().getValue())==0){
               returnValue = Terprodcompa.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getMARC().getValue())==0){
               returnValue = Terprodcompa.getMarc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getMODEL().getValue())==0){
               returnValue = Terprodcompa.getModel();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getNOCAJ().getValue())==0){
               returnValue = Terprodcompa.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getPROD().getValue())==0){
               returnValue = Terprodcompa.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getRUT().getValue())==0){
               returnValue = Terprodcompa.getRut();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTerprodcompasTableHeader().getSUCU().getValue())==0){
               returnValue = Terprodcompa.getSucu();
           }
           return returnValue;
       };
   }
}