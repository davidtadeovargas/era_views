package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ERMmovimientosInventario;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ERMmovimientosInventarioTableModel  extends BaseAbstractTableModel {

   public ERMmovimientosInventarioTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ERMmovimientosInventario ERMmovimientosInventario = (ERMmovimientosInventario) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getCANTIDAD().getValue())==0){
               returnValue = ERMmovimientosInventario.getCantidad().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getCOSTOPROMEDIO().getValue())==0){
               returnValue = ERMmovimientosInventario.getCostoPromedio().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getCOSTOUNITARIO().getValue())==0){
               returnValue = ERMmovimientosInventario.getCostoUnitario().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getESTAC().getValue())==0){
               returnValue = ERMmovimientosInventario.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getEXISTACTUAL().getValue())==0){
               returnValue = ERMmovimientosInventario.getExistActual().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getFALT().getValue())==0){
               returnValue = ERMmovimientosInventario.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getFECHAMOVIMIENTO().getValue())==0){
               returnValue = ERMmovimientosInventario.getFechaMovimiento().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getFMOD().getValue())==0){
               returnValue = ERMmovimientosInventario.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getIDALMACEN().getValue())==0){
               returnValue = String.valueOf(ERMmovimientosInventario.getIdAlmacen());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getIDMOVTOCOMERCIAL().getValue())==0){
               returnValue = String.valueOf(ERMmovimientosInventario.getIdMovtoComercial());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getIDPRODUCTO().getValue())==0){
               returnValue = String.valueOf(ERMmovimientosInventario.getIdProducto());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getLOTEPEDIMENTO().getValue())==0){
               returnValue = String.valueOf(ERMmovimientosInventario.getLotePedimento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getNOCAJ().getValue())==0){
               returnValue = ERMmovimientosInventario.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getSUCU().getValue())==0){
               returnValue = ERMmovimientosInventario.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getTIMESTAMP().getValue())==0){
               returnValue = ERMmovimientosInventario.getTimestamp().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getTIPOMOVIMIENTO().getValue())==0){
               returnValue = String.valueOf(ERMmovimientosInventario.getTipoMovimiento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getERMmovimientosInventariosTableHeader().getUNIDAD().getValue())==0){
               returnValue = ERMmovimientosInventario.getUnidad();
           }
           return returnValue;
       };
   }
}