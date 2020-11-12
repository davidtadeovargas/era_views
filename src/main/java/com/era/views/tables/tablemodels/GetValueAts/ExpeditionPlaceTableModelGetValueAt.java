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
public class ExpeditionPlaceTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final CCodigopostal CCodigopostal = (CCodigopostal) model;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getC_CODIGO_POSTAL().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getCp());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getC_ESTADO().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getEstate());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getC_LOCALIDAD().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getLocality());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getC_MUNICIPIO().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getMunicipio());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getFMOD().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getFmod().toString());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getNOCAJ().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getNocaj());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCCodigoPostalsTableHeader().getSUCU().getValue())==0){
            returnValue = String.valueOf(CCodigopostal.getSucu());
        }
        
        return returnValue;
    }
}
