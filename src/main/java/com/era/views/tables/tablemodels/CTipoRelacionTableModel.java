package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CTipoRelacion;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CTipoRelacionTableModel  extends BaseAbstractTableModel {

   public CTipoRelacionTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CTipoRelacion CTipoRelacion = (CTipoRelacion) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getFECHA_INICIO_DE_VIGENCIA().getValue())==0){
               returnValue = CTipoRelacion.getFecha_inicio_de_vigencia().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CTipoRelacion.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getESTAC().getValue())==0){
               returnValue = CTipoRelacion.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getFALT().getValue())==0){
               returnValue = CTipoRelacion.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getFMOD().getValue())==0){
               returnValue = CTipoRelacion.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CTipoRelacion.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCTipoRelacionsTableHeader().getSUCU().getValue())==0){
               returnValue = CTipoRelacion.getSucu();
           }
           return returnValue;
       };
   }
}