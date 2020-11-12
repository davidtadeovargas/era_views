package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Facturas;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class FacturasTableModel  extends BaseAbstractTableModel {

   public FacturasTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Facturas Facturas = (Facturas) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getCANTIDAD().getValue())==0){
               returnValue = Facturas.getCantidad().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getCLAVESAT().getValue())==0){
               returnValue = Facturas.getClavesat();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getCLIENTE().getValue())==0){
               returnValue = Facturas.getCliente();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getDESCRIPCION().getValue())==0){
               returnValue = Facturas.getDescripcion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getDESCUENTO().getValue())==0){
               returnValue = Facturas.getDescuento().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getESTAC().getValue())==0){
               returnValue = Facturas.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getFALT().getValue())==0){
               returnValue = Facturas.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getFENTREGA().getValue())==0){
               returnValue = Facturas.getFentrega().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getFMOD().getValue())==0){
               returnValue = Facturas.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getIMPORTE().getValue())==0){
               returnValue = Facturas.getImporte().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getNOCAJ().getValue())==0){
               returnValue = Facturas.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getPDESCUENTO().getValue())==0){
               returnValue = Facturas.getPdescuento().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getPRECIO().getValue())==0){
               returnValue = Facturas.getPrecio().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getPRODUCTO().getValue())==0){
               returnValue = Facturas.getProducto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getSUBTOTAL().getValue())==0){
               returnValue = Facturas.getSubtotal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getSUCU().getValue())==0){
               returnValue = Facturas.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getTDESCUENTO().getValue())==0){
               returnValue = Facturas.getTdescuento().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getTOTAL().getValue())==0){
               returnValue = Facturas.getTotal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getTOTAL_RETENCION().getValue())==0){
               returnValue = Facturas.getTotal_retencion().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getTOTAL_TRASLADO().getValue())==0){
               returnValue = Facturas.getTotal_traslado().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getUNIDAD().getValue())==0){
               returnValue = Facturas.getUnidad();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getFacturassTableHeader().getUSOCFDI().getValue())==0){
               returnValue = Facturas.getUsocfdi();
           }
           return returnValue;
       };
   }
}