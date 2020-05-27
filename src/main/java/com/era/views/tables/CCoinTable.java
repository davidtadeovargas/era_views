package com.era.views.tables;

import com.era.models.CCoin;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CCoinTableModel;
import java.util.List;

public class CCoinTable extends BaseJTable {

   public CCoinTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(items,this.ShowColumns);
        this.setModel(CCoinTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CCoinTableModel CCoinTableModel = (CCoinTableModel)this.getModel();
       final List<CCoin> items_ = (List<CCoin>) CCoinTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CCoin> items_ = (List<CCoin>) RepositoryFactory.getInstance().getCCoinsRepository().getAll();
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(items_,this.ShowColumns);
       this.setModel(CCoinTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCCoinsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final CCoin CCoin = (CCoin)Model_;

       RepositoryFactory.getInstance().getCCoinsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCCoinsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}