/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.BasDats;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class SectoresIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final BasDats BasDats = (BasDats) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getNO().getValue())==0){
            returnValue = BasDats.getBd();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getCODE().getValue())==0){
            returnValue = BasDats.getNom();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = BasDats.getCodemp();
        }
        
        return returnValue;
    }    
}
