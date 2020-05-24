/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables.headers;

/**
 *
 * @author PC
 */
public class ColumnTable {
    
    private String value;

    
    
    public ColumnTable(final String value){
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
