/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.CCodigopostal;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CPSIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final CCodigopostal CCodigopostal = (CCodigopostal) Object;
        
        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getNO().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getId());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getCODE().getValue())==0){           
            returnValue = CCodigopostal.getEstate() + "/Loc:" + CCodigopostal.getLocality() + "/Mun:" + CCodigopostal.getMunicipio();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSearchTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = CCodigopostal.getMunicipio();
        }
        
        return returnValue;
    }    
}
