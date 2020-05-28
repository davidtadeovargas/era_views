package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.GeneralConfig;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class GeneralConfigTableModel  extends BaseAbstractTableModel {

   public GeneralConfigTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final GeneralConfig GeneralConfig = (GeneralConfig) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = GeneralConfig.getCashNumber();
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
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getEXTRA().getValue())==0){
               returnValue = GeneralConfig.getExtra();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getFALT().getValue())==0){
               returnValue = GeneralConfig.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getFMOD().getValue())==0){
               returnValue = GeneralConfig.getFmod().toString();
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
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getSTATION().getValue())==0){
               returnValue = GeneralConfig.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGeneralConfigsTableHeader().getSUCURSAL().getValue())==0){
               returnValue = GeneralConfig.getSucursal();
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