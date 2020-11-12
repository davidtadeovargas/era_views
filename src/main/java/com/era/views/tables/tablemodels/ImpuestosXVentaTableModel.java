package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ImpuestosXVenta;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ImpuestosXVentaTableModel  extends BaseAbstractTableModel {

   public ImpuestosXVentaTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ImpuestosXVenta ImpuestosXVenta = (ImpuestosXVenta) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getESTAC().getValue())==0){
               returnValue = ImpuestosXVenta.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getFALT().getValue())==0){
               returnValue = ImpuestosXVenta.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getFMOD().getValue())==0){
               returnValue = ImpuestosXVenta.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getFVENC().getValue())==0){
               returnValue = ImpuestosXVenta.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getID_PARTIDA().getValue())==0){
               returnValue = String.valueOf(ImpuestosXVenta.getId_partida());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getIMPUESTO().getValue())==0){
               returnValue = ImpuestosXVenta.getImpuesto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getNOCAJ().getValue())==0){
               returnValue = ImpuestosXVenta.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getRETENCION().getValue())==0){
               returnValue = ImpuestosXVenta.isRetencion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getSUCU().getValue())==0){
               returnValue = ImpuestosXVenta.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXVentasTableHeader().getTOTAL().getValue())==0){
               returnValue = ImpuestosXVenta.getTotal().toString();
           }
           return returnValue;
       };
   }
}