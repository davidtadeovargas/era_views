package com.era.views.tables;

import com.era.models.Clasificacion;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasificacionTableModel;
import java.util.List;

public class ClasificacionTable extends BaseJTable {

   public ClasificacionTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasificacionTableModel ClasificacionTableModel = new ClasificacionTableModel(items,this.ShowColumns);
        this.setModel(ClasificacionTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasificacionTableModel ClasificacionTableModel = (ClasificacionTableModel)this.getModel();
       final List<Clasificacion> items_ = (List<Clasificacion>) ClasificacionTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasificacion> items_ = (List<Clasificacion>) RepositoryFactory.getInstance().getClasificacionsRepository().getAll();
       final ClasificacionTableModel ClasificacionTableModel = new ClasificacionTableModel(items_,this.ShowColumns);
       this.setModel(ClasificacionTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getClasificacionsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Clasificacion Clasificacion = (Clasificacion)Model;

       RepositoryFactory.getInstance().getClasificacionsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getClasificacionsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}