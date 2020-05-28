package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Supplier;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class SupplierTableModel  extends BaseAbstractTableModel {

   public SupplierTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Supplier Supplier = (Supplier) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getACCOUNT().getValue())==0){
               returnValue = Supplier.getAccount();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getANOTHERCOIN().getValue())==0){
               returnValue = Supplier.isAnotherCoin()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getANOTHERCOINC().getValue())==0){
               returnValue = Supplier.isAnotherCoinC()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getBANK().getValue())==0){
               returnValue = Supplier.getBank();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getBLOQ().getValue())==0){
               returnValue = Supplier.isBloq()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getBLOQLIMCRED().getValue())==0){
               returnValue = Supplier.isBloqlimcred()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCELPHONE().getValue())==0){
               returnValue = Supplier.getCelphone();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCITY().getValue())==0){
               returnValue = Supplier.getCity();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCLASIFICATIONCODE().getValue())==0){
               returnValue = Supplier.getClasificationCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCLAVEBANK().getValue())==0){
               returnValue = Supplier.getClaveBank();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCODE().getValue())==0){
               returnValue = Supplier.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCOLONY().getValue())==0){
               returnValue = Supplier.getColony();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCONTABLEACCOUNT().getValue())==0){
               returnValue = Supplier.getContableAccount();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCONTAC4().getValue())==0){
               returnValue = Supplier.getContac4();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCOUNTRY().getValue())==0){
               returnValue = Supplier.getCountry();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCP().getValue())==0){
               returnValue = Supplier.getCp();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getCREDITDAYS().getValue())==0){
               returnValue = Supplier.getCreditDays();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERCP().getValue())==0){
               returnValue = Supplier.getDeliverCP();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERCELLPHONE().getValue())==0){
               returnValue = Supplier.getDeliverCellphone();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERCITY().getValue())==0){
               returnValue = Supplier.getDeliverCity();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERCOLONY().getValue())==0){
               returnValue = Supplier.getDeliverColony();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERCOUNTRY().getValue())==0){
               returnValue = Supplier.getDeliverCountry();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVEREMAIL1().getValue())==0){
               returnValue = Supplier.getDeliverEmail1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVEREMAIL2().getValue())==0){
               returnValue = Supplier.getDeliverEmail2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVEREMAIL3().getValue())==0){
               returnValue = Supplier.getDeliverEmail3();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERESTATE().getValue())==0){
               returnValue = Supplier.getDeliverEstate();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERINTERNALNUMBER().getValue())==0){
               returnValue = Supplier.getDeliverInternalNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERLADA().getValue())==0){
               returnValue = Supplier.getDeliverLada();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERSTREET().getValue())==0){
               returnValue = Supplier.getDeliverStreet();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDELIVERYEXTERNALNUMBER().getValue())==0){
               returnValue = Supplier.getDeliveryExternalNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getDISCCOUNT().getValue())==0){
               returnValue = String.valueOf(Supplier.getDisccount());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getEMAIL1().getValue())==0){
               returnValue = Supplier.getEmail1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getEMAIL2().getValue())==0){
               returnValue = Supplier.getEmail2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getEMAIL3().getValue())==0){
               returnValue = Supplier.getEmail3();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getESTAC().getValue())==0){
               returnValue = Supplier.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getESTATE().getValue())==0){
               returnValue = Supplier.getEstate();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getEXTENSION().getValue())==0){
               returnValue = Supplier.getExtension();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getEXTERNALNUMBER().getValue())==0){
               returnValue = Supplier.getExternalNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getFALT().getValue())==0){
               returnValue = Supplier.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getFMOD().getValue())==0){
               returnValue = Supplier.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getGIRO().getValue())==0){
               returnValue = Supplier.getGiro();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getINTERIORNUMBER().getValue())==0){
               returnValue = Supplier.getInteriorNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getJERARCHYCLASIFICATION().getValue())==0){
               returnValue = Supplier.getJerarchyClasification();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getLADA().getValue())==0){
               returnValue = Supplier.getLada();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getNAME().getValue())==0){
               returnValue = Supplier.getName();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getNOCAJ().getValue())==0){
               returnValue = Supplier.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getOBSERVATIONS().getValue())==0){
               returnValue = Supplier.getObservations();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getPAYMENTMETHOD().getValue())==0){
               returnValue = Supplier.getPaymentMethod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getPAYMENTS().getValue())==0){
               returnValue = Supplier.getPayments();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getPERS().getValue())==0){
               returnValue = Supplier.getPers();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getPERSONALPHONE1().getValue())==0){
               returnValue = Supplier.getPersonalPhone1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getPERSONALPHONE2().getValue())==0){
               returnValue = Supplier.getPersonalPhone2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getPHONE().getValue())==0){
               returnValue = Supplier.getPhone();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getREVISION().getValue())==0){
               returnValue = Supplier.getRevision();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getRFC().getValue())==0){
               returnValue = Supplier.getRfc();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getSERIE().getValue())==0){
               returnValue = Supplier.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getSTREET().getValue())==0){
               returnValue = Supplier.getStreet();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getSUCU().getValue())==0){
               returnValue = Supplier.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getTELCON3().getValue())==0){
               returnValue = Supplier.getTelcon3();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getTELCON4().getValue())==0){
               returnValue = Supplier.getTelcon4();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getTELPER3().getValue())==0){
               returnValue = Supplier.getTelper3();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getTELPER33().getValue())==0){
               returnValue = Supplier.getTelper33();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getWEBPAGE1().getValue())==0){
               returnValue = Supplier.getWebpage1();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getWEBPAGE2().getValue())==0){
               returnValue = Supplier.getWebpage2();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSuppliersTableHeader().getZONE().getValue())==0){
               returnValue = Supplier.getZone();
           }
           return returnValue;
       };
   }
}