package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.GeneralConfig;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class GeneralConfigTableModel  extends BaseAbstractTableModel {

   public GeneralConfigTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final GeneralConfig GeneralConfig = (GeneralConfig) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getCASIFICATION().getValue())==0){
               returnValue = GeneralConfig.getCasification();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getCONFIGURATION().getValue())==0){
               returnValue = GeneralConfig.getConfiguration();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getDAY().getValue())==0){
               returnValue = String.valueOf(GeneralConfig.getDay());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getESTAC().getValue())==0){
               returnValue = GeneralConfig.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getEXTRA().getValue())==0){
               returnValue = GeneralConfig.getExtra();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getFALT().getValue())==0){
               returnValue = GeneralConfig.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getFMOD().getValue())==0){
               returnValue = GeneralConfig.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getNOCAJ().getValue())==0){
               returnValue = GeneralConfig.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getNUMBER().getValue())==0){
               returnValue = String.valueOf(GeneralConfig.getNumber());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getNUMEXT().getValue())==0){
               returnValue = GeneralConfig.getNumext().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getRAZON().getValue())==0){
               returnValue = GeneralConfig.getRazon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getSUCU().getValue())==0){
               returnValue = GeneralConfig.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getVALUE().getValue())==0){
               returnValue = String.valueOf(GeneralConfig.getValue());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getYEAR().getValue())==0){
               returnValue = String.valueOf(GeneralConfig.getYear());
           }
           return returnValue;
       };
   }
}