package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.ImpuesXProduct;
import com.era.models.Tax;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class ImpuesXProductTableModel  extends BaseAbstractTableModel {

   public ImpuesXProductTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);
       
       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) ->  {

           final ImpuesXProduct ImpuesXProduct = (ImpuesXProduct) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getVALUE().getValue())==0){
               
               //Get the tax of the product
               final String taxCode = ImpuesXProduct.getImpue();
               
               //Get the tax from db
               final Tax Tax = RepositoryFactory.getInstance().getTaxesRepository().getByCodeImpue(taxCode);
               
               //Set the tax value
               double taxValue = 0;
               if(Tax!=null){
                    taxValue = Tax.getValue();
               }
               
               //Return the value
               returnValue = String.valueOf(taxValue);
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getESTAC().getValue())==0){
               returnValue = ImpuesXProduct.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getFALT().getValue())==0){
               returnValue = ImpuesXProduct.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getFMOD().getValue())==0){
               returnValue = ImpuesXProduct.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getIMPUE().getValue())==0){
               returnValue = ImpuesXProduct.getImpue();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getNOCAJ().getValue())==0){
               returnValue = ImpuesXProduct.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getPRODU().getValue())==0){
               returnValue = ImpuesXProduct.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getImpuesXProductsTableHeader().getSUCU().getValue())==0){
               returnValue = ImpuesXProduct.getSucu();
           }
           return returnValue;
       };
   }
}