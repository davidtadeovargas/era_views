package com.era.views.tables;

import com.era.models.ImpuesXProduct;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuesXProductTableModel;
import java.util.List;

public class ImpuesXProductTable extends BaseJTable {

   public ImpuesXProductTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuesXProductTableModel ImpuesXProductTableModel = new ImpuesXProductTableModel(items,this.ShowColumns);
        this.setModel(ImpuesXProductTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuesXProductTableModel ImpuesXProductTableModel = (ImpuesXProductTableModel)this.getModel();
       final List<ImpuesXProduct> items_ = (List<ImpuesXProduct>) ImpuesXProductTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuesXProduct> items_ = (List<ImpuesXProduct>) RepositoryFactory.getInstance().getImpuesXProductsRepository().getAll();
       final ImpuesXProductTableModel ImpuesXProductTableModel = new ImpuesXProductTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesXProductTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getImpuesXProductsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final ImpuesXProduct ImpuesXProduct = (ImpuesXProduct)Model;

       RepositoryFactory.getInstance().getImpuesXProductsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getImpuesXProductsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}