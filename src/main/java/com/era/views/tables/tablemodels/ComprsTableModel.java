package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Comprs;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class ComprsTableModel  extends BaseAbstractTableModel {

   public ComprsTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Comprs Comprs = (Comprs) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getARCHPDF().getValue())==0){
               returnValue = Comprs.isArchpdf()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getARCHXML().getValue())==0){
               returnValue = Comprs.isArchxml()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getCODCOMP().getValue())==0){
               returnValue = Comprs.getCodcomp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getCODORD().getValue())==0){
               returnValue = Comprs.getCodord();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getCONCEP().getValue())==0){
               returnValue = Comprs.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getCONTRA().getValue())==0){
               returnValue = String.valueOf(Comprs.getContra());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getCTA().getValue())==0){
               returnValue = Comprs.getCta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getESTAC().getValue())==0){
               returnValue = Comprs.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getESTADO().getValue())==0){
               returnValue = Comprs.getEstado();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getFALT().getValue())==0){
               returnValue = Comprs.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getFDOC().getValue())==0){
               returnValue = Comprs.getFdoc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getFENT().getValue())==0){
               returnValue = Comprs.getFent().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getFMOD().getValue())==0){
               returnValue = Comprs.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getFVENC().getValue())==0){
               returnValue = Comprs.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getIMPUE().getValue())==0){
               returnValue = Comprs.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getMETPAG().getValue())==0){
               returnValue = Comprs.getMetpag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getMONEDAID().getValue())==0){
               returnValue = String.valueOf(Comprs.getMonedaID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getMOTIV().getValue())==0){
               returnValue = Comprs.getMotiv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Comprs.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getNODOC().getValue())==0){
               returnValue = Comprs.getNodoc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getNOMPROV().getValue())==0){
               returnValue = Comprs.getNomprov();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getNOSER().getValue())==0){
               returnValue = Comprs.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getNOTCRED().getValue())==0){
               returnValue = Comprs.getNotcred();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getNOTCREDPAG().getValue())==0){
               returnValue = Comprs.getNotcredpag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getOBSERV().getValue())==0){
               returnValue = Comprs.getObserv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getPROV().getValue())==0){
               returnValue = Comprs.getProv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getRECIB().getValue())==0){
               returnValue = Comprs.getRecib().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getREFERENCIA().getValue())==0){
               returnValue = Comprs.getReferencia();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getRUTA().getValue())==0){
               returnValue = Comprs.getRuta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getSER().getValue())==0){
               returnValue = Comprs.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getSUBTOT().getValue())==0){
               returnValue = Comprs.getSubtot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getSUCU().getValue())==0){
               returnValue = Comprs.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getTIP().getValue())==0){
               returnValue = Comprs.getTip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getTIPCAM().getValue())==0){
               returnValue = Comprs.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getTIPCAMNAC().getValue())==0){
               returnValue = Comprs.getTipcamnac().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getTOT().getValue())==0){
               returnValue = Comprs.getTot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getTOTAL_RETENCION().getValue())==0){
               returnValue = Comprs.getTotal_retencion().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprssTableHeader().getTOTAL_TRASLADO().getValue())==0){
               returnValue = Comprs.getTotal_traslado().toString();
           }
           return returnValue;
       };
   }
}