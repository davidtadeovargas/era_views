package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Controlexportar;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ControlexportarTableModel  extends BaseAbstractTableModel {

   public ControlexportarTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Controlexportar Controlexportar = (Controlexportar) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getESTAC().getValue())==0){
               returnValue = Controlexportar.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getFALT().getValue())==0){
               returnValue = Controlexportar.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getFECHAEXPO().getValue())==0){
               returnValue = Controlexportar.getFechaExpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getFECHAIMPO().getValue())==0){
               returnValue = Controlexportar.getFechaImpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getFMOD().getValue())==0){
               returnValue = Controlexportar.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getID_ULTIMAVENTAEXPO().getValue())==0){
               returnValue = String.valueOf(Controlexportar.getId_ultimaVentaExpo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getID_ULTIMAPARTIDAEXPO().getValue())==0){
               returnValue = String.valueOf(Controlexportar.getId_ultimapartidaExpo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Controlexportar.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getSUCU().getValue())==0){
               returnValue = Controlexportar.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getControlexportarsTableHeader().getTIPO().getValue())==0){
               returnValue = Controlexportar.getTipo();
           }
           return returnValue;
       };
   }
}