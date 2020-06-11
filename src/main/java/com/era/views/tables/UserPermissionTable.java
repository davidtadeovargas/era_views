package com.era.views.tables;

import com.era.models.UserPermission;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UserPermissionTableModel;
import java.util.List;

public class UserPermissionTable extends BaseJTable {

   public UserPermissionTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final UserPermissionTableModel UserPermissionTableModel = new UserPermissionTableModel(items,this.ShowColumns);
        this.setModel(UserPermissionTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final UserPermissionTableModel UserPermissionTableModel = (UserPermissionTableModel)this.getModel();
       final List<UserPermission> items_ = (List<UserPermission>) UserPermissionTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<UserPermission> items_ = (List<UserPermission>) RepositoryFactory.getInstance().getUserPermissionsRepository().getAll();
       final UserPermissionTableModel UserPermissionTableModel = new UserPermissionTableModel(items_,this.ShowColumns);
       this.setModel(UserPermissionTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<UserPermission> items_ = (List<UserPermission>) RepositoryFactory.getInstance().getUserPermissionsRepository().getByLikeEncabezados(search);
       final UserPermissionTableModel UserPermissionTableModel = new UserPermissionTableModel(items_,this.ShowColumns);
       this.setModel(UserPermissionTableModel);
   }

    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}