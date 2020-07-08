package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Cortszx;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CortszxTableModel  extends BaseAbstractTableModel {

   public CortszxTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Cortszx Cortszx = (Cortszx) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getCANTFAC().getValue())==0){
               returnValue = String.valueOf(Cortszx.getCantfac());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getCANTTICS().getValue())==0){
               returnValue = String.valueOf(Cortszx.getCanttics());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getCORT().getValue())==0){
               returnValue = Cortszx.getCort();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getDESCU().getValue())==0){
               returnValue = String.valueOf(Cortszx.getDescu());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getDEVS().getValue())==0){
               returnValue = String.valueOf(Cortszx.getDevs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getESTAC().getValue())==0){
               returnValue = Cortszx.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getFALT().getValue())==0){
               returnValue = Cortszx.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getFMOD().getValue())==0){
               returnValue = Cortszx.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getIMPUE().getValue())==0){
               returnValue = String.valueOf(Cortszx.getImpue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Cortszx.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getNUMCORT().getValue())==0){
               returnValue = String.valueOf(Cortszx.getNumcort());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getREGIS().getValue())==0){
               returnValue = String.valueOf(Cortszx.isRegis());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getSUCU().getValue())==0){
               returnValue = Cortszx.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTCAJ().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotcaj());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTDEB().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotdeb());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTDEP().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotdep());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTEFE().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotefe());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTEGRE().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotegre());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTFACS().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotfacs());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTINGR().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotingr());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTTARCRED().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTottarcred());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTTICS().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTottics());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getTOTVTAS().getValue())==0){
               returnValue = String.valueOf(Cortszx.getTotvtas());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getVTABRUTA().getValue())==0){
               returnValue = String.valueOf(Cortszx.getVtabruta());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getVTANET().getValue())==0){
               returnValue = String.valueOf(Cortszx.getVtanet());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCortszxsTableHeader().getVTANETIMP().getValue())==0){
               returnValue = String.valueOf(Cortszx.getVtanetimp());
           }
           return returnValue;
       };
   }
}