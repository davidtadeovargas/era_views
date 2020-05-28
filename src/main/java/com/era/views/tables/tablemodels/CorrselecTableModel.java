package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Corrselec;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CorrselecTableModel  extends BaseAbstractTableModel {

   public CorrselecTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Corrselec Corrselec = (Corrselec) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getACTSLENLOG().getValue())==0){
               returnValue = Corrselec.isActslenlog()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getASUNCONTRA().getValue())==0){
               returnValue = Corrselec.getAsuncontra();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getASUNCOT().getValue())==0){
               returnValue = Corrselec.getAsuncot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getASUNFAC().getValue())==0){
               returnValue = Corrselec.getAsunfac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getASUNORD().getValue())==0){
               returnValue = Corrselec.getAsunord();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getASUNREC1().getValue())==0){
               returnValue = Corrselec.getAsunrec1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getASUNREC2().getValue())==0){
               returnValue = Corrselec.getAsunrec2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getASUNREC3().getValue())==0){
               returnValue = Corrselec.getAsunrec3();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCORRALTER().getValue())==0){
               returnValue = Corrselec.getCorralter();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCUERPCONTRA().getValue())==0){
               returnValue = Corrselec.getCuerpcontra();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCUERPCOT().getValue())==0){
               returnValue = Corrselec.getCuerpcot();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCUERPFAC().getValue())==0){
               returnValue = Corrselec.getCuerpfac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCUERPORD().getValue())==0){
               returnValue = Corrselec.getCuerpord();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCUERPREC1().getValue())==0){
               returnValue = Corrselec.getCuerprec1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCUERPREC2().getValue())==0){
               returnValue = Corrselec.getCuerprec2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCorrselecsTableHeader().getCUERPREC3().getValue())==0){
               returnValue = Corrselec.getCuerprec3();
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