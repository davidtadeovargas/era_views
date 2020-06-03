package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Prevcomprs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PrevcomprsTableModel  extends BaseAbstractTableModel {

   public PrevcomprsTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Prevcomprs Prevcomprs = (Prevcomprs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getCODCOMP().getValue())==0){
               returnValue = Prevcomprs.getCodcomp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getCODE().getValue())==0){
               returnValue = Prevcomprs.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getESTAC().getValue())==0){
               returnValue = Prevcomprs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getESTADO().getValue())==0){
               returnValue = Prevcomprs.getEstado();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getFALT().getValue())==0){
               returnValue = Prevcomprs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getFDOC().getValue())==0){
               returnValue = Prevcomprs.getFdoc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getFENT().getValue())==0){
               returnValue = Prevcomprs.getFent().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getFMOD().getValue())==0){
               returnValue = Prevcomprs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getFVENC().getValue())==0){
               returnValue = Prevcomprs.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getIMPUE().getValue())==0){
               returnValue = String.valueOf(Prevcomprs.getImpue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getMON().getValue())==0){
               returnValue = Prevcomprs.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getMOTIV().getValue())==0){
               returnValue = Prevcomprs.getMotiv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Prevcomprs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getNODOC().getValue())==0){
               returnValue = Prevcomprs.getNodoc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getNOSER().getValue())==0){
               returnValue = Prevcomprs.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getNOSERCOMP().getValue())==0){
               returnValue = Prevcomprs.getNosercomp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getNOTCREDPAG().getValue())==0){
               returnValue = Prevcomprs.getNotcredpag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getOBSERV().getValue())==0){
               returnValue = Prevcomprs.getObserv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getPROV().getValue())==0){
               returnValue = Prevcomprs.getProv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getRUTA().getValue())==0){
               returnValue = Prevcomprs.getRuta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getSER().getValue())==0){
               returnValue = Prevcomprs.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getSUBTOT().getValue())==0){
               returnValue = String.valueOf(Prevcomprs.getSubtot());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getSUCU().getValue())==0){
               returnValue = Prevcomprs.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getTIP().getValue())==0){
               returnValue = Prevcomprs.getTip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getTIPCAM().getValue())==0){
               returnValue = String.valueOf(Prevcomprs.getTipcam());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPrevcomprssTableHeader().getTOT().getValue())==0){
               returnValue = String.valueOf(Prevcomprs.getTot());
           }
           return returnValue;
       };
   }
}