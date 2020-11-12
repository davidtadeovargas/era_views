/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.exceptions;

import com.era.views.validators.BaseValidator;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author PC
 */
public class InitConfigurationValidator extends BaseValidator {

    private JTextField companyNameJTextField;
    private JTextField instanceJTextField;
    private JTextField userJTextField;
    private JPasswordField passwordJTextField;
    private JTextField dbnameJTextField;
    private JTextField portJTextField;
    private JTextField sucNameJTextField;
    private JTextField localInstanceJTextField;
    private JTextField localUserJTextField;
    private JPasswordField passwordLocalJTextField;
    private JTextField localPortJTextField;
    private JTextField emailJTextField;
    private JTextField appPathJTextField;
    
    
    
    
    public JTextField getCompanyNameJTextField() {
        return companyNameJTextField;
    }

    public void setCompanyNameJTextField(JTextField companyNameJTextField) {
        this.companyNameJTextField = companyNameJTextField;
    }

    public JTextField getInstanceJTextField() {
        return instanceJTextField;
    }

    public void setInstanceJTextField(JTextField instanceJTextField) {
        this.instanceJTextField = instanceJTextField;
    }

    public JTextField getUserJTextField() {
        return userJTextField;
    }

    public void setUserJTextField(JTextField userJTextField) {
        this.userJTextField = userJTextField;
    }

    public JTextField getPasswordJTextField() {
        return passwordJTextField;
    }

    public void setPasswordJTextField(JPasswordField passwordJTextField) {
        this.passwordJTextField = passwordJTextField;
    }

    public JTextField getDbnameJTextField() {
        return dbnameJTextField;
    }

    public void setDbnameJTextField(JTextField dbnameJTextField) {
        this.dbnameJTextField = dbnameJTextField;
    }

    public JTextField getPortJTextField() {
        return portJTextField;
    }

    public void setPortJTextField(JTextField portJTextField) {
        this.portJTextField = portJTextField;
    }

    public JTextField getSucNameJTextField() {
        return sucNameJTextField;
    }

    public void setSucNameJTextField(JTextField sucNameJTextField) {
        this.sucNameJTextField = sucNameJTextField;
    }

    public JTextField getLocalInstanceJTextField() {
        return localInstanceJTextField;
    }

    public void setLocalInstanceJTextField(JTextField localInstanceJTextField) {
        this.localInstanceJTextField = localInstanceJTextField;
    }

    public JTextField getLocalUserJTextField() {
        return localUserJTextField;
    }

    public void setLocalUserJTextField(JTextField localUserJTextField) {
        this.localUserJTextField = localUserJTextField;
    }

    public JTextField getPasswordLocalJTextField() {
        return passwordLocalJTextField;
    }

    public void setPasswordLocalJTextField(JPasswordField passwordLocalJTextField) {
        this.passwordLocalJTextField = passwordLocalJTextField;
    }

    public JTextField getLocalPortJTextField() {
        return localPortJTextField;
    }

    public void setLocalPortJTextField(JTextField localPortJTextField) {
        this.localPortJTextField = localPortJTextField;
    }

    public JTextField getEmailJTextField() {
        return emailJTextField;
    }

    public void setEmailJTextField(JTextField emailJTextField) {
        this.emailJTextField = emailJTextField;
    }

    public JTextField getAppPathJTextField() {
        return appPathJTextField;
    }

    public void setAppPathJTextField(JTextField appPathJTextField) {
        this.appPathJTextField = appPathJTextField;
    }
    
    @Override
    public boolean validate() throws java.lang.Exception {
     
        //Get all the string fields
        final String name = companyNameJTextField.getText().trim();
        final String instance = instanceJTextField.getText().trim();
        final String user = userJTextField.getText().trim();
        final String password = passwordJTextField.getText().trim();
        final String dbname = dbnameJTextField.getText().trim();
        final String port = portJTextField.getText().trim();
        final String sucursal = sucNameJTextField.getText().trim();
        final String localInstance = localInstanceJTextField.getText().trim();
        final String localUser = localUserJTextField.getText().trim();
        final String localPassword = passwordLocalJTextField.getText().trim();
        final String localPort = localPortJTextField.getText().trim();
        final String email = emailJTextField.getText().trim();
        final String appPath = appPathJTextField.getText().trim();
        
        //Validate that the fields are not empty
        if(name.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(instance.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(user.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(password.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(dbname.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(port.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(sucursal.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(localInstance.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(localUser.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(localPassword.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(localPort.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(email.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(appPath.isEmpty()){
            throw new EmptyFieldsException();
        }
        
        //Return true
        return true;
    }
}
