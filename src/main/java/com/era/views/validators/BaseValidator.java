/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.validators;

/**
 *
 * @author PC
 */
public abstract class BaseValidator {
    
    protected Exception Exception;
    
    public abstract boolean validate() throws Exception;

    public Exception getException() {
        return Exception;
    }
}
