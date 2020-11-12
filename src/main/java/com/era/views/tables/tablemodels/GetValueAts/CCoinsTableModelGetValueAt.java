/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Coin;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CCoinsTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final Coin Coin = (Coin) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getCODE().getValue())==0){
               returnValue = Coin.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = Coin.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getESTAC().getValue())==0){
               returnValue = Coin.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getFALT().getValue())==0){
               returnValue = Coin.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getFMOD().getValue())==0){
               returnValue = Coin.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getNOCAJ().getValue())==0){
               returnValue = Coin.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCoinsTableHeader().getSUCU().getValue())==0){
               returnValue = Coin.getSucu();
           }
           return returnValue;
    }
    
}
