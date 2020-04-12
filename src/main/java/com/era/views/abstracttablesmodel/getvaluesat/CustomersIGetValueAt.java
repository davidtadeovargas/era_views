/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.Company;

/**
 *
 * @author PC
 */
public class CustomersIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object,int columnIndex) {
        
        final Company Company = (Company) Object;
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = Company.getCompanyCode();
        }
        else if(columnIndex==1){            
            returnValue = Company.getNom();
        }
        else if(columnIndex==2){
            returnValue = Company.getRFC();
        }
        
        return returnValue;
    }    
}
