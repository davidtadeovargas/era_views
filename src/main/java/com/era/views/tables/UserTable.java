package com.era.views.tables;

import com.era.models.User;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UserTableModel;
import java.util.List;

public class UserTable extends BaseJTable {

   public UserTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final UserTableModel UserTableModel = new UserTableModel(items,this.ShowColumns);
        this.setModel(UserTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final UserTableModel UserTableModel = (UserTableModel)this.getModel();
       final List<User> items_ = (List<User>) UserTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<User> items_ = (List<User>) RepositoryFactory.getInstance().getUsersRepository().getAll();
       final UserTableModel UserTableModel = new UserTableModel(items_,this.ShowColumns);
       this.setModel(UserTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getUsersRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final User User = (User)Model;

       RepositoryFactory.getInstance().getUsersRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getUsersRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}