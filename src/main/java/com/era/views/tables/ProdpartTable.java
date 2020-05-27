package com.era.views.tables;

import com.era.models.Prodpart;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ProdpartTableModel;
import java.util.List;

public class ProdpartTable extends BaseJTable {

   public ProdpartTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ProdpartTableModel ProdpartTableModel = new ProdpartTableModel(items,this.ShowColumns);
        this.setModel(ProdpartTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ProdpartTableModel ProdpartTableModel = (ProdpartTableModel)this.getModel();
       final List<Prodpart> items_ = (List<Prodpart>) ProdpartTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Prodpart> items_ = (List<Prodpart>) RepositoryFactory.getInstance().getProdpartsRepository().getAll();
       final ProdpartTableModel ProdpartTableModel = new ProdpartTableModel(items_,this.ShowColumns);
       this.setModel(ProdpartTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getProdpartsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Prodpart Prodpart = (Prodpart)Model_;

       RepositoryFactory.getInstance().getProdpartsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getProdpartsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}