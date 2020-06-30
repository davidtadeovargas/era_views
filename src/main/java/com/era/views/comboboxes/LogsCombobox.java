/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.datamodels.LogsComboDataModel;
import com.era.views.comboboxes.cellrenders.LogsCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class LogsCombobox extends BaseComboBox<LogsComboDataModel> {
    
    public LogsCombobox(){
        super(new LogsCellRender());
    }

    @Override
    List<LogsComboDataModel> getItems() throws Exception {
        
        //Create the combobox items
        final List<LogsComboDataModel> comboItems = new ArrayList<>();
        LogsComboDataModel LogsComboDataModel = new LogsComboDataModel();
        LogsComboDataModel.setDescription("");
        LogsComboDataModel.setEmpty(true);
        comboItems.add(LogsComboDataModel);        
        LogsComboDataModel = new LogsComboDataModel();
        LogsComboDataModel.setDescription("Registros creados");
        LogsComboDataModel.setRegistrosCreados(true);
        comboItems.add(LogsComboDataModel);
        LogsComboDataModel = new LogsComboDataModel();
        LogsComboDataModel.setDescription("Registros actualizados");
        LogsComboDataModel.setRegistrosActualizados(true);
        comboItems.add(LogsComboDataModel);        
        LogsComboDataModel = new LogsComboDataModel();
        LogsComboDataModel.setDescription("Registros Eliminados");
        LogsComboDataModel.setRegistrosEliminados(true);
        comboItems.add(LogsComboDataModel);
        LogsComboDataModel = new LogsComboDataModel();
        LogsComboDataModel.setDescription("Login Usuarios");
        LogsComboDataModel.setLoginUsuarios(true);
        comboItems.add(LogsComboDataModel);
        LogsComboDataModel = new LogsComboDataModel();
        LogsComboDataModel.setDescription("Cierre Sesión Usuarios");
        LogsComboDataModel.setCierreSesionUsuarios(true);
        comboItems.add(LogsComboDataModel);
        LogsComboDataModel = new LogsComboDataModel();
        LogsComboDataModel.setDescription("Inicio Sesión Usuarios");
        LogsComboDataModel.setInicioSesionUsuarios(true);
        comboItems.add(LogsComboDataModel);
        
        return comboItems;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final LogsComboDataModel LogsComboDataModelItem = (LogsComboDataModel)ObjectItem;
        final LogsComboDataModel LogsComboDataModelMethod = (LogsComboDataModel)ObjectMethod;
        
        boolean  found = false;        
        if(LogsComboDataModelItem != null && LogsComboDataModelItem.getDescription().compareTo(LogsComboDataModelMethod.getDescription())==0){
            found = true;
        }
        
        return found;
    }
}
