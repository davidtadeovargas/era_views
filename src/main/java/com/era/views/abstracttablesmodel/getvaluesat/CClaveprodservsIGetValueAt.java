/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel.getvaluesat;

import com.era.models.CClaveprodserv;
import com.era.views.tables.headers.TableHeaderFactory;

/**
 *
 * @author PC
 */
public class CClaveprodservsIGetValueAt implements IGetValueAt {

    @Override
    public String getReturnValue(Object Object, int rowIndex, int columnIndex, final String valueColumn) {
        
        final CClaveprodserv CClaveprodserv = (CClaveprodserv) Object;
        
        String returnValue = "undefined";
        if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getC_CLAVEPRODSERV().getValue())==0){
            returnValue = CClaveprodserv.getC_ClaveProdServ();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getDESCRIPTION().getValue())==0){
            returnValue = CClaveprodserv.getDescription();
        }
        else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCClaveprodservsTableHeader().getENDVIGENCYDATE().getValue())==0){
            returnValue = CClaveprodserv.getEndVigencyDate()==null?"":CClaveprodserv.getEndVigencyDate().toString();
        }
        
        return returnValue;
    }    
}
