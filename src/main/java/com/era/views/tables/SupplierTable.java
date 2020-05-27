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

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getSuppliersRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Supplier Supplier = (Supplier)Model_;

       RepositoryFactory.getInstance().getSuppliersRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getSuppliersRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}