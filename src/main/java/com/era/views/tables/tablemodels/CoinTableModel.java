package com.era.views.tables.tablemodels;

import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import com.era.models.Coin;
import com.era.views.tables.headers.TableHeaderFactory;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;

public class CoinTableModel  extends BaseAbstractTableModel {

   public CoinTableModel(List<?> items, final List<ColumnTable> header){
       super(items,header);

       this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {

           final Coin Coin = (Coin) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getC_MONEDA().getValue())==0){
               returnValue = Coin.getC_moneda();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getCASHNUMBER().getValue())==0){
               returnValue = Coin.getCashNumber();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getCODE().getValue())==0){
               returnValue = Coin.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Coin.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getFALT().getValue())==0){
               returnValue = Coin.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getFMOD().getValue())==0){
               returnValue = Coin.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getNATIONAL().getValue())==0){
               returnValue = Coin.isNational()? "Si":"No";
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getSIMBOL().getValue())==0){
               returnValue = Coin.getSimbol();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getSTATION().getValue())==0){
               returnValue = Coin.getStation();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getSUCURSAL().getValue())==0){
               returnValue = Coin.getSucursal();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getVALUE().getValue())==0){
               returnValue = String.valueOf(Coin.getValue());
           }
           return returnValue;
       };
   }
}