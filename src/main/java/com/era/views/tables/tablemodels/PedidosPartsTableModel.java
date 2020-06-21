package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.PedidosParts;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PedidosPartsTableModel  extends BaseAbstractTableModel {

   public PedidosPartsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final PedidosParts PedidosParts = (PedidosParts) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getALMA().getValue())==0){
               returnValue = PedidosParts.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(PedidosParts.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getCODIMPUE().getValue())==0){
               returnValue = PedidosParts.getCodimpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getCOLO().getValue())==0){
               returnValue = PedidosParts.getColo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getCOMENSER().getValue())==0){
               returnValue = PedidosParts.getComenser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getCOST().getValue())==0){
               returnValue = PedidosParts.getCost().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getDESC_1().getValue())==0){
               returnValue = PedidosParts.getDesc_1().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getDESC_2().getValue())==0){
               returnValue = PedidosParts.getDesc_2().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getDESC_3().getValue())==0){
               returnValue = PedidosParts.getDesc_3().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getDESC_4().getValue())==0){
               returnValue = PedidosParts.getDesc_4().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getDESC_5().getValue())==0){
               returnValue = PedidosParts.getDesc_5().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getDESCRIP().getValue())==0){
               returnValue = PedidosParts.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getDESCRIPCIONOPCIONAL().getValue())==0){
               returnValue = PedidosParts.getDescripcionOpcional();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getESKIT().getValue())==0){
               returnValue = PedidosParts.isEskit()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getESTAC().getValue())==0){
               returnValue = PedidosParts.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getFALT().getValue())==0){
               returnValue = PedidosParts.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getFCADU().getValue())==0){
               returnValue = PedidosParts.getFcadu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getFENTRE().getValue())==0){
               returnValue = PedidosParts.getFentre();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getFMOD().getValue())==0){
               returnValue = PedidosParts.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getGARAN().getValue())==0){
               returnValue = PedidosParts.getGaran();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getIMPO().getValue())==0){
               returnValue = PedidosParts.getImpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getIMPO_2().getValue())==0){
               returnValue = PedidosParts.getImpo_2().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getIMPODESC().getValue())==0){
               returnValue = PedidosParts.getImpodesc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getIMPUEIMPO().getValue())==0){
               returnValue = PedidosParts.getImpueimpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getIMPUEIMPO_2().getValue())==0){
               returnValue = PedidosParts.getImpueimpo_2().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getIMPUEVAL().getValue())==0){
               returnValue = PedidosParts.getImpueval().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getLIST().getValue())==0){
               returnValue = String.valueOf(PedidosParts.getList());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getLOT().getValue())==0){
               returnValue = PedidosParts.getLot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getMON().getValue())==0){
               returnValue = PedidosParts.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getNOCAJ().getValue())==0){
               returnValue = PedidosParts.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getPEDIDOID().getValue())==0){
               returnValue = String.valueOf(PedidosParts.getPedidoID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getPEDIMEN().getValue())==0){
               returnValue = PedidosParts.getPedimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getPRE().getValue())==0){
               returnValue = PedidosParts.getPre().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getPRE_2().getValue())==0){
               returnValue = PedidosParts.getPre_2().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getPROD().getValue())==0){
               returnValue = PedidosParts.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getRECIBIDAS().getValue())==0){
               returnValue = String.valueOf(PedidosParts.getRecibidas());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getSERPROD().getValue())==0){
               returnValue = PedidosParts.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getSUCU().getValue())==0){
               returnValue = PedidosParts.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getTIPCAM().getValue())==0){
               returnValue = PedidosParts.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPedidosPartssTableHeader().getUNID().getValue())==0){
               returnValue = PedidosParts.getUnid();
           }
           return returnValue;
       };
   }
}