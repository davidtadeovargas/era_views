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
public class GeneralInfoValidator extends BaseValidator {

    private JTextField companyNameJTextField;
    private JTextField phoneJTextField;
    private JTextField colonyJTextField;
    private JTextField cpJTextField;
    private JTextField noExtJTextField;
    private JTextField noIntJTextField;
    private JTextField cityJTextField;
    private JTextField estateJTextField;
    private JTextField countryJTextField;
    private JTextField rfcJTextField;
    private JTextField websiteJTextField;
    private JTextField corporativeEmailJTextField;
    private JTextField appFolderJTextField;
    private JTextField fiscalRegimenJTextField;
    private JTextField expeditionPlaceJTextField;

    
    
    
    public void setCompanyNameJTextField(JTextField companyNameJTextField) {
        this.companyNameJTextField = companyNameJTextField;
    }

    public void setPhoneJTextField(JTextField phoneJTextField) {
        this.phoneJTextField = phoneJTextField;
    }

    public void setColonyJTextField(JTextField colonyJTextField) {
        this.colonyJTextField = colonyJTextField;
    }

    public void setCpJTextField(JTextField cpJTextField) {
        this.cpJTextField = cpJTextField;
    }

    public void setNoExtJTextField(JTextField noExtJTextField) {
        this.noExtJTextField = noExtJTextField;
    }

    public void setNoIntJTextField(JTextField noIntJTextField) {
        this.noIntJTextField = noIntJTextField;
    }

    public void setCityJTextField(JTextField cityJTextField) {
        this.cityJTextField = cityJTextField;
    }

    public void setEstateJTextField(JTextField estateJTextField) {
        this.estateJTextField = estateJTextField;
    }

    public void setCountryJTextField(JTextField countryJTextField) {
        this.countryJTextField = countryJTextField;
    }

    public void setRfcJTextField(JTextField rfcJTextField) {
        this.rfcJTextField = rfcJTextField;
    }

    public void setWebsiteJTextField(JTextField websiteJTextField) {
        this.websiteJTextField = websiteJTextField;
    }

    public void setCorporativeEmailJTextField(JTextField corporativeEmailJTextField) {
        this.corporativeEmailJTextField = corporativeEmailJTextField;
    }

    public void setAppFolderJTextField(JTextField appFolderJTextField) {
        this.appFolderJTextField = appFolderJTextField;
    }

    public void setFiscalRegimenJTextField(JTextField fiscalRegimenJTextField) {
        this.fiscalRegimenJTextField = fiscalRegimenJTextField;
    }

    public void setExpeditionPlaceJTextField(JTextField expeditionPlaceJTextField) {
        this.expeditionPlaceJTextField = expeditionPlaceJTextField;
    }
             
    @Override
    public boolean validate() throws java.lang.Exception {
        
        //Get the string fields
        final String name = companyNameJTextField.getText().trim();
        final String phone = phoneJTextField.getText().trim();
        final String colony = colonyJTextField.getText().trim();
        final String cp = cpJTextField.getText().trim();
        final String noext = noExtJTextField.getText().trim();
        final String noint = noIntJTextField.getText().trim();
        final String city = cityJTextField.getText().trim();
        final String estate = estateJTextField.getText().trim();
        final String country = countryJTextField.getText().trim();
        final String rfc = rfcJTextField.getText().trim();
        final String website = websiteJTextField.getText().trim();
        final String corporativeEmail = corporativeEmailJTextField.getText().trim();
        final String appFolder = appFolderJTextField.getText().trim();
        final String fiscalRegimen = fiscalRegimenJTextField.getText().trim();
        final String expeditionPlace = expeditionPlaceJTextField.getText().trim();
        
        //Validate that the fields are not empty
        if(name.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(phone.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(colony.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(cp.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(noext.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(noint.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(city.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(estate.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(country.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(rfc.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(website.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(corporativeEmail.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(appFolder.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(fiscalRegimen.isEmpty()){
            throw new EmptyFieldsException();
        }
        if(expeditionPlace.isEmpty()){
            throw new EmptyFieldsException();
        }
        
        //Return true
        return true;
    }    
}
