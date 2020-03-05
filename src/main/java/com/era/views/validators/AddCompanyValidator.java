/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.validators;

import com.era.views.exceptions.EmptyFieldsException;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class AddCompanyValidator extends BaseValidator {
    
    private JTextField companyNameJTextField;
    private JTextField companyCodeJTextField;

    
    
    
    public void setCompanyNameJTextField(JTextField companyNameJTextField) {
        this.companyNameJTextField = companyNameJTextField;
    }

    public void setCompanyCodeJTextField(JTextField companyCodeJTextField) {
        this.companyCodeJTextField = companyCodeJTextField;
    }
           
    @Override
    public boolean validate() throws java.lang.Exception {
        
        //Get the string fields
        final String name = companyNameJTextField.getText().trim();
        final String code = companyCodeJTextField.getText().trim();
        
        //Validate that the fields are not empty
        if(name.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(code.isEmpty()){
            throw new EmptyFieldsException();
        }
        
        //Return true
        return true;
    }
}
