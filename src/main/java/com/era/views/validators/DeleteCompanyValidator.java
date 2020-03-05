/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.validators;

import com.era.views.exceptions.NoSelectedCompanyException;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class DeleteCompanyValidator extends BaseValidator {

    private JTable companiesJTable;

    
    
    
    public void setCompaniesJTable(JTable companiesJTable) {
        this.companiesJTable = companiesJTable;
    }
            
    @Override
    public boolean validate() throws java.lang.Exception {
        
        //Validate that the user selected a row company
        int row = companiesJTable.getSelectedRow();
        if(row==-1){
            throw new NoSelectedCompanyException();
        }
           
        //Return true
        return true;
    }    
}
