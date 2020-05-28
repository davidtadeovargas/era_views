package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ImpuestosXCompra;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ImpuestosXCompraTableModel  extends BaseAbstractTableModel {

   public ImpuestosXCompraTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ImpuestosXCompra ImpuestosXCompra = (ImpuestosXCompra) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getESTAC().getValue())==0){
               returnValue = ImpuestosXCompra.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getFALT().getValue())==0){
               returnValue = ImpuestosXCompra.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getFMOD().getValue())==0){
               returnValue = ImpuestosXCompra.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getFVENC().getValue())==0){
               returnValue = ImpuestosXCompra.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getIMPUESTO().getValue())==0){
               returnValue = ImpuestosXCompra.getImpuesto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getNOCAJ().getValue())==0){
               returnValue = ImpuestosXCompra.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getRETENCION().getValue())==0){
               returnValue = ImpuestosXCompra.isRetencion()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getSUCU().getValue())==0){
               returnValue = ImpuestosXCompra.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuestosXComprasTableHeader().getTOTAL().getValue())==0){
               returnValue = ImpuestosXCompra.getTotal().toString();
           }
           return returnValue;
       };
   }
}