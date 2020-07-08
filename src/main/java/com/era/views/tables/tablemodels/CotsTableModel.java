package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Cots;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CotsTableModel  extends BaseAbstractTableModel {

   public CotsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Cots Cots = (Cots) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getMONEDAID().getValue())==0){
               returnValue = String.valueOf(Cots.getMonedaID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getCODCOT().getValue())==0){
               returnValue = Cots.getCodcot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getCODEMP().getValue())==0){
               returnValue = Cots.getCodemp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Cots.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getESTAC().getValue())==0){
               returnValue = Cots.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getESTAD().getValue())==0){
               returnValue = Cots.getEstad();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getFALT().getValue())==0){
               returnValue = Cots.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getFDOC().getValue())==0){
               returnValue = Cots.getFdoc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getFENTRE().getValue())==0){
               returnValue = Cots.getFentre().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getFMOD().getValue())==0){
               returnValue = Cots.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getFVENC().getValue())==0){
               returnValue = Cots.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getIMPUE().getValue())==0){
               returnValue = String.valueOf(Cots.getImpue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getMANOBR().getValue())==0){
               returnValue = String.valueOf(Cots.getManobr());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getMON().getValue())==0){
               returnValue = Cots.getMon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getMOTIV().getValue())==0){
               returnValue = Cots.getMotiv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Cots.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getNOREFER().getValue())==0){
               returnValue = Cots.getNorefer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getNOSER().getValue())==0){
               returnValue = Cots.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getNOSERVTA().getValue())==0){
               returnValue = Cots.getNoservta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getOBSERV().getValue())==0){
               returnValue = Cots.getObserv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getPROY().getValue())==0){
               returnValue = Cots.getProy();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getSER().getValue())==0){
               returnValue = Cots.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getSUBTOT().getValue())==0){
               returnValue = String.valueOf(Cots.getSubtot());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getSUBTOTGRAL().getValue())==0){
               returnValue = String.valueOf(Cots.getSubtotgral());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getSUBTOTGRAL2().getValue())==0){
               returnValue = String.valueOf(Cots.getSubtotgral2());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getSUBTOTMAT().getValue())==0){
               returnValue = String.valueOf(Cots.getSubtotmat());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getSUBTOTMAT2().getValue())==0){
               returnValue = String.valueOf(Cots.getSubtotmat2());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getSUCU().getValue())==0){
               returnValue = Cots.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getTIPCAM().getValue())==0){
               returnValue = String.valueOf(Cots.getTipcam());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getTOT().getValue())==0){
               returnValue = String.valueOf(Cots.getTot());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getTOTAL_RETENCION().getValue())==0){
               returnValue = Cots.getTotal_retencion().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getTOTAL_TRASLADO().getValue())==0){
               returnValue = Cots.getTotal_traslado().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getTOTCOST().getValue())==0){
               returnValue = String.valueOf(Cots.getTotcost());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getTOTDESCU().getValue())==0){
               returnValue = String.valueOf(Cots.getTotdescu());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCotssTableHeader().getVTA().getValue())==0){
               returnValue = String.valueOf(Cots.getVta());
           }
           return returnValue;
       };
   }
}