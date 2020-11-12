package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Model;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ModelTableModel  extends BaseAbstractTableModel {

   public ModelTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Model Model = (Model) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getCODE().getValue())==0){
               returnValue = Model.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Model.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getESTAC().getValue())==0){
               returnValue = Model.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getFALT().getValue())==0){
               returnValue = Model.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getFMOD().getValue())==0){
               returnValue = Model.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Model.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getModelsTableHeader().getSUCU().getValue())==0){
               returnValue = Model.getSucu();
           }
           return returnValue;
       };
   }
}