package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.HistAntiguedaddesaldo;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class HistAntiguedaddesaldoTableModel  extends BaseAbstractTableModel {

   public HistAntiguedaddesaldoTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final HistAntiguedaddesaldo HistAntiguedaddesaldo = (HistAntiguedaddesaldo) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getANTI15().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getAnti15().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getANTI30().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getAnti30().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getANTI45().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getAnti45().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getANTI45MAS().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getAnti45Mas().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getCODEMP().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getCodemp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getESTAC().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getFALT().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getFMOD().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getIDCORTE().getValue())==0){
               returnValue = String.valueOf(HistAntiguedaddesaldo.getIdCorte());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getNOCAJ().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getNOM().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getNom();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getSUCU().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getHistAntiguedaddesaldosTableHeader().getVEN().getValue())==0){
               returnValue = HistAntiguedaddesaldo.getVen().toString();
           }
           return returnValue;
       };
   }
}