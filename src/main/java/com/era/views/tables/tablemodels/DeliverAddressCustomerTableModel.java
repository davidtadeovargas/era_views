package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.DeliverAddressCustomer;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class DeliverAddressCustomerTableModel  extends BaseAbstractTableModel {

   public DeliverAddressCustomerTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final DeliverAddressCustomer DeliverAddressCustomer = (DeliverAddressCustomer) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getCP().getValue())==0){
               returnValue = DeliverAddressCustomer.getCP();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = DeliverAddressCustomer.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getCELPHONE().getValue())==0){
               returnValue = DeliverAddressCustomer.getCelphone();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getCITY().getValue())==0){
               returnValue = DeliverAddressCustomer.getCity();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getCOLONY().getValue())==0){
               returnValue = DeliverAddressCustomer.getColony();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getCOUNTRY().getValue())==0){
               returnValue = DeliverAddressCustomer.getCountry();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getCUSTOMERCODE().getValue())==0){
               returnValue = DeliverAddressCustomer.getCustomerCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getEMAIL1().getValue())==0){
               returnValue = DeliverAddressCustomer.getEmail1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getEMAIL2().getValue())==0){
               returnValue = DeliverAddressCustomer.getEmail2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getEMAIL3().getValue())==0){
               returnValue = DeliverAddressCustomer.getEmail3();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getESTATE().getValue())==0){
               returnValue = DeliverAddressCustomer.getEstate();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getEXTENSION().getValue())==0){
               returnValue = DeliverAddressCustomer.getExtension();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getEXTERNALNUMMBER().getValue())==0){
               returnValue = DeliverAddressCustomer.getExternalNummber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getFALT().getValue())==0){
               returnValue = DeliverAddressCustomer.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getFMOD().getValue())==0){
               returnValue = DeliverAddressCustomer.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getINTERIORNUMBER().getValue())==0){
               returnValue = DeliverAddressCustomer.getInteriorNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getLADA().getValue())==0){
               returnValue = DeliverAddressCustomer.getLada();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getPERSONALPHONE1().getValue())==0){
               returnValue = DeliverAddressCustomer.getPersonalPhone1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getPERSONALPHONE2().getValue())==0){
               returnValue = DeliverAddressCustomer.getPersonalPhone2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getPHONE().getValue())==0){
               returnValue = DeliverAddressCustomer.getPhone();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getSTATION().getValue())==0){
               returnValue = DeliverAddressCustomer.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getSTREET().getValue())==0){
               returnValue = DeliverAddressCustomer.getStreet();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getDeliverAddressCustomersTableHeader().getSUCURSAL().getValue())==0){
               returnValue = DeliverAddressCustomer.getSucursal();
           }
           return returnValue;
       };
   }
}