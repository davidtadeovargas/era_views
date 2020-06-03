package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Sales;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class SalesTableModel  extends BaseAbstractTableModel {

   public SalesTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Sales Sales = (Sales) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getACCOUNT().getValue())==0){
               returnValue = Sales.getAccount();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getACTIVE().getValue())==0){
               returnValue = Sales.getActive();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCADORI().getValue())==0){
               returnValue = Sales.getCadori();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCATGRAL().getValue())==0){
               returnValue = Sales.getCatgral();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCERTSAT().getValue())==0){
               returnValue = Sales.getCertsat();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCODECOTIZACION().getValue())==0){
               returnValue = Sales.getCodeCotizacion();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCOINID().getValue())==0){
               returnValue = String.valueOf(Sales.getCoinID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCOMPANYCODE().getValue())==0){
               returnValue = Sales.getCompanyCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCOMPANYID().getValue())==0){
               returnValue = String.valueOf(Sales.getCompanyID());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCORTNUMBER().getValue())==0){
               returnValue = String.valueOf(Sales.getCortNumber());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getCUT().getValue())==0){
               returnValue = Sales.getCut();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getDELIVERDATE().getValue())==0){
               returnValue = Sales.getDeliverDate().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getDELIVEREMAIL1().getValue())==0){
               returnValue = String.valueOf(Sales.getDeliverEmail1());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getDOCUMENTTYPE().getValue())==0){
               returnValue = Sales.getDocumentType();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getEMISIONDATE().getValue())==0){
               returnValue = Sales.getEmisionDate().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getESTAC().getValue())==0){
               returnValue = Sales.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getESTATUS().getValue())==0){
               returnValue = Sales.getEstatus();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getEXCHANGETYPENATIONAL().getValue())==0){
               returnValue = Sales.getExchangeTypeNational().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getEXPEDITIONPLACE().getValue())==0){
               returnValue = Sales.getExpeditionPlace();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getFACTURADO().getValue())==0){
               returnValue = Sales.isFacturado()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getFALT().getValue())==0){
               returnValue = Sales.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getFISCALFOLIO().getValue())==0){
               returnValue = Sales.getFiscalFolio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getFISCALREGIMEN().getValue())==0){
               returnValue = Sales.getFiscalRegimen();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getFMOD().getValue())==0){
               returnValue = Sales.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getFVENC().getValue())==0){
               returnValue = Sales.getFvenc().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getINVOICED().getValue())==0){
               returnValue = Sales.isInvoiced()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getNOCAJ().getValue())==0){
               returnValue = Sales.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getNOSER().getValue())==0){
               returnValue = Sales.getNoser();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getNOTECREDIT().getValue())==0){
               returnValue = Sales.getNoteCredit();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getNOTECREDITIMPORT().getValue())==0){
               returnValue = Sales.getNoteCreditImport().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getNOTECREDITPAYMENT().getValue())==0){
               returnValue = Sales.getNoteCreditPayment();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getOBSERVATION().getValue())==0){
               returnValue = Sales.getObservation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getORIGINSALE().getValue())==0){
               returnValue = String.valueOf(Sales.getOriginSale());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getPAYMENTFORM().getValue())==0){
               returnValue = Sales.getPaymentForm();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getPAYMENTMETHOD().getValue())==0){
               returnValue = Sales.getPaymentMethod();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getRAZON().getValue())==0){
               returnValue = Sales.getRazon();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getREFERENCE().getValue())==0){
               returnValue = Sales.getReference();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getREFERENCENUMBER().getValue())==0){
               returnValue = Sales.getReferenceNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getRELATIONTYPE().getValue())==0){
               returnValue = Sales.getRelationType();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSALEPARCIALDEVOLUTION().getValue())==0){
               returnValue = String.valueOf(Sales.getSaleParcialDevolution());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSALESMAN().getValue())==0){
               returnValue = Sales.getSalesMan();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSALESPOINT().getValue())==0){
               returnValue = Sales.isSalesPoint()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSECTOR().getValue())==0){
               returnValue = Sales.getSector();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSELL().getValue())==0){
               returnValue = Sales.getSell();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSELLSAT().getValue())==0){
               returnValue = Sales.getSellsat();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSERIE().getValue())==0){
               returnValue = Sales.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSUBRAMO().getValue())==0){
               returnValue = Sales.getSubramo();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSUBTOTAL().getValue())==0){
               returnValue = Sales.getSubtotal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getSUCU().getValue())==0){
               returnValue = Sales.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTAX().getValue())==0){
               returnValue = Sales.getTax().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTICKET().getValue())==0){
               returnValue = String.valueOf(Sales.getTicket());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTAL().getValue())==0){
               returnValue = Sales.getTotal().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTALCOST().getValue())==0){
               returnValue = Sales.getTotalCost().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTALCOSTPROM().getValue())==0){
               returnValue = Sales.getTotalCostProm().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTALDISCCOUNT().getValue())==0){
               returnValue = Sales.getTotalDisccount().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTALEPS().getValue())==0){
               returnValue = Sales.getTotalEPS().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTALRETENTION().getValue())==0){
               returnValue = Sales.getTotalRetention().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTALTRANSLADE().getValue())==0){
               returnValue = Sales.getTotalTranslade().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTOTALUEPS().getValue())==0){
               returnValue = Sales.getTotalUEPS().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTRANSACTIONID().getValue())==0){
               returnValue = Sales.getTransactionID();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getTYPEEXCHANGE().getValue())==0){
               returnValue = Sales.getTypeExchange().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSalessTableHeader().getUSOCFDI().getValue())==0){
               returnValue = Sales.getUsocfdi();
           }
           return returnValue;
       };
   }
}