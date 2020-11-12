/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.Banco;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class BancosTableModelGetValueAt implements IGetValueAt{

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
     
        final Banco Banco = (Banco) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getBANCO().getValue())==0){
            returnValue = Banco.getBanco();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getCUENTABANCO().getValue())==0){
            returnValue = Banco.getCuentabanco();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getDESCRIP().getValue())==0){
            returnValue = Banco.getDescrip();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getESTAC().getValue())==0){
            returnValue = Banco.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getFALT().getValue())==0){
            returnValue = Banco.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getFMOD().getValue())==0){
            returnValue = Banco.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getNOCAJ().getValue())==0){
            returnValue = Banco.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getSUCU().getValue())==0){
            returnValue = Banco.getSucu();
        }
        return returnValue;
    }
}
