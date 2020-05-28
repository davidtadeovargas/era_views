package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.License;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class LicenseTableModel  extends BaseAbstractTableModel {

   public LicenseTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final License License = (License) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getCHANNEL().getValue())==0){
               returnValue = License.getChannel();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getESTAC().getValue())==0){
               returnValue = License.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getFALT().getValue())==0){
               returnValue = License.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getFMOD().getValue())==0){
               returnValue = License.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getNOCAJ().getValue())==0){
               returnValue = License.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getPASSWORD().getValue())==0){
               returnValue = License.getPassword();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getREMAININGDAYS().getValue())==0){
               returnValue = String.valueOf(License.getRemainingDays());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getSERVERDATE().getValue())==0){
               returnValue = License.getServerDate();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getSUCU().getValue())==0){
               returnValue = License.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getUSER().getValue())==0){
               returnValue = License.getUser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getLicensesTableHeader().getUSERS().getValue())==0){
               returnValue = String.valueOf(License.getUsers());
           }
           return returnValue;
       };
   }
}