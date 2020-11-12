/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Zona;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class ZonaTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final Zona Zona = (Zona) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getCOD().getValue())==0){
            returnValue = Zona.getCod();
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
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getNOCAJ().getValue())==0){
            returnValue = Zona.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getZonasTableHeader().getSUCU().getValue())==0){
            returnValue = Zona.getSucu();
        }
        return returnValue;
    }
}
