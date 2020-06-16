/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.CRegimenfiscal;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class RegimenFiscalTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) {
     
        final CRegimenfiscal CRegimenfiscal = (CRegimenfiscal) model;
        
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
