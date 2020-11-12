package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Cxp;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CxpTableModel  extends BaseAbstractTableModel {

   public CxpTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Cxp Cxp = (Cxp) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getABON().getValue())==0){
               returnValue = Cxp.getAbon().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getCARG().getValue())==0){
               returnValue = Cxp.getCarg().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getCOMEN().getValue())==0){
               returnValue = Cxp.getComen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getCONCEP().getValue())==0){
               returnValue = Cxp.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getCONCEPPAG().getValue())==0){
               returnValue = Cxp.getConceppag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getCUENTABANCO().getValue())==0){
               returnValue = Cxp.getCuentabanco();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getESTAC().getValue())==0){
               returnValue = Cxp.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getESTADO().getValue())==0){
               returnValue = Cxp.getEstado();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getFALT().getValue())==0){
               returnValue = Cxp.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getFDOC().getValue())==0){
               returnValue = Cxp.getFdoc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getFMOD().getValue())==0){
               returnValue = Cxp.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getFOL().getValue())==0){
               returnValue = String.valueOf(Cxp.getFol());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getFOLBANC().getValue())==0){
               returnValue = Cxp.getFolbanc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getFORMPAG().getValue())==0){
               returnValue = Cxp.getFormpag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getFVENC().getValue())==0){
               returnValue = Cxp.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getIMPUE().getValue())==0){
               returnValue = Cxp.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getMONEDAID().getValue())==0){
               returnValue = String.valueOf(Cxp.getMonedaID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Cxp.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getNOREFER().getValue())==0){
               returnValue = Cxp.getNorefer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getNOSER().getValue())==0){
               returnValue = Cxp.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getPROV().getValue())==0){
               returnValue = Cxp.getProv();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getSER().getValue())==0){
               returnValue = Cxp.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getSUBTOT().getValue())==0){
               returnValue = Cxp.getSubtot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getSUCU().getValue())==0){
               returnValue = Cxp.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getTIPCAM().getValue())==0){
               returnValue = Cxp.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxpsTableHeader().getTOT().getValue())==0){
               returnValue = Cxp.getTot().toString();
           }
           return returnValue;
       };
   }
}