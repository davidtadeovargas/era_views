/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.CCoin;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CCoinsTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final CCoin CCoin = (CCoin) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getCODE().getValue())==0){
               returnValue = CCoin.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getDECIMALS().getValue())==0){
               returnValue = CCoin.getDecimals();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getDESCRIPTION().getValue())==0){
               returnValue = CCoin.getDescription();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getESTAC().getValue())==0){
               returnValue = CCoin.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getFALT().getValue())==0){
               returnValue = CCoin.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getFMOD().getValue())==0){
               returnValue = CCoin.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getINITVIGENCYDATE().getValue())==0){
               returnValue = CCoin.getInitVigencyDate().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getNOCAJ().getValue())==0){
               returnValue = CCoin.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getSUCU().getValue())==0){
               returnValue = CCoin.getSucu();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCoinsTableHeader().getVARIATIONPORCENT().getValue())==0){
               returnValue = String.valueOf(CCoin.getVariationPorcent());
           }
           return returnValue;
    }
    
}
