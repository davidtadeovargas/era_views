/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.CRegimenfiscal;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class RegimenFiscalIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final CRegimenfiscal CRegimenfiscal = (CRegimenfiscal) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getNO().getValue())==0){
            returnValue = String.valueOf(CRegimenfiscal.getC_RegimenFiscal());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getCODE().getValue())==0){
            returnValue = CRegimenfiscal.getDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = CRegimenfiscal.getFecha_de_inicio_de_vigencia().toString();
        }
        
        return returnValue;
    }    
}
