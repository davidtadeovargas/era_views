/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.BasDats;

/**
 *
 * @author PC
 */
public class SeriesCustomersIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object,int columnIndex) {
        
        final BasDats BasDats = (BasDats) Object;
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = BasDats.getBd();
        }
        else if(columnIndex==1){
            returnValue = BasDats.getNom();
        }
        else if(columnIndex==2){
            returnValue = BasDats.getCodemp();
        }
        
        return returnValue;
    }    
}
