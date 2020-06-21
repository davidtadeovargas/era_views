package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Partcot;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PartcotTableModel  extends BaseAbstractTableModel {

   public PartcotTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Partcot Partcot = (Partcot) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getALMA().getValue())==0){
               returnValue = Partcot.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Partcot.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getCODCOT().getValue())==0){
               returnValue = Partcot.getCodcot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getCODIMPUE().getValue())==0){
               returnValue = Partcot.getCodimpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getCOMENSER().getValue())==0){
               returnValue = Partcot.getComenser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getCOST().getValue())==0){
               returnValue = String.valueOf(Partcot.getCost());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getDESC1().getValue())==0){
               returnValue = String.valueOf(Partcot.getDesc1());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getDESC2().getValue())==0){
               returnValue = String.valueOf(Partcot.getDesc2());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getDESC3().getValue())==0){
               returnValue = String.valueOf(Partcot.getDesc3());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getDESC4().getValue())==0){
               returnValue = String.valueOf(Partcot.getDesc4());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getDESC5().getValue())==0){
               returnValue = String.valueOf(Partcot.getDesc5());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getDESCRIP().getValue())==0){
               returnValue = Partcot.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getDESCRIPCIONOPCIONAL().getValue())==0){
               returnValue = Partcot.getDescripcionOpcional();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getESKIT().getValue())==0){
               returnValue = Partcot.isEskit()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getESTAC().getValue())==0){
               returnValue = Partcot.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getFALT().getValue())==0){
               returnValue = Partcot.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getFCADU().getValue())==0){
               returnValue = Partcot.getFcadu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getFENTRE().getValue())==0){
               returnValue = Partcot.getFentre();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getFMOD().getValue())==0){
               returnValue = Partcot.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getGARAN().getValue())==0){
               returnValue = Partcot.getGaran();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getIMPO().getValue())==0){
               returnValue = String.valueOf(Partcot.getImpo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getIMPO2().getValue())==0){
               returnValue = String.valueOf(Partcot.getImpo2());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getIMPODESC().getValue())==0){
               returnValue = String.valueOf(Partcot.getImpodesc());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getIMPUEIMPO().getValue())==0){
               returnValue = String.valueOf(Partcot.getImpueimpo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getIMPUEIMPO2().getValue())==0){
               returnValue = String.valueOf(Partcot.getImpueimpo2());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getIMPUEVAL().getValue())==0){
               returnValue = String.valueOf(Partcot.getImpueval());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getLIST().getValue())==0){
               returnValue = String.valueOf(Partcot.getList());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getLOT().getValue())==0){
               returnValue = Partcot.getLot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getMON().getValue())==0){
               returnValue = Partcot.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Partcot.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getPEDIMEN().getValue())==0){
               returnValue = Partcot.getPedimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getPRE().getValue())==0){
               returnValue = String.valueOf(Partcot.getPre());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getPRE2().getValue())==0){
               returnValue = String.valueOf(Partcot.getPre2());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getPROD().getValue())==0){
               returnValue = Partcot.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getSERPROD().getValue())==0){
               returnValue = Partcot.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getSUCU().getValue())==0){
               returnValue = Partcot.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getTIPCAM().getValue())==0){
               returnValue = String.valueOf(Partcot.getTipcam());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcotsTableHeader().getUNID().getValue())==0){
               returnValue = Partcot.getUnid();
           }
           return returnValue;
       };
   }
}