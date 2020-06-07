/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.Giro;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class GirosIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final Giro Giro = (Giro) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex);
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getDESCRIP().getValue())==0){
            returnValue = Giro.getDescrip();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getESTAC().getValue())==0){
            returnValue = Giro.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getFALT().getValue())==0){
            returnValue = Giro.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getFMOD().getValue())==0){
            returnValue = Giro.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getGIR().getValue())==0){
            returnValue = Giro.getGir();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getNOCAJ().getValue())==0){
            returnValue = Giro.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getGirosTableHeader().getSUCU().getValue())==0){
            returnValue = Giro.getSucu();
        }
        
        return returnValue;
    }    
}
