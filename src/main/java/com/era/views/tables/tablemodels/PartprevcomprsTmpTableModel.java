package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.PartprevcomprsTmp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PartprevcomprsTmpTableModel  extends BaseAbstractTableModel {

   public PartprevcomprsTmpTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final PartprevcomprsTmp PartprevcomprsTmp = (PartprevcomprsTmp) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getACTIVO().getValue())==0){
               returnValue = PartprevcomprsTmp.getActivo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getALMA().getValue())==0){
               returnValue = PartprevcomprsTmp.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getAPLIC().getValue())==0){
               returnValue = PartprevcomprsTmp.isAplic()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(PartprevcomprsTmp.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCANTLOTPEND().getValue())==0){
               returnValue = PartprevcomprsTmp.getCantlotpend().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCODCOM().getValue())==0){
               returnValue = PartprevcomprsTmp.getCodcom();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCODIMPUE().getValue())==0){
               returnValue = PartprevcomprsTmp.getCodimpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCOLO().getValue())==0){
               returnValue = PartprevcomprsTmp.getColo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCOMENSER().getValue())==0){
               returnValue = PartprevcomprsTmp.getComenser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCOST().getValue())==0){
               returnValue = PartprevcomprsTmp.getCost().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCOSTPRO().getValue())==0){
               returnValue = PartprevcomprsTmp.getCostpro().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getCUENTACONTABLE().getValue())==0){
               returnValue = PartprevcomprsTmp.getCuentacontable();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getDESCAD().getValue())==0){
               returnValue = PartprevcomprsTmp.getDescad().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getDESCRIP().getValue())==0){
               returnValue = PartprevcomprsTmp.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getDESCU().getValue())==0){
               returnValue = PartprevcomprsTmp.getDescu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getDEVS().getValue())==0){
               returnValue = String.valueOf(PartprevcomprsTmp.getDevs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getESKIT().getValue())==0){
               returnValue = PartprevcomprsTmp.isEskit()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getESTAC().getValue())==0){
               returnValue = PartprevcomprsTmp.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getFALT().getValue())==0){
               returnValue = PartprevcomprsTmp.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getFLOTVENC().getValue())==0){
               returnValue = PartprevcomprsTmp.getFlotvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getFMOD().getValue())==0){
               returnValue = PartprevcomprsTmp.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getGARAN().getValue())==0){
               returnValue = PartprevcomprsTmp.getGaran();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getIDKIT().getValue())==0){
               returnValue = String.valueOf(PartprevcomprsTmp.getIdkit());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getIMPO().getValue())==0){
               returnValue = PartprevcomprsTmp.getImpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getIMPUE().getValue())==0){
               returnValue = PartprevcomprsTmp.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getKITMAE().getValue())==0){
               returnValue = PartprevcomprsTmp.isKitmae()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getLOT().getValue())==0){
               returnValue = PartprevcomprsTmp.getLot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getLOTEPEDIMENTO().getValue())==0){
               returnValue = String.valueOf(PartprevcomprsTmp.getLotePedimento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getMON().getValue())==0){
               returnValue = PartprevcomprsTmp.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getNOCAJ().getValue())==0){
               returnValue = PartprevcomprsTmp.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getPEDIMEN().getValue())==0){
               returnValue = PartprevcomprsTmp.getPedimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getPEPS().getValue())==0){
               returnValue = PartprevcomprsTmp.getPeps().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getPROD().getValue())==0){
               returnValue = PartprevcomprsTmp.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getRECIB().getValue())==0){
               returnValue = PartprevcomprsTmp.getRecib().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getSERPROD().getValue())==0){
               returnValue = PartprevcomprsTmp.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getSUCU().getValue())==0){
               returnValue = PartprevcomprsTmp.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getTALL().getValue())==0){
               returnValue = PartprevcomprsTmp.getTall();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getTIPCAM().getValue())==0){
               returnValue = PartprevcomprsTmp.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getUEPS().getValue())==0){
               returnValue = PartprevcomprsTmp.getUeps().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprsTmpsTableHeader().getUNID().getValue())==0){
               returnValue = PartprevcomprsTmp.getUnid();
           }
           return returnValue;
       };
   }
}