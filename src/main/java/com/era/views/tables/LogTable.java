package com.era.views.tables;

import com.era.models.Log;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.LogTableModel;
import java.util.ArrayList;
import java.util.List;

public class LogTable extends BaseJTable {

   public LogTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final LogTableModel LogTableModel = new LogTableModel(items,this.ShowColumns);
        this.setModel(LogTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final LogTableModel LogTableModel = (LogTableModel)this.getModel();
       final List<Log> items_ = (List<Log>) LogTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Log> items_ = (List<Log>) RepositoryFactory.getInstance().getLogsRepository().getAll();
       final LogTableModel LogTableModel = new LogTableModel(items_,this.ShowColumns);
       this.setModel(LogTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Log> items_ = (List<Log>) RepositoryFactory.getInstance().getLogsRepository().getByLikeEncabezados(search);
       final LogTableModel LogTableModel = new LogTableModel(items_,this.ShowColumns);
       this.setModel(LogTableModel);
   }
   
    public void getByLikeEncabezadosByType(final String search, final Type Type) throws Exception {
        
        List<Log> items_ = new ArrayList<>();
        
        //Get the items depending type
        switch(Type){
            case REGISTROS_CREADOS:
                items_ = RepositoryFactory.getInstance().getLogsRepository().getByLikeEncabezadosRegistrosCreados(search);
                break;
            case REGISTROS_ACTUALIZADOS:
                items_ = RepositoryFactory.getInstance().getLogsRepository().getByLikeEncabezadosRegistrosActualizados(search);
                break;
            case LOGIN_USUARIOS:
                items_ = RepositoryFactory.getInstance().getLogsRepository().getByLikeEncabezadosLoginUsuarios(search);
                break;
            case CIERRE_SESION_USUARIOS:
                items_ = RepositoryFactory.getInstance().getLogsRepository().getByLikeEncabezadosCierreSesion(search);
                break;
            case INICIO_SESION_USUARIOS:
                items_ = RepositoryFactory.getInstance().getLogsRepository().getByLikeEncabezadosInicioSesion(search);
                break;
        }
        
        //Set items and model
        final LogTableModel LogTableModel = new LogTableModel(items_,this.ShowColumns);
        this.setModel(LogTableModel);
    }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Log ObjectIteration_ = (Log)ObjectIteration;
       final Log ObjectToCompare_ = (Log)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
    
    public enum Type {
        REGISTROS_CREADOS,
        REGISTROS_ACTUALIZADOS,
        LOGIN_USUARIOS,
        CIERRE_SESION_USUARIOS,
        INICIO_SESION_USUARIOS
    }
}