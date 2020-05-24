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
public class SearchTableHeader extends BaseTableHeader {
 
    private final ColumnTable NO = new ColumnTable("No");
    private final ColumnTable CODE = new ColumnTable("Código");
    private final ColumnTable DESCRIPTION = new ColumnTable("Descripción");    

    public ColumnTable getNO() {
        return NO;
    }

    public ColumnTable getCODE() {
        return CODE;
    }

    public ColumnTable getDESCRIPTION() {
        return DESCRIPTION;
    }

    
    
    
    
}
