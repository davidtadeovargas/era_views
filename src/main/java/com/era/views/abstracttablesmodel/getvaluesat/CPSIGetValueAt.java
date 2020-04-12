/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.CCodigopostal;

/**
 *
 * @author PC
 */
public class CPSIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object,int columnIndex) {
        
        final CCodigopostal CCodigopostal = (CCodigopostal) Object;
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = String.valueOf(CCodigopostal.getId());
        }
        else if(columnIndex==1){            
            returnValue = CCodigopostal.getEstate() + "/Loc:" + CCodigopostal.getLocality() + "/Mun:" + CCodigopostal.getMunicipio();
        }
        else if(columnIndex==2){
            returnValue = CCodigopostal.getMunicipio();
        }
        
        return returnValue;
    }    
}
