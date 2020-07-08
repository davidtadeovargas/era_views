package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Corrselec;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CorrselecTableModel  extends BaseAbstractTableModel {

   public CorrselecTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Corrselec Corrselec = (Corrselec) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getACTSLENLOG().getValue())==0){
               returnValue = Corrselec.isActslenlog()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCORRALTER().getValue())==0){
               returnValue = Corrselec.getCorralter();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getESTAC().getValue())==0){
               returnValue = Corrselec.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getESTACGLO().getValue())==0){
               returnValue = Corrselec.getEstacglo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getFALT().getValue())==0){
               returnValue = Corrselec.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getFMOD().getValue())==0){
               returnValue = Corrselec.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Corrselec.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getPASS().getValue())==0){
               returnValue = Corrselec.getPass();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getPORTSMTP().getValue())==0){
               returnValue = String.valueOf(Corrselec.getPortsmtp());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getSRVSMTPSAL().getValue())==0){
               returnValue = Corrselec.getSrvsmtpsal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getSUCU().getValue())==0){
               returnValue = Corrselec.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getUSR().getValue())==0){
               returnValue = Corrselec.getUsr();
           }
           return returnValue;
       };
   }
}