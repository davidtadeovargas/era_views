package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.PartcomprsTmp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PartcomprsTmpTableModel  extends BaseAbstractTableModel {

   public PartcomprsTmpTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final PartcomprsTmp PartcomprsTmp = (PartcomprsTmp) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getACTIVO().getValue())==0){
               returnValue = PartcomprsTmp.getActivo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getALMA().getValue())==0){
               returnValue = PartcomprsTmp.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getAPLIC().getValue())==0){
               returnValue = PartcomprsTmp.isAplic()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(PartcomprsTmp.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCANTLOTPEND().getValue())==0){
               returnValue = PartcomprsTmp.getCantlotpend().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCODCOM().getValue())==0){
               returnValue = PartcomprsTmp.getCodcom();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCODIMPUE().getValue())==0){
               returnValue = PartcomprsTmp.getCodimpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCOLO().getValue())==0){
               returnValue = PartcomprsTmp.getColo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCOMENSER().getValue())==0){
               returnValue = PartcomprsTmp.getComenser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCOST().getValue())==0){
               returnValue = PartcomprsTmp.getCost().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCOSTPRO().getValue())==0){
               returnValue = PartcomprsTmp.getCostpro().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getCUENTACONTABLE().getValue())==0){
               returnValue = PartcomprsTmp.getCuentacontable();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getDESCAD().getValue())==0){
               returnValue = PartcomprsTmp.getDescad().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getDESCRIP().getValue())==0){
               returnValue = PartcomprsTmp.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getDESCU().getValue())==0){
               returnValue = PartcomprsTmp.getDescu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getDEVS().getValue())==0){
               returnValue = String.valueOf(PartcomprsTmp.getDevs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getESKIT().getValue())==0){
               returnValue = PartcomprsTmp.isEskit()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getESTAC().getValue())==0){
               returnValue = PartcomprsTmp.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getFALT().getValue())==0){
               returnValue = PartcomprsTmp.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getFLOTVENC().getValue())==0){
               returnValue = PartcomprsTmp.getFlotvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getFMOD().getValue())==0){
               returnValue = PartcomprsTmp.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getGARAN().getValue())==0){
               returnValue = PartcomprsTmp.getGaran();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getIDKIT().getValue())==0){
               returnValue = String.valueOf(PartcomprsTmp.getIdkit());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getIMPO().getValue())==0){
               returnValue = PartcomprsTmp.getImpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getIMPUE().getValue())==0){
               returnValue = PartcomprsTmp.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getKITMAE().getValue())==0){
               returnValue = PartcomprsTmp.isKitmae()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getLOT().getValue())==0){
               returnValue = PartcomprsTmp.getLot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getLOTEPEDIMENTO().getValue())==0){
               returnValue = String.valueOf(PartcomprsTmp.getLotePedimento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getMON().getValue())==0){
               returnValue = PartcomprsTmp.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getNOCAJ().getValue())==0){
               returnValue = PartcomprsTmp.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getPEDIMEN().getValue())==0){
               returnValue = PartcomprsTmp.getPedimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getPEPS().getValue())==0){
               returnValue = PartcomprsTmp.getPeps().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getPROD().getValue())==0){
               returnValue = PartcomprsTmp.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getRECIB().getValue())==0){
               returnValue = PartcomprsTmp.getRecib().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getSERPROD().getValue())==0){
               returnValue = PartcomprsTmp.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getSUCU().getValue())==0){
               returnValue = PartcomprsTmp.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getTALL().getValue())==0){
               returnValue = PartcomprsTmp.getTall();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getTIPCAM().getValue())==0){
               returnValue = PartcomprsTmp.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getUEPS().getValue())==0){
               returnValue = PartcomprsTmp.getUeps().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprsTmpsTableHeader().getUNID().getValue())==0){
               returnValue = PartcomprsTmp.getUnid();
           }
           return returnValue;
       };
   }
}