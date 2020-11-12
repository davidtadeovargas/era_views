package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Partprevcomprs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class PartprevcomprsTableModel  extends BaseAbstractTableModel {

   public PartprevcomprsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Partprevcomprs Partprevcomprs = (Partprevcomprs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getACTIVO().getValue())==0){
               returnValue = Partprevcomprs.getActivo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getALMA().getValue())==0){
               returnValue = Partprevcomprs.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getAPLIC().getValue())==0){
               returnValue = Partprevcomprs.isAplic()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getCANT().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getCant());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getCANTLOTPEND().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getCantlotpend());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getCODCOM().getValue())==0){
               returnValue = Partprevcomprs.getCodcom();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getCODIMPUE().getValue())==0){
               returnValue = Partprevcomprs.getCodimpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getCOMENSER().getValue())==0){
               returnValue = Partprevcomprs.getComenser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getCOST().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getCost());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getCOSTPRO().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getCostpro());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getDESCAD().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getDescad());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Partprevcomprs.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getDESCU().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getDescu());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getDEVS().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getDevs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getESKIT().getValue())==0){
               returnValue = Partprevcomprs.isEskit()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getESTAC().getValue())==0){
               returnValue = Partprevcomprs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getFALT().getValue())==0){
               returnValue = Partprevcomprs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getFLOTVENC().getValue())==0){
               returnValue = Partprevcomprs.getFlotvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getFMOD().getValue())==0){
               returnValue = Partprevcomprs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getGARAN().getValue())==0){
               returnValue = Partprevcomprs.getGaran();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getIDKIT().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getIdkit());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getIMPO().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getImpo());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getIMPUE().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getImpue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getKITMAE().getValue())==0){
               returnValue = Partprevcomprs.isKitmae()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getLOT().getValue())==0){
               returnValue = Partprevcomprs.getLot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getMON().getValue())==0){
               returnValue = Partprevcomprs.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Partprevcomprs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getPEDIMEN().getValue())==0){
               returnValue = Partprevcomprs.getPedimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getPEPS().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getPeps());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getPROD().getValue())==0){
               returnValue = Partprevcomprs.getProd();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getRECIB().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getRecib());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getSERPROD().getValue())==0){
               returnValue = Partprevcomprs.getSerprod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getSUCU().getValue())==0){
               returnValue = Partprevcomprs.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getTIPCAM().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getTipcam());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getUEPS().getValue())==0){
               returnValue = String.valueOf(Partprevcomprs.getUeps());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPartprevcomprssTableHeader().getUNID().getValue())==0){
               returnValue = Partprevcomprs.getUnid();
           }
           return returnValue;
       };
   }
}