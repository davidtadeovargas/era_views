/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.views.tables.tablemodels.EmpresasTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class EmpresasTable extends BaseJTable {
    
    public EmpresasTable(){
     
        super();
    }

    @Override
    public void initTable(List<?> items) {
        
        final String[] columns = {"ID", "CódigoEmpresa", "Empresa", "Base de Datos", "Método Costeo", "Teléfono", "Ext", "Calle", "CP", "NoExt", "NoInt", "Colonia", "Ciudad", "Estado", "Pais", "RFC", "Correo", "Sucursal", "Caja", "Sitio Web", "Tipo Contribuyente", "Estación", "Lugar de Expedición", "Regimen Fiscal", "Ruta Certificado", "Ruta Key", "Password Certificado", "Ruta Aplicacion", "Plantilla", "Fecha Alta", "Fecha Modificacion"};        
        final EmpresasTableModel EmpresasTableModel = new EmpresasTableModel(items,columns);
        this.setModel(EmpresasTableModel);
    }
}
