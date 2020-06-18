/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Conceps;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class ConcepsTableModelGetValueAt implements IGetValueAt{

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
     
        final Conceps Conceps = (Conceps) model;

           String returnValue = "";
           if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getROWNUMBER().getValue())==0){
               returnValue = String.valueOf(rowIndex + 1);
            }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getCONCEP().getValue())==0){
               returnValue = Conceps.getCode();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getDESCRIP().getValue())==0){
               returnValue = Conceps.getDescrip();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getESTAC().getValue())==0){
               returnValue = Conceps.getEstac();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getFALT().getValue())==0){
               returnValue = Conceps.getFalt().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getFMOD().getValue())==0){
               returnValue = Conceps.getFmod().toString();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getNOCAJ().getValue())==0){
               returnValue = Conceps.getNocaj();
           }
           else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getConcepssTableHeader().getSUCU().getValue())==0){
               returnValue = Conceps.getSucu();
           }
           return returnValue;
    }
}
