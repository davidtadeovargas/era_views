package com.era.views.tables;

import com.era.models.Flujact;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.FlujactTableModel;
import java.util.List;

public class FlujactTable extends BaseJTable {

   public FlujactTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final FlujactTableModel FlujactTableModel = new FlujactTableModel(items,this.ShowColumns);
        this.setModel(FlujactTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final FlujactTableModel FlujactTableModel = (FlujactTableModel)this.getModel();
       final List<Flujact> items_ = (List<Flujact>) FlujactTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Flujact> items_ = (List<Flujact>) RepositoryFactory.getInstance().getFlujactsRepository().getAll();
       final FlujactTableModel FlujactTableModel = new FlujactTableModel(items_,this.ShowColumns);
       this.setModel(FlujactTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getFlujactsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Flujact Flujact = (Flujact)Model_;

       RepositoryFactory.getInstance().getFlujactsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getFlujactsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}