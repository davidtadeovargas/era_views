/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.CCountry;

/**
 *
 * @author PC
 */
public class CountriesIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object,int columnIndex) {
        
        final CCountry CCountry = (CCountry) Object;
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = CCountry.getCode();
        }
        else if(columnIndex==1){            
            returnValue = CCountry.getDescription();
        }
        else if(columnIndex==2){
            returnValue = CCountry.getFalt().toString();
        }
        
        return returnValue;
    }    
}
