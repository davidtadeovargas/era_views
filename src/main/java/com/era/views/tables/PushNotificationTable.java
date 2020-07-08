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
       final PushNotificationTableModel PushNotificationTableModel = new PushNotificationTableModel(this,items,this.ShowColumns);
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
       final PushNotificationTableModel PushNotificationTableModel = new PushNotificationTableModel(this,items_,this.ShowColumns);
       this.setModel(PushNotificationTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<PushNotification> items_ = (List<PushNotification>) RepositoryFactory.getInstance().getPushNotificationsRepository().getByLikeEncabezados(search);
       final PushNotificationTableModel PushNotificationTableModel = new PushNotificationTableModel(this,items_,this.ShowColumns);
       this.setModel(PushNotificationTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final PushNotification ObjectIteration_ = (PushNotification)ObjectIteration;
       final PushNotification ObjectToCompare_ = (PushNotification)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}