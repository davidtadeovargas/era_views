package com.era.views.tables;

import com.era.models.ERPermisos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ERPermisosTableModel;
import java.util.List;

public class ERPermisosTable extends BaseJTable {

   public ERPermisosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ERPermisosTableModel ERPermisosTableModel = new ERPermisosTableModel(items,this.ShowColumns);
        this.setModel(ERPermisosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ERPermisosTableModel ERPermisosTableModel = (ERPermisosTableModel)this.getModel();
       final List<ERPermisos> items_ = (List<ERPermisos>) ERPermisosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ERPermisos> items_ = (List<ERPermisos>) RepositoryFactory.getInstance().getERPermisossRepository().getAll();
       final ERPermisosTableModel ERPermisosTableModel = new ERPermisosTableModel(items_,this.ShowColumns);
       this.setModel(ERPermisosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getERPermisossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final ERPermisos ERPermisos = (ERPermisos)Model_;

       RepositoryFactory.getInstance().getERPermisossRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getERPermisossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}