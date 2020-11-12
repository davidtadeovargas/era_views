package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Activos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ActivosTableModel  extends BaseAbstractTableModel {

   public ActivosTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Activos Activos = (Activos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getCLASIFICACION().getValue())==0){
               returnValue = Activos.getClasificacion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getDESCRIP().getValue())==0){
               returnValue = Activos.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getESTAC().getValue())==0){
               returnValue = Activos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getFALT().getValue())==0){
               returnValue = Activos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getFMOD().getValue())==0){
               returnValue = Activos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getNOCAJ().getValue())==0){
               returnValue = Activos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getREFERENCIA().getValue())==0){
               returnValue = Activos.getReferencia();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getRESPONSABLE().getValue())==0){
               returnValue = Activos.getResponsable();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getSUCU().getValue())==0){
               returnValue = Activos.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Activos.getSucursal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getActivossTableHeader().getZONA().getValue())==0){
               returnValue = Activos.getZona();
           }
           return returnValue;
       };
   }
}