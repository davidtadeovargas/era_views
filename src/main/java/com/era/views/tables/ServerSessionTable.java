package com.era.views.tables;

import com.era.models.ServerSession;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ServerSessionTableModel;
import java.util.List;

public class ServerSessionTable extends BaseJTable {

   public ServerSessionTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ServerSessionTableModel ServerSessionTableModel = new ServerSessionTableModel(items,this.ShowColumns);
        this.setModel(ServerSessionTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ServerSessionTableModel ServerSessionTableModel = (ServerSessionTableModel)this.getModel();
       final List<ServerSession> items_ = (List<ServerSession>) ServerSessionTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ServerSession> items_ = (List<ServerSession>) RepositoryFactory.getInstance().getServerSessionsRepository().getAll();
       final ServerSessionTableModel ServerSessionTableModel = new ServerSessionTableModel(items_,this.ShowColumns);
       this.setModel(ServerSessionTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getServerSessionsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final ServerSession ServerSession = (ServerSession)Model;

       RepositoryFactory.getInstance().getServerSessionsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getServerSessionsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}