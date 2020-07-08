package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Tipscamb;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class TipscambTableModel  extends BaseAbstractTableModel {

   public TipscambTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Tipscamb Tipscamb = (Tipscamb) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getCODE().getValue())==0){
               returnValue = Tipscamb.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getESTAC().getValue())==0){
               returnValue = Tipscamb.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getFALT().getValue())==0){
               returnValue = Tipscamb.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getFMOD().getValue())==0){
               returnValue = Tipscamb.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Tipscamb.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getSUCU().getValue())==0){
               returnValue = Tipscamb.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTipscambsTableHeader().getTIPCAM().getValue())==0){
               returnValue = String.valueOf(Tipscamb.getTipcam());
           }
           return returnValue;
       };
   }
}