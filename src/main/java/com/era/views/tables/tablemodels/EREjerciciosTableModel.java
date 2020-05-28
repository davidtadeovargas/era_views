package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.EREjercicios;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class EREjerciciosTableModel  extends BaseAbstractTableModel {

   public EREjerciciosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final EREjercicios EREjercicios = (EREjercicios) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getEJERCICIO().getValue())==0){
               returnValue = String.valueOf(EREjercicios.getEjercicio());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getESTAC().getValue())==0){
               returnValue = EREjercicios.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getFALT().getValue())==0){
               returnValue = EREjercicios.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getFECHACREACION().getValue())==0){
               returnValue = EREjercicios.getFechaCreacion().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getFECHAFIN().getValue())==0){
               returnValue = EREjercicios.getFechaFin().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getFECHAINICIO().getValue())==0){
               returnValue = EREjercicios.getFechaInicio().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getFMOD().getValue())==0){
               returnValue = EREjercicios.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getNOCAJ().getValue())==0){
               returnValue = EREjercicios.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getEREjerciciossTableHeader().getSUCU().getValue())==0){
               returnValue = EREjercicios.getSucu();
           }
           return returnValue;
       };
   }
}