/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.CCodigopostal;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CCodigoPostalTableModelGetValueAt implements IGetValueAt{

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
     
        final CCodigopostal CCodigopostal = (CCodigopostal) model;
        
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
