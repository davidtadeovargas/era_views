/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.GetValueAts;

import com.era.models.CPaymentForm;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CPaymentFormsTableModelGetValueAt implements IGetValueAt{

    @Override
    public Object GetValueAt(int rowIndex, int columnIndex, String valueColumn, Object model) throws Exception {
     
        final CPaymentForm CPaymentForm = (CPaymentForm) model;

        String returnValue = "";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getROWNUMBER().getValue())==0){
            returnValue = String.valueOf(rowIndex + 1);
         }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getCODE().getValue())==0){
            returnValue = CPaymentForm.getC_FormaPago();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = CPaymentForm.getDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getESTAC().getValue())==0){
            returnValue = CPaymentForm.getEstac();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getFALT().getValue())==0){
            returnValue = CPaymentForm.getFalt().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCPaymentFormsTableHeader().getFMOD().getValue())==0){
            returnValue = CPaymentForm.getFmod().toString();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getNOCAJ().getValue())==0){
            returnValue = CPaymentForm.getNocaj();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getBancosTableHeader().getSUCU().getValue())==0){
            returnValue = CPaymentForm.getSucu();
        }
        return returnValue;
    }
}
