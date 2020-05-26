package com.era.views.tables;

import com.era.models.Sales;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SalesTableModel;
import java.util.List;

public class SalesTable extends BaseJTable {

   public SalesTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SalesTableModel SalesTableModel = new SalesTableModel(items,this.ShowColumns);
        this.setModel(SalesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SalesTableModel SalesTableModel = (SalesTableModel)this.getModel();
       final List<Sales> items_ = (List<Sales>) SalesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Sales> items_ = (List<Sales>) RepositoryFactory.getInstance().getSalessRepository().getAll();
       final SalesTableModel SalesTableModel = new SalesTableModel(items_,this.ShowColumns);
       this.setModel(SalesTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getSalessRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Sales Sales = (Sales)Model;

       RepositoryFactory.getInstance().getSalessRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getSalessRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}