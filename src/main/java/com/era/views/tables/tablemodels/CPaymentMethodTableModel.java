package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.CPaymentMethod;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CPaymentMethodTableModel  extends BaseAbstractTableModel {

   public CPaymentMethodTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final CPaymentMethod CPaymentMethod = (CPaymentMethod) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getFECHA_INICIO_DE_VIGENCIA().getValue())==0){
               returnValue = CPaymentMethod.getFecha_inicio_de_vigencia().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getCODE().getValue())==0){
               returnValue = CPaymentMethod.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CPaymentMethod.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getESTAC().getValue())==0){
               returnValue = CPaymentMethod.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getFALT().getValue())==0){
               returnValue = CPaymentMethod.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getFMOD().getValue())==0){
               returnValue = CPaymentMethod.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CPaymentMethod.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentMethodsTableHeader().getSUCU().getValue())==0){
               returnValue = CPaymentMethod.getSucu();
           }
           return returnValue;
       };
   }
}