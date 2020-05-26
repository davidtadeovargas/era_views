package com.era.views.tables;

import com.era.models.ERMmovimientosInventario;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ERMmovimientosInventarioTableModel;
import java.util.List;

public class ERMmovimientosInventarioTable extends BaseJTable {

   public ERMmovimientosInventarioTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ERMmovimientosInventarioTableModel ERMmovimientosInventarioTableModel = new ERMmovimientosInventarioTableModel(items,this.ShowColumns);
        this.setModel(ERMmovimientosInventarioTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ERMmovimientosInventarioTableModel ERMmovimientosInventarioTableModel = (ERMmovimientosInventarioTableModel)this.getModel();
       final List<ERMmovimientosInventario> items_ = (List<ERMmovimientosInventario>) ERMmovimientosInventarioTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ERMmovimientosInventario> items_ = (List<ERMmovimientosInventario>) RepositoryFactory.getInstance().getERMmovimientosInventariosRepository().getAll();
       final ERMmovimientosInventarioTableModel ERMmovimientosInventarioTableModel = new ERMmovimientosInventarioTableModel(items_,this.ShowColumns);
       this.setModel(ERMmovimientosInventarioTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getERMmovimientosInventariosRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final ERMmovimientosInventario ERMmovimientosInventario = (ERMmovimientosInventario)Model;

       RepositoryFactory.getInstance().getERMmovimientosInventariosRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getERMmovimientosInventariosRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}