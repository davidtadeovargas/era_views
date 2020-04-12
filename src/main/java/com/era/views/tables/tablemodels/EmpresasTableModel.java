/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels;

import com.era.models.Company;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class EmpresasTableModel extends BaseAbstractTableModel {
    
    public EmpresasTableModel(List<?> items, String[] header) {
        super(items,header);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        final Company Company = (Company) this.items.get(rowIndex);
        
        String returnValue = "undefined";
        if (columnIndex == 0) {
           returnValue = String.valueOf(Company.getId());
        }
        else if (columnIndex == 1) {
           returnValue = Company.getCompanyCode();
        }
        else if (columnIndex == 2) {
           returnValue = Company.getNom();
        }
        else if (columnIndex == 3) {
           returnValue = Company.getNameDB();
        }
        else if (columnIndex == 4) {
           returnValue = Company.getMetcost();
        }
        else if (columnIndex == 5) {
           returnValue = Company.getTel();
        }
        else if (columnIndex == 6) {
           returnValue = Company.getExten();
        }
        else if (columnIndex == 7) {
           returnValue = Company.getCalle();
        }
        else if (columnIndex == 8) {
           returnValue = Company.getCP();
        }
        else if (columnIndex == 9) {
           returnValue = Company.getNoext();
        }
        else if (columnIndex == 10) {
           returnValue = Company.getNoint();
        }
        else if (columnIndex == 11) {
           returnValue = Company.getCol();
        }
        else if (columnIndex == 12) {
           returnValue = Company.getCiu();
        }
        else if (columnIndex == 13) {
           returnValue = Company.getEstad();
        }
        else if (columnIndex == 14) {
           returnValue = Company.getPai();
        }
        else if (columnIndex == 15) {
           returnValue = Company.getRFC();
        }
        else if (columnIndex == 16) {
           returnValue = Company.getCo1();
        }
        else if (columnIndex == 17) {
           returnValue = Company.getSucu();
        }
        else if (columnIndex == 18) {
           returnValue = Company.getNocaj();
        }
        else if (columnIndex == 19) {
           returnValue = Company.getPagweb1();
        }
        else if (columnIndex == 20) {
           returnValue = Company.getContribuyentType();
        }
        else if (columnIndex == 21) {
           returnValue = Company.getEstac();
        }
        else if (columnIndex == 22) {
           returnValue = Company.getExpeditionPlace();
        }
        else if (columnIndex == 23) {
           returnValue = Company.getExpeditionPlace();
        }
        else if (columnIndex == 24) {
           returnValue = Company.getFiscalRegimen();
        }
        else if (columnIndex == 25) {
           returnValue = Company.getCertificatePath();
        }
        else if (columnIndex == 26) {
           returnValue = Company.getKeyPath();
        }
        else if (columnIndex == 27) {
           returnValue = Company.getCertificatePassword();
        }
        else if (columnIndex == 28) {
           returnValue = Company.getAppPath();
        }
        else if (columnIndex == 29) {
           returnValue = Company.getTemplate();
        }
        else if (columnIndex == 30) {
           returnValue = Company.getFalt().toString();
        }
        else if (columnIndex == 31) {
           returnValue = Company.getFmod().toString();
        }
        
        return returnValue;
    }
}
