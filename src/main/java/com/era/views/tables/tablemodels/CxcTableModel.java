package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Cxc;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CxcTableModel  extends BaseAbstractTableModel {

   public CxcTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Cxc Cxc = (Cxc) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getABON().getValue())==0){
               returnValue = Cxc.getAbon().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCARG().getValue())==0){
               returnValue = Cxc.getCarg().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCOMEN().getValue())==0){
               returnValue = Cxc.getComen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCONCEP().getValue())==0){
               returnValue = Cxc.getConcep();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCONCEPPAG().getValue())==0){
               returnValue = Cxc.getConceppag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getCUENTABANCO().getValue())==0){
               returnValue = Cxc.getCuentabanco();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getEMPRE().getValue())==0){
               returnValue = Cxc.getEmpre();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getESTAC().getValue())==0){
               returnValue = Cxc.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getESTADO().getValue())==0){
               returnValue = Cxc.getEstado();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFALT().getValue())==0){
               returnValue = Cxc.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFDOC().getValue())==0){
               returnValue = Cxc.getFdoc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFMOD().getValue())==0){
               returnValue = Cxc.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFOL().getValue())==0){
               returnValue = String.valueOf(Cxc.getFol());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFOLBANC().getValue())==0){
               returnValue = Cxc.getFolbanc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFORMPAG().getValue())==0){
               returnValue = Cxc.getFormpag();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getFVENC().getValue())==0){
               returnValue = Cxc.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getID_VENTA().getValue())==0){
               returnValue = String.valueOf(Cxc.getId_venta());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getIMPUE().getValue())==0){
               returnValue = Cxc.getImpue().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getMONEDAID().getValue())==0){
               returnValue = String.valueOf(Cxc.getMonedaID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Cxc.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getNOREFER().getValue())==0){
               returnValue = Cxc.getNorefer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getNOSER().getValue())==0){
               returnValue = Cxc.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getSER().getValue())==0){
               returnValue = Cxc.getSer();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getSUBTOT().getValue())==0){
               returnValue = Cxc.getSubtot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getSUCU().getValue())==0){
               returnValue = Cxc.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getTIPCAM().getValue())==0){
               returnValue = Cxc.getTipcam().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getTOT().getValue())==0){
               returnValue = Cxc.getTot().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCxcsTableHeader().getVENTA_ORIGEN().getValue())==0){
               returnValue = String.valueOf(Cxc.getVenta_origen());
           }
           return returnValue;
       };
   }
}