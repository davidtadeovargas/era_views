package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.MovimientosPagos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class MovimientosPagosTableModel  extends BaseAbstractTableModel {

   public MovimientosPagosTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final MovimientosPagos MovimientosPagos = (MovimientosPagos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getABONO().getValue())==0){
               returnValue = MovimientosPagos.getAbono().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getDOCTO_ORIGEN().getValue())==0){
               returnValue = MovimientosPagos.getDocto_origen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getESTAC().getValue())==0){
               returnValue = MovimientosPagos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getFALT().getValue())==0){
               returnValue = MovimientosPagos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getFMOD().getValue())==0){
               returnValue = MovimientosPagos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getFOLIO().getValue())==0){
               returnValue = MovimientosPagos.getFolio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getIMPUESTOS().getValue())==0){
               returnValue = MovimientosPagos.getImpuestos().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getNOCAJ().getValue())==0){
               returnValue = MovimientosPagos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getPAGO_ID().getValue())==0){
               returnValue = String.valueOf(MovimientosPagos.getPago_id());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getPENDIENTE().getValue())==0){
               returnValue = MovimientosPagos.getPendiente().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getSERIE().getValue())==0){
               returnValue = MovimientosPagos.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getSUBTOTAL().getValue())==0){
               returnValue = MovimientosPagos.getSubtotal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getSUCU().getValue())==0){
               returnValue = MovimientosPagos.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getTIPO().getValue())==0){
               returnValue = MovimientosPagos.getTipo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getMovimientosPagossTableHeader().getTOTAL().getValue())==0){
               returnValue = MovimientosPagos.getTotal().toString();
           }
           return returnValue;
       };
   }
}