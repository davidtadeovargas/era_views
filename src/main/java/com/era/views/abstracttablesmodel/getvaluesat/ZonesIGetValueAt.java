/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.Zona;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class ZonesIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final Zona Zona = (Zona) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex);
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getDESCRIP().getValue())==0){
            returnValue = Zona.getDescrip();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getESTAC().getValue())==0){
            returnValue = Zona.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getFALT().getValue())==0){
            returnValue = Zona.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getFMOD().getValue())==0){
            returnValue = Zona.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getCOD().getValue())==0){
            returnValue = Zona.getCod();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getNOCAJ().getValue())==0){
            returnValue = Zona.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getSUCU().getValue())==0){
            returnValue = Zona.getSucu();
        }
        
        return returnValue;
    }    
}
