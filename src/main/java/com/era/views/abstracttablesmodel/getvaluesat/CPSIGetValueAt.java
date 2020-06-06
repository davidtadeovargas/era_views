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
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex);
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getC_CODIGO_POSTAL().getValue())==0){           
            returnValue = CCodigopostal.getCp();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getC_MUNICIPIO().getValue())==0){
            returnValue = CCodigopostal.getMunicipio();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getC_ESTADO().getValue())==0){
            returnValue = CCodigopostal.getEstate();
        }
        
        return returnValue;
    }    
}
