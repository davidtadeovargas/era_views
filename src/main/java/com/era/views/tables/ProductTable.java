package com.era.views.tables;

import com.era.models.Product;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ProductTableModel;
import java.util.List;

public class ProductTable extends BaseJTable {

   public ProductTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ProductTableModel ProductTableModel = new ProductTableModel(items,this.ShowColumns);
        this.setModel(ProductTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ProductTableModel ProductTableModel = (ProductTableModel)this.getModel();
       final List<Product> items_ = (List<Product>) ProductTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Product> items_ = (List<Product>) RepositoryFactory.getInstance().getProductsRepository().getAll();
       final ProductTableModel ProductTableModel = new ProductTableModel(items_,this.ShowColumns);
       this.setModel(ProductTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getProductsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Product Product = (Product)Model_;

       RepositoryFactory.getInstance().getProductsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getProductsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}