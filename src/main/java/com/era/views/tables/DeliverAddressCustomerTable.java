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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<DeliverAddressCustomer> items_ = (List<DeliverAddressCustomer>) RepositoryFactory.getInstance().getDeliverAddressCustomersRepository().getByLikeEncabezados(search);
       final DeliverAddressCustomerTableModel DeliverAddressCustomerTableModel = new DeliverAddressCustomerTableModel(items_,this.ShowColumns);
       this.setModel(DeliverAddressCustomerTableModel);
   }

}