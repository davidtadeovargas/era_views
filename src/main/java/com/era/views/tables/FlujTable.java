package com.era.views.tables;

import com.era.models.Fluj;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.FlujTableModel;
import java.util.List;

public class FlujTable extends BaseJTable {

   public FlujTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final FlujTableModel FlujTableModel = new FlujTableModel(items,this.ShowColumns);
        this.setModel(FlujTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final FlujTableModel FlujTableModel = (FlujTableModel)this.getModel();
       final List<Fluj> items_ = (List<Fluj>) FlujTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Fluj> items_ = (List<Fluj>) RepositoryFactory.getInstance().getFlujsRepository().getAll();
       final FlujTableModel FlujTableModel = new FlujTableModel(items_,this.ShowColumns);
       this.setModel(FlujTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getFlujsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Fluj Fluj = (Fluj)Model_;

       RepositoryFactory.getInstance().getFlujsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getFlujsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}