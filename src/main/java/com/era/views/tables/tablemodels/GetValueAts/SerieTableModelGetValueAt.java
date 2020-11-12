/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Serie;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class SerieTableModelGetValueAt implements IGetValueAt {

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
        
        final Serie Serie = (Serie) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getCODE().getValue())==0){
            returnValue = Serie.getCode();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getSERIE().getValue())==0){
            returnValue = Serie.getSer();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getCONSECUTIVE().getValue())==0){
            returnValue = String.valueOf(Serie.getConsecutive());
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = Serie.getDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getESTAC().getValue())==0){
            returnValue = Serie.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getFALT().getValue())==0){
            returnValue = Serie.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getFMOD().getValue())==0){
            returnValue = Serie.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getNOCAJ().getValue())==0){
            returnValue = Serie.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getSUCU().getValue())==0){
            returnValue = Serie.getSucu();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getSeriesTableHeader().getTYPE().getValue())==0){
            returnValue = Serie.getType();
        }
        return returnValue;
    }
}
