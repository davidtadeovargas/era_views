package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Clasificacion;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ClasificacionTableModel  extends BaseAbstractTableModel {

   public ClasificacionTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Clasificacion Clasificacion = (Clasificacion) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getCOD().getValue())==0){
               returnValue = Clasificacion.getCod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Clasificacion.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getESTAC().getValue())==0){
               returnValue = Clasificacion.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getFALT().getValue())==0){
               returnValue = Clasificacion.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getFMOD().getValue())==0){
               returnValue = Clasificacion.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Clasificacion.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getClasificacionsTableHeader().getSUCU().getValue())==0){
               returnValue = Clasificacion.getSucu();
           }
           return returnValue;
       };
   }
}