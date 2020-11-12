/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Sectores;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class SectoresTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
     
        final Sectores Sectores = (Sectores) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getCODE().getValue())==0){
            returnValue = Sectores.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getDESCRIPCION().getValue())==0){
            returnValue = Sectores.getDescripcion();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getESTAC().getValue())==0){
            returnValue = Sectores.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getFALT().getValue())==0){
            returnValue = Sectores.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getFMOD().getValue())==0){
            returnValue = Sectores.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getNOCAJ().getValue())==0){
            returnValue = Sectores.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSectoressTableHeader().getSUCU().getValue())==0){
            returnValue = Sectores.getSucu();
        }
        return returnValue;
    }
}
