/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.CCountry;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CountriesIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final CCountry CCountry = (CCountry) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCountriesTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex);
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCountriesTableHeader().getC_PAIS().getValue())==0){
            returnValue = CCountry.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCountriesTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = CCountry.getDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCountriesTableHeader().getAGRUPACIONES().getValue())==0){
            returnValue = CCountry.getAgrupaciones();
        }
        
        return returnValue;
    }    
}
