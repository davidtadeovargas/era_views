package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Pedidos;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class PedidosTableModel  extends BaseAbstractTableModel {

   public PedidosTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Pedidos Pedidos = (Pedidos) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getCODCOT().getValue())==0){
               returnValue = Pedidos.getCodcot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getCODEMP().getValue())==0){
               returnValue = Pedidos.getCodemp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getDESCRIP().getValue())==0){
               returnValue = Pedidos.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getESTAC().getValue())==0){
               returnValue = Pedidos.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getESTAD().getValue())==0){
               returnValue = Pedidos.getEstad();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getFALT().getValue())==0){
               returnValue = Pedidos.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getFDOC().getValue())==0){
               returnValue = Pedidos.getFdoc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getFENTRE().getValue())==0){
               returnValue = Pedidos.getFentre().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getFMOD().getValue())==0){
               returnValue = Pedidos.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getFVENC().getValue())==0){
               returnValue = Pedidos.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getIMPUE().getValue())==0){
               returnValue = Pedidos.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getMONEDAID().getValue())==0){
               returnValue = String.valueOf(Pedidos.getMonedaID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getMOTIV().getValue())==0){
               returnValue = Pedidos.getMotiv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getNOCAJ().getValue())==0){
               returnValue = Pedidos.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getNOREFER().getValue())==0){
               returnValue = Pedidos.getNorefer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getNOSER().getValue())==0){
               returnValue = Pedidos.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getNOSERVTA().getValue())==0){
               returnValue = Pedidos.getNoservta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getOBSERV().getValue())==0){
               returnValue = Pedidos.getObserv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getREFERENCIA().getValue())==0){
               returnValue = Pedidos.getReferencia();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getSER().getValue())==0){
               returnValue = Pedidos.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getSUBTOT().getValue())==0){
               returnValue = Pedidos.getSubtot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getSUCU().getValue())==0){
               returnValue = Pedidos.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getTIPCAM().getValue())==0){
               returnValue = Pedidos.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getTIPCAMNAC().getValue())==0){
               returnValue = Pedidos.getTipcamnac().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getTOT().getValue())==0){
               returnValue = Pedidos.getTot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getTOTAL_RETENCION().getValue())==0){
               returnValue = Pedidos.getTotal_retencion().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getTOTAL_TRASLADO().getValue())==0){
               returnValue = Pedidos.getTotal_traslado().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getTOTCOST().getValue())==0){
               returnValue = Pedidos.getTotcost().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getTOTDESCU().getValue())==0){
               returnValue = Pedidos.getTotdescu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidossTableHeader().getVTA().getValue())==0){
               returnValue = String.valueOf(Pedidos.getVta());
           }
           return returnValue;
       };
   }
}