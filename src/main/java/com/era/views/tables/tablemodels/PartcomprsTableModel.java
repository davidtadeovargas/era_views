package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Partcomprs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PartcomprsTableModel  extends BaseAbstractTableModel {

   public PartcomprsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Partcomprs Partcomprs = (Partcomprs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getACTIVO().getValue())==0){
               returnValue = Partcomprs.getActivo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getALMA().getValue())==0){
               returnValue = Partcomprs.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getAPLIC().getValue())==0){
               returnValue = Partcomprs.isAplic()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Partcomprs.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCANTLOTPEND().getValue())==0){
               returnValue = Partcomprs.getCantlotpend().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCODCOM().getValue())==0){
               returnValue = Partcomprs.getCodcom();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCODIMPUE().getValue())==0){
               returnValue = Partcomprs.getCodimpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCOLO().getValue())==0){
               returnValue = Partcomprs.getColo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCOMENSER().getValue())==0){
               returnValue = Partcomprs.getComenser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCOST().getValue())==0){
               returnValue = Partcomprs.getCost().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCOSTPRO().getValue())==0){
               returnValue = Partcomprs.getCostpro().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getCUENTACONTABLE().getValue())==0){
               returnValue = Partcomprs.getCuentacontable();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getDESCAD().getValue())==0){
               returnValue = Partcomprs.getDescad().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Partcomprs.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getDESCU().getValue())==0){
               returnValue = Partcomprs.getDescu().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getDEVS().getValue())==0){
               returnValue = String.valueOf(Partcomprs.getDevs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getESKIT().getValue())==0){
               returnValue = Partcomprs.isEskit()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getESTAC().getValue())==0){
               returnValue = Partcomprs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getFALT().getValue())==0){
               returnValue = Partcomprs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getFLOTVENC().getValue())==0){
               returnValue = Partcomprs.getFlotvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getFMOD().getValue())==0){
               returnValue = Partcomprs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getGARAN().getValue())==0){
               returnValue = Partcomprs.getGaran();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getIDKIT().getValue())==0){
               returnValue = String.valueOf(Partcomprs.getIdkit());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getIMPO().getValue())==0){
               returnValue = Partcomprs.getImpo().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getIMPUE().getValue())==0){
               returnValue = Partcomprs.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getKITMAE().getValue())==0){
               returnValue = Partcomprs.isKitmae()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getLOT().getValue())==0){
               returnValue = Partcomprs.getLot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getLOTEPEDIMENTO().getValue())==0){
               returnValue = String.valueOf(Partcomprs.getLotePedimento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getMON().getValue())==0){
               returnValue = Partcomprs.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Partcomprs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getPEDIMEN().getValue())==0){
               returnValue = Partcomprs.getPedimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getPEPS().getValue())==0){
               returnValue = Partcomprs.getPeps().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getPROD().getValue())==0){
               returnValue = Partcomprs.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getRECIB().getValue())==0){
               returnValue = Partcomprs.getRecib().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getSERPROD().getValue())==0){
               returnValue = Partcomprs.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getSUCU().getValue())==0){
               returnValue = Partcomprs.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getTALL().getValue())==0){
               returnValue = Partcomprs.getTall();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getTIPCAM().getValue())==0){
               returnValue = Partcomprs.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getUEPS().getValue())==0){
               returnValue = Partcomprs.getUeps().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartcomprssTableHeader().getUNID().getValue())==0){
               returnValue = Partcomprs.getUnid();
           }
           return returnValue;
       };
   }
}