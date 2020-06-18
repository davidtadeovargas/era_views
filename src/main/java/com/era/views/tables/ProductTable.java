package com.era.views.tables;

import com.era.models.Product;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ProductTableModel;
import java.util.List;

public class ProductTable extends BaseJTable {

    public ProductTable(){
       super(RepositoryFactory.getInstance().getProductsRepository());
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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Product> items_ = (List<Product>) RepositoryFactory.getInstance().getProductsRepository().getByLikeEncabezados(search);
       final ProductTableModel ProductTableModel = new ProductTableModel(items_,this.ShowColumns);
       this.setModel(ProductTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Product ObjectIteration_ = (Product)ObjectIteration;
       final Product ObjectToCompare_ = (Product)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}