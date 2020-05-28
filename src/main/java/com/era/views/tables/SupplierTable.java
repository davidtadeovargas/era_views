package com.era.views.tables;

import com.era.models.Supplier;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SupplierTableModel;
import java.util.List;

public class SupplierTable extends BaseJTable {

   public SupplierTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SupplierTableModel SupplierTableModel = new SupplierTableModel(items,this.ShowColumns);
        this.setModel(SupplierTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SupplierTableModel SupplierTableModel = (SupplierTableModel)this.getModel();
       final List<Supplier> items_ = (List<Supplier>) SupplierTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Supplier> items_ = (List<Supplier>) RepositoryFactory.getInstance().getSuppliersRepository().getAll();
       final SupplierTableModel SupplierTableModel = new SupplierTableModel(items_,this.ShowColumns);
       this.setModel(SupplierTableModel);
   }

}