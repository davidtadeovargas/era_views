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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<User> items_ = (List<User>) RepositoryFactory.getInstance().getUsersRepository().getByLikeEncabezados(search);
       final UserTableModel UserTableModel = new UserTableModel(items_,this.ShowColumns);
       this.setModel(UserTableModel);
   }

}