package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.PaymentForm;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class PaymentFormTableModel  extends BaseAbstractTableModel {

   public PaymentFormTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final PaymentForm PaymentForm = (PaymentForm) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
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
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getPAYMENTFORM().getValue())==0){
               returnValue = PaymentForm.getPaymentForm();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getPaymentFormsTableHeader().getSUCU().getValue())==0){
               returnValue = PaymentForm.getSucu();
           }
           return returnValue;
       };
   }
}