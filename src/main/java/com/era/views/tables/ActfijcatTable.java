package com.era.views.tables;

import com.era.models.Actfijcat;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ActfijcatTableModel;
import java.util.List;

public class ActfijcatTable extends BaseJTable {

   public ActfijcatTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ActfijcatTableModel ActfijcatTableModel = new ActfijcatTableModel(items,this.ShowColumns);
        this.setModel(ActfijcatTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ActfijcatTableModel ActfijcatTableModel = (ActfijcatTableModel)this.getModel();
       final List<Actfijcat> items_ = (List<Actfijcat>) ActfijcatTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Actfijcat> items_ = (List<Actfijcat>) RepositoryFactory.getInstance().getActfijcatsRepository().getAll();
       final ActfijcatTableModel ActfijcatTableModel = new ActfijcatTableModel(items_,this.ShowColumns);
       this.setModel(ActfijcatTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getActfijcatsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Actfijcat Actfijcat = (Actfijcat)Model_;

       RepositoryFactory.getInstance().getActfijcatsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getActfijcatsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}