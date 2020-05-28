package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ImpuestosVenta;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ImpuestosVentaTableModel  extends BaseAbstractTableModel {

   public ImpuestosVentaTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ImpuestosVenta ImpuestosVenta = (ImpuestosVenta) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getESTAC().getValue())==0){
               returnValue = ImpuestosVenta.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getFALT().getValue())==0){
               returnValue = ImpuestosVenta.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getFMOD().getValue())==0){
               returnValue = ImpuestosVenta.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getFVENC().getValue())==0){
               returnValue = ImpuestosVenta.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getIMPUESTO().getValue())==0){
               returnValue = ImpuestosVenta.getImpuesto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getNOCAJ().getValue())==0){
               returnValue = ImpuestosVenta.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getRETENCION().getValue())==0){
               returnValue = ImpuestosVenta.isRetencion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getSUCU().getValue())==0){
               returnValue = ImpuestosVenta.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosVentasTableHeader().getTOTAL().getValue())==0){
               returnValue = ImpuestosVenta.getTotal().toString();
           }
           return returnValue;
       };
   }
}