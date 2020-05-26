package com.era.views.tables;

import com.era.models.PushNotification;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PushNotificationTableModel;
import java.util.List;

public class PushNotificationTable extends BaseJTable {

   public PushNotificationTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PushNotificationTableModel PushNotificationTableModel = new PushNotificationTableModel(items,this.ShowColumns);
        this.setModel(PushNotificationTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PushNotificationTableModel PushNotificationTableModel = (PushNotificationTableModel)this.getModel();
       final List<PushNotification> items_ = (List<PushNotification>) PushNotificationTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PushNotification> items_ = (List<PushNotification>) RepositoryFactory.getInstance().getPushNotificationsRepository().getAll();
       final PushNotificationTableModel PushNotificationTableModel = new PushNotificationTableModel(items_,this.ShowColumns);
       this.setModel(PushNotificationTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPushNotificationsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final PushNotification PushNotification = (PushNotification)Model;

       RepositoryFactory.getInstance().getPushNotificationsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPushNotificationsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}