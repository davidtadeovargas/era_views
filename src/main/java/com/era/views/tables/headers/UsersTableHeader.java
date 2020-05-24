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
public class UsersTableHeader extends BaseTableHeader {
 
    private final ColumnTable NO = new ColumnTable("No");
    private final ColumnTable USER = new ColumnTable("Usuario");
    private final ColumnTable NAME = new ColumnTable("Nombre");
    private final ColumnTable INVOICE_PRINTER = new ColumnTable("Imp. Fac.");
    private final ColumnTable TICKET_PRINTER = new ColumnTable("Imp. Tick");
    private final ColumnTable MM_52 = new ColumnTable("52mm");
    private final ColumnTable CORT = new ColumnTable("Tiene Corte");

    
    
    
    public ColumnTable getNO() {
        return NO;
    }

    public ColumnTable getUSER() {
        return USER;
    }

    public ColumnTable getNAME() {
        return NAME;
    }

    public ColumnTable getINVOICE_PRINTER() {
        return INVOICE_PRINTER;
    }

    public ColumnTable getMM_52() {
        return MM_52;
    }

    public ColumnTable getCORT() {
        return CORT;
    }

    public ColumnTable getTICKET_PRINTER() {
        return TICKET_PRINTER;
    }
}
