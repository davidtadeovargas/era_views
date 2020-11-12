package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CPaymentForm;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class PaymentFormTableModel  extends BaseAbstractTableModel {

   public PaymentFormTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CPaymentForm PaymentForm = (CPaymentForm) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getCODE().getValue())==0){
               returnValue = PaymentForm.getC_FormaPago();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = PaymentForm.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getESTAC().getValue())==0){
               returnValue = PaymentForm.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getFALT().getValue())==0){
               returnValue = PaymentForm.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getFMOD().getValue())==0){
               returnValue = PaymentForm.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getNOCAJ().getValue())==0){
               returnValue = PaymentForm.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getSUCU().getValue())==0){
               returnValue = PaymentForm.getSucu();
           }
           return returnValue;
       };
   }
}