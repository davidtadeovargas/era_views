package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CPaymentForm;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import javax.swing.JTable;

public class CPaymentFormTableModel  extends BaseAbstractTableModel {

   public CPaymentFormTableModel(final JTable jTable, List<?> items, final List<ColumnTable> header){
       super(jTable,items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CPaymentForm CPaymentForm = (CPaymentForm) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CPaymentForm.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getESTAC().getValue())==0){
               returnValue = CPaymentForm.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getFALT().getValue())==0){
               returnValue = CPaymentForm.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getFMOD().getValue())==0){
               returnValue = CPaymentForm.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CPaymentForm.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getSUCU().getValue())==0){
               returnValue = CPaymentForm.getSucu();
           }
           return returnValue;
       };
   }
}