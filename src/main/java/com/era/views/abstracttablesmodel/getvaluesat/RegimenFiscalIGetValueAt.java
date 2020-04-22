/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.CRegimenfiscal;

/**
 *
 * @author PC
 */
public class RegimenFiscalIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object,int columnIndex) {
        
        final CRegimenfiscal CRegimenfiscal = (CRegimenfiscal) Object;
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = String.valueOf(CRegimenfiscal.getC_RegimenFiscal());
        }
        else if(columnIndex==1){            
            returnValue = CRegimenfiscal.getDescription();
        }
        else if(columnIndex==2){
            returnValue = CRegimenfiscal.getFecha_de_inicio_de_vigencia().toString();
        }
        
        return returnValue;
    }    
}
