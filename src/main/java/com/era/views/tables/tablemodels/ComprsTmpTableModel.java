package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ComprsTmp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ComprsTmpTableModel  extends BaseAbstractTableModel {

   public ComprsTmpTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final ComprsTmp ComprsTmp = (ComprsTmp) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getARCHPDF().getValue())==0){
               returnValue = ComprsTmp.isArchpdf()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getARCHXML().getValue())==0){
               returnValue = ComprsTmp.isArchxml()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getCODCOMP().getValue())==0){
               returnValue = ComprsTmp.getCodcomp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getCODORD().getValue())==0){
               returnValue = ComprsTmp.getCodord();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getCONCEP().getValue())==0){
               returnValue = ComprsTmp.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getCONTRA().getValue())==0){
               returnValue = String.valueOf(ComprsTmp.getContra());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getCTA().getValue())==0){
               returnValue = ComprsTmp.getCta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getESTAC().getValue())==0){
               returnValue = ComprsTmp.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getESTADO().getValue())==0){
               returnValue = ComprsTmp.getEstado();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getFALT().getValue())==0){
               returnValue = ComprsTmp.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getFDOC().getValue())==0){
               returnValue = ComprsTmp.getFdoc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getFENT().getValue())==0){
               returnValue = ComprsTmp.getFent().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getFMOD().getValue())==0){
               returnValue = ComprsTmp.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getFVENC().getValue())==0){
               returnValue = ComprsTmp.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getIMPUE().getValue())==0){
               returnValue = ComprsTmp.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getMETPAG().getValue())==0){
               returnValue = ComprsTmp.getMetpag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getMONEDAID().getValue())==0){
               returnValue = String.valueOf(ComprsTmp.getMonedaID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getMOTIV().getValue())==0){
               returnValue = ComprsTmp.getMotiv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getNOCAJ().getValue())==0){
               returnValue = ComprsTmp.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getNODOC().getValue())==0){
               returnValue = ComprsTmp.getNodoc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getNOMPROV().getValue())==0){
               returnValue = ComprsTmp.getNomprov();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getNOSER().getValue())==0){
               returnValue = ComprsTmp.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getNOTCRED().getValue())==0){
               returnValue = ComprsTmp.getNotcred();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getNOTCREDPAG().getValue())==0){
               returnValue = ComprsTmp.getNotcredpag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getOBSERV().getValue())==0){
               returnValue = ComprsTmp.getObserv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getPROV().getValue())==0){
               returnValue = ComprsTmp.getProv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getRECIB().getValue())==0){
               returnValue = ComprsTmp.getRecib().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getREFERENCIA().getValue())==0){
               returnValue = ComprsTmp.getReferencia();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getRUTA().getValue())==0){
               returnValue = ComprsTmp.getRuta();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getSER().getValue())==0){
               returnValue = ComprsTmp.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getSUBTOT().getValue())==0){
               returnValue = ComprsTmp.getSubtot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getSUCU().getValue())==0){
               returnValue = ComprsTmp.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getTIP().getValue())==0){
               returnValue = ComprsTmp.getTip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getTIPCAM().getValue())==0){
               returnValue = ComprsTmp.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getTIPCAMNAC().getValue())==0){
               returnValue = ComprsTmp.getTipcamnac().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getTOT().getValue())==0){
               returnValue = ComprsTmp.getTot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getTOTAL_RETENCION().getValue())==0){
               returnValue = ComprsTmp.getTotal_retencion().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getComprsTmpsTableHeader().getTOTAL_TRASLADO().getValue())==0){
               returnValue = ComprsTmp.getTotal_traslado().toString();
           }
           return returnValue;
       };
   }
}