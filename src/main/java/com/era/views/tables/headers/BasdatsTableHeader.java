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
public class BasdatsTableHeader extends BaseTableHeader {
 
    private final ColumnTable ID = new ColumnTable("ID");
    private final ColumnTable COMPANY_CODE = new ColumnTable("CódigoEmpresa");
    private final ColumnTable COMPANY = new ColumnTable("Empresa");
    private final ColumnTable DATABASE = new ColumnTable("Base de Datos");
    private final ColumnTable COST_METHOD = new ColumnTable("Método Costeo");
    private final ColumnTable PHONE = new ColumnTable("Teléfono");
    private final ColumnTable EXTENTION = new ColumnTable("Ext");
    private final ColumnTable STREET = new ColumnTable("Calle");
    private final ColumnTable CP = new ColumnTable("CP");
    private final ColumnTable NOEXT = new ColumnTable("NoExt");
    private final ColumnTable NOINT = new ColumnTable("NoInt");
    private final ColumnTable COLONY = new ColumnTable("Colonia");
    private final ColumnTable CITY = new ColumnTable("Ciudad");
    private final ColumnTable ESTATE = new ColumnTable("Estado");
    private final ColumnTable COUNTRY = new ColumnTable("Pais");
    private final ColumnTable RFC = new ColumnTable("RFC");
    private final ColumnTable EMAIL = new ColumnTable("Correo");
    private final ColumnTable SUCURSAL = new ColumnTable("Sucursal");
    private final ColumnTable CASHER = new ColumnTable("Caja");    
    private final ColumnTable WEBSITE = new ColumnTable("Sitio Web");
    private final ColumnTable CONTRIBUYENT_TYPE = new ColumnTable("Tipo Contribuyente");
    private final ColumnTable ESTAC = new ColumnTable("Estación");
    private final ColumnTable EXPEDITION_PLACE = new ColumnTable("Lugar de Expedición");
    private final ColumnTable FISCAL_REGIMEN = new ColumnTable("Regimen Fiscal");
    private final ColumnTable CERTIFICATE_PATH = new ColumnTable("Ruta Certificado");
    private final ColumnTable KEY_PATH = new ColumnTable("Ruta Key");
    private final ColumnTable CERTIFICATE_PASSWORD = new ColumnTable("Password Certificado");
    private final ColumnTable APP_PATH = new ColumnTable("Ruta Aplicacion");
    private final ColumnTable TEMPLATE = new ColumnTable("Plantilla");
    private final ColumnTable CREATION_DATE = new ColumnTable("Fecha Alta");
    private final ColumnTable MODIFICATION_DATE = new ColumnTable("Fecha Modificacion");

    
        
    public ColumnTable getID() {
        return ID;
    }

    public ColumnTable getCOMPANY_CODE() {
        return COMPANY_CODE;
    }

    public ColumnTable getCOMPANY() {
        return COMPANY;
    }

    public ColumnTable getDATABASE() {
        return DATABASE;
    }

    public ColumnTable getCOST_METHOD() {
        return COST_METHOD;
    }

    public ColumnTable getPHONE() {
        return PHONE;
    }

    public ColumnTable getEXTENTION() {
        return EXTENTION;
    }

    public ColumnTable getSTREET() {
        return STREET;
    }

    public ColumnTable getCP() {
        return CP;
    }

    public ColumnTable getNOEXT() {
        return NOEXT;
    }

    public ColumnTable getNOINT() {
        return NOINT;
    }

    public ColumnTable getCOLONY() {
        return COLONY;
    }

    public ColumnTable getCITY() {
        return CITY;
    }

    public ColumnTable getESTATE() {
        return ESTATE;
    }

    public ColumnTable getCOUNTRY() {
        return COUNTRY;
    }

    public ColumnTable getRFC() {
        return RFC;
    }

    public ColumnTable getEMAIL() {
        return EMAIL;
    }

    public ColumnTable getSUCURSAL() {
        return SUCURSAL;
    }

    public ColumnTable getCASHER() {
        return CASHER;
    }

    public ColumnTable getWEBSITE() {
        return WEBSITE;
    }

    public ColumnTable getCONTRIBUYENT_TYPE() {
        return CONTRIBUYENT_TYPE;
    }

    public ColumnTable getESTAC() {
        return ESTAC;
    }

    public ColumnTable getEXPEDITION_PLACE() {
        return EXPEDITION_PLACE;
    }

    public ColumnTable getFISCAL_REGIMEN() {
        return FISCAL_REGIMEN;
    }

    public ColumnTable getCERTIFICATE_PATH() {
        return CERTIFICATE_PATH;
    }

    public ColumnTable getKEY_PATH() {
        return KEY_PATH;
    }

    public ColumnTable getCERTIFICATE_PASSWORD() {
        return CERTIFICATE_PASSWORD;
    }

    public ColumnTable getAPP_PATH() {
        return APP_PATH;
    }

    public ColumnTable getTEMPLATE() {
        return TEMPLATE;
    }

    public ColumnTable getCREATION_DATE() {
        return CREATION_DATE;
    }

    public ColumnTable getMODIFICATION_DATE() {
        return MODIFICATION_DATE;
    }
}
