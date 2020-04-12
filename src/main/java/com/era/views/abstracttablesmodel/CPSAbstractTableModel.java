/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.CCodigopostal;
import java.util.List;

/**
 *
 * @author PC
 */
public class CPSAbstractTableModel extends BaseAbstractTableModel {
        
    public CPSAbstractTableModel(List<CCodigopostal> deliveries, String[] header) {
        super(deliveries,header);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final CCodigopostal CCodigopostal = (CCodigopostal) this.items.get(rowIndex);
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = String.valueOf(CCodigopostal.getId());
        }
        else if(columnIndex==1){            
            returnValue = CCodigopostal.getEstate() + "/Loc:" + CCodigopostal.getLocality() + "/Mun:" + CCodigopostal.getMunicipio();
        }
        else if(columnIndex==2){
            returnValue = CCodigopostal.getMunicipio();
        }
        
        return returnValue;
    }
}
