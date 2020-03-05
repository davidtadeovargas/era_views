/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.validators;

import com.era.views.exceptions.EmptyFieldsException;
import com.era.views.exceptions.InvalidEmailSintaxException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class LoginLicenseValidator extends BaseValidator {

    private JTextField userEditJTextField;
    private JPasswordField passwordJPasswordField;

    
    
    public void setUserEditJTextField(JTextField userEditJTextField) {
        this.userEditJTextField = userEditJTextField;
    }

    public void setPasswordJPasswordField(JPasswordField passwordJPasswordField) {
        this.passwordJPasswordField = passwordJPasswordField;
    }
    
    @Override
    public boolean validate() throws Exception {
        
        //Get the values of the fields
        final String user = userEditJTextField.getText().trim();
        final String password = String.valueOf(passwordJPasswordField.getPassword());
        
        //Validate that all the fields are filled
        if(user.isEmpty()){            
            throw new EmptyFieldsException();
        }
        if(password.isEmpty()){            
            throw new EmptyFieldsException();
        }
        
        //Validate that the user has valid email sintax
        if(!user.contains(".")){
            throw new InvalidEmailSintaxException();
        }
        if(!user.contains("@")){
            throw new InvalidEmailSintaxException();
        }
                
        //Return all is fine
        return true;
    }        
}
