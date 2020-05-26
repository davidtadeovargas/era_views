package com.era.views.tables;

import com.era.models.DeliverAddressCustomer;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DeliverAddressCustomerTableModel;
import java.util.List;

public class DeliverAddressCustomerTable extends BaseJTable {

   public DeliverAddressCustomerTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DeliverAddressCustomerTableModel DeliverAddressCustomerTableModel = new DeliverAddressCustomerTableModel(items,this.ShowColumns);
        this.setModel(DeliverAddressCustomerTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DeliverAddressCustomerTableModel DeliverAddressCustomerTableModel = (DeliverAddressCustomerTableModel)this.getModel();
       final List<DeliverAddressCustomer> items_ = (List<DeliverAddressCustomer>) DeliverAddressCustomerTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<DeliverAddressCustomer> items_ = (List<DeliverAddressCustomer>) RepositoryFactory.getInstance().getDeliverAddressCustomersRepository().getAll();
       final DeliverAddressCustomerTableModel DeliverAddressCustomerTableModel = new DeliverAddressCustomerTableModel(items_,this.ShowColumns);
       this.setModel(DeliverAddressCustomerTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getDeliverAddressCustomersRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final DeliverAddressCustomer DeliverAddressCustomer = (DeliverAddressCustomer)Model;

       RepositoryFactory.getInstance().getDeliverAddressCustomersRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getDeliverAddressCustomersRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}