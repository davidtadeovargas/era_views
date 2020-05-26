/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.tablemodels.respaldo;

import com.era.views.tables.tablemodels.*;
import com.era.models.Company;
import com.era.views.abstracttablesmodel.BaseAbstractTableModel;
import com.era.views.tables.headers.ColumnTable;
import com.era.views.tables.headers.TableHeaderFactory;
import java.util.List;

/**
 *
 * @author PC
 */
public class EmpresasTableModel extends BaseAbstractTableModel {
    
    public EmpresasTableModel(List<?> items, List<ColumnTable> header) {
        super(items,header);
        
        this.GetValueAt = (int rowIndex, int columnIndex, String valueColumn, final Object model) -> {
            
            //Cast the moel
            final Company Company = (Company) model;
            
            String returnValue = "";
            if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getID().getValue())==0){
                returnValue = String.valueOf(rowIndex + 1);
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCOMPANY_CODE().getValue())==0){
                returnValue = Company.getCompanyCode();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCOMPANY().getValue())==0){
                returnValue = Company.getNom();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCOST_METHOD().getValue())==0){
                returnValue = Company.getMetcost();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getPHONE().getValue())==0){
                returnValue = Company.getTel();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getEXTENTION().getValue())==0){
                returnValue = Company.getExten();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getSTREET().getValue())==0){
                returnValue = Company.getCalle();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCP().getValue())==0){
                returnValue = Company.getCP();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getNOEXT().getValue())==0){
                returnValue = Company.getNoext();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getNOINT().getValue())==0){
                returnValue = Company.getNoint();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCOLONY().getValue())==0){
                returnValue = Company.getCol();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCITY().getValue())==0){
                returnValue = Company.getCiu();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getESTATE().getValue())==0){
                returnValue = Company.getEstad();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCOUNTRY().getValue())==0){
                returnValue = Company.getPai();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getRFC().getValue())==0){
                returnValue = Company.getRFC();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getEMAIL().getValue())==0){
                returnValue = Company.getCo1();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getAPP_PATH().getValue())==0){
                returnValue = Company.getAppPath();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getCREATION_DATE().getValue())==0){
                returnValue = Company.getFalt().toString();
            }
            else if(valueColumn.compareTo(TableHeaderFactory.getSigleton().getCompaniesTableHeader().getMODIFICATION_DATE().getValue())==0){
                returnValue = Company.getFmod().toString();
            }
            
            return returnValue;            
        };
    }
}
