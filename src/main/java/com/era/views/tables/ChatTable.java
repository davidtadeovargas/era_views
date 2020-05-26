package com.era.views.tables;

import com.era.models.Chat;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ChatTableModel;
import java.util.List;

public class ChatTable extends BaseJTable {

   public ChatTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ChatTableModel ChatTableModel = new ChatTableModel(items,this.ShowColumns);
        this.setModel(ChatTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ChatTableModel ChatTableModel = (ChatTableModel)this.getModel();
       final List<Chat> items_ = (List<Chat>) ChatTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Chat> items_ = (List<Chat>) RepositoryFactory.getInstance().getChatsRepository().getAll();
       final ChatTableModel ChatTableModel = new ChatTableModel(items_,this.ShowColumns);
       this.setModel(ChatTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getChatsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Chat Chat = (Chat)Model;

       RepositoryFactory.getInstance().getChatsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getChatsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}