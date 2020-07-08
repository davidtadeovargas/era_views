package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Traspas;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class TraspasTableModel  extends BaseAbstractTableModel {

   public TraspasTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Traspas Traspas = (Traspas) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getUSUARIORESPONSABLETRAS().getValue())==0){
               returnValue = Traspas.getUsuarioResponsableTras();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getALMA().getValue())==0){
               returnValue = Traspas.getAlma();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getALMAA().getValue())==0){
               returnValue = Traspas.getAlmaa();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getCANTENT().getValue())==0){
               returnValue = String.valueOf(Traspas.getCantent());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getCANTSAL().getValue())==0){
               returnValue = String.valueOf(Traspas.getCantsal());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getCODE().getValue())==0){
               returnValue = Traspas.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getCONCEP().getValue())==0){
               returnValue = Traspas.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getCOSTO().getValue())==0){
               returnValue = Traspas.getCosto().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getESTAC().getValue())==0){
               returnValue = Traspas.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getESTADO().getValue())==0){
               returnValue = Traspas.getEstado();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getFALT().getValue())==0){
               returnValue = Traspas.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getFMOD().getValue())==0){
               returnValue = Traspas.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getLOTEPEDIMENTO().getValue())==0){
               returnValue = String.valueOf(Traspas.getLotePedimento());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getNOCAJ().getValue())==0){
               returnValue = Traspas.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getREPORTEENTRADA().getValue())==0){
               returnValue = Traspas.getReporteEntrada();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getREPORTESALIDA().getValue())==0){
               returnValue = Traspas.getReporteSalida();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getSUCU().getValue())==0){
               returnValue = Traspas.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getTraspassTableHeader().getUNID().getValue())==0){
               returnValue = Traspas.getUnid();
           }
           return returnValue;
       };
   }
}