package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Payment;
import com.era.utilities.UtilitiesFactory;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class PaymentTableModel  extends BaseAbstractTableModel {

   public PaymentTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Payment Payment = (Payment) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getSERIE().getValue())==0){
               returnValue = Payment.getSerie();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getFOLIO().getValue())==0){
               returnValue = Payment.getFolio();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getESTATUS().getValue())==0){
               returnValue = Payment.getEstatus();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getCUENTA_BANCO().getValue())==0){
               returnValue = Payment.getCuentabanco();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getFORMA_PAGO().getValue())==0){
               returnValue = Payment.getFormapago();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getCONCEPTO().getValue())==0){
               returnValue = Payment.getConcepto();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getCODIGO_CLIENTE_PROVEEDOR().getValue())==0){
               returnValue = Payment.getCodigoClienteProveedor();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getTIMBRADA().getValue())==0){
               returnValue = Payment.isTimbrada()?"Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getIMPORTE().getValue())==0){
               returnValue = UtilitiesFactory.getSingleton().getNumbersUtility().toMoneyFormat(Payment.getImporte());
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getCOMENTARIO().getValue())==0){
               returnValue = Payment.getComentario();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getESTAC().getValue())==0){
               returnValue = Payment.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getFALT().getValue())==0){
               returnValue = Payment.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getFMOD().getValue())==0){
               returnValue = Payment.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Payment.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentsTableHeader().getSUCU().getValue())==0){
               returnValue = Payment.getSucu();
           }
           return returnValue;
       };
   }
}