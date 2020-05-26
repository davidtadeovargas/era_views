/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.tables;

import com.era.models.User;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UsersTableModel;
import java.util.List;

/**
 *
 * @author PC
 */
public class UsersTable extends BaseJTable {
    
    public UsersTable(){
        super();
    }

    @Override
    public void initTable(List<?> items) {
        
        final UsersTableModel UsersTableModel = new UsersTableModel(items,this.ShowColumns);
        this.setModel(UsersTableModel);
    }

    @Override
    public List<?> getAllItemsInTable() throws Exception {
        
        final UsersTableModel UsersTableModel = (UsersTableModel)this.getModel();
        final List<User> users = (List<User>) UsersTableModel.getItems();
        return users;
    }
    
    @Override
    public void loadAllItemsInTable() throws Exception {
                
        final List<User> users = (List<User>) RepositoryFactory.getInstance().getUsersRepository().getAll();
        final UsersTableModel UsersTableModel = new UsersTableModel(users,this.ShowColumns);
        this.setModel(UsersTableModel);
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
        
        if(User.getCode() == null || User.getCode().isEmpty()){
            throw new Exception("still_missing_fields_to_fill");
        }
        
        RepositoryFactory.getInstance().getUsersRepository().addUser(User);
        
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
