package com.era.views.tables;

import com.era.models.Tall;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TallTableModel;
import java.util.List;

public class TallTable extends BaseJTable {

   public TallTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TallTableModel TallTableModel = new TallTableModel(items,this.ShowColumns);
        this.setModel(TallTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TallTableModel TallTableModel = (TallTableModel)this.getModel();
       final List<Tall> items_ = (List<Tall>) TallTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tall> items_ = (List<Tall>) RepositoryFactory.getInstance().getTallsRepository().getAll();
       final TallTableModel TallTableModel = new TallTableModel(items_,this.ShowColumns);
       this.setModel(TallTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTallsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Tall Tall = (Tall)Model_;

       RepositoryFactory.getInstance().getTallsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTallsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}