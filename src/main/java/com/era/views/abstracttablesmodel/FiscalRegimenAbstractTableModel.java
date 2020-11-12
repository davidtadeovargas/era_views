/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.abstracttablesmodel;

import com.era.models.CCodigopostal;
import com.era.models.CRegimenfiscal;
import com.era.views.tables.headers.ColumnTable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class FiscalRegimenAbstractTableModel extends BaseAbstractTableModel {
        
    public FiscalRegimenAbstractTableModel(final JTable jTable, List<CCodigopostal> deliveries, List<ColumnTable> header) {
        super(jTable,deliveries,header);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final CRegimenfiscal CRegimenfiscal = (CRegimenfiscal) this.items.get(rowIndex);
        
        String returnValue = "undefined";
        if(columnIndex==0){
            returnValue = String.valueOf(CRegimenfiscal.getC_RegimenFiscal());
        }
        else if(columnIndex==1){            
            returnValue = CRegimenfiscal.getDescription();
        }
        else if(columnIndex==2){
            returnValue = CRegimenfiscal.getFecha_de_inicio_de_vigencia().toString();
        }
        
        return returnValue;
    }
}
