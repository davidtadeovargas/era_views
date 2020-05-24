/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.Company;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CustomersIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final Company Company = (Company) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getNO().getValue())==0){
            returnValue = Company.getCompanyCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getCODE().getValue())==0){
            returnValue = Company.getNom();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = Company.getRFC();
        }
        
        return returnValue;
    }    
}
