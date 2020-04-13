/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.views.tables.tablemodels.BasdatsTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class BasdatsTable extends BaseJTable {
    
    public BasdatsTable(){
        super();
    }   
    
    @Override
    public void initTable(final List<?> items) {
        
        final String[] columns = {  "ID", 
                                    "CódigoEmpresa", 
                                    "Empresa", 
                                    "Base de Datos", 
                                    "Método Costeo", 
                                    "Teléfono", 
                                    "Ext", 
                                    "Calle", 
                                    "CP", 
                                    "NoExt", 
                                    "NoInt", 
                                    "Colonia", 
                                    "Ciudad", 
                                    "Estado", 
                                    "Pais", 
                                    "RFC", 
                                    "Correo", 
                                    "Sucursal", 
                                    "Caja", 
                                    "Sitio Web", 
                                    "Tipo Contribuyente", 
                                    "Estación", 
                                    "Lugar de Expedición", 
                                    "Regimen Fiscal", 
                                    "Ruta Certificado", 
                                    "Ruta Key", 
                                    "Password Certificado", 
                                    "Ruta Aplicacion", 
                                    "Plantilla", 
                                    "Fecha Alta", 
                                    "Fecha Modificacion"};
        
        final BasdatsTableModel BasdatsTableModel = new BasdatsTableModel(items,columns);        
        this.setModel(BasdatsTableModel);
        
        tableInitialized = true;
    }
}
