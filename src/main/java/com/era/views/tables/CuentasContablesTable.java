package com.era.views.tables;

import com.era.models.CuentasContables;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CuentasContablesTableModel;
import java.util.List;

public class CuentasContablesTable extends BaseJTable {

   public CuentasContablesTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CuentasContablesTableModel CuentasContablesTableModel = new CuentasContablesTableModel(items,this.ShowColumns);
        this.setModel(CuentasContablesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CuentasContablesTableModel CuentasContablesTableModel = (CuentasContablesTableModel)this.getModel();
       final List<CuentasContables> items_ = (List<CuentasContables>) CuentasContablesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CuentasContables> items_ = (List<CuentasContables>) RepositoryFactory.getInstance().getCuentasContablessRepository().getAll();
       final CuentasContablesTableModel CuentasContablesTableModel = new CuentasContablesTableModel(items_,this.ShowColumns);
       this.setModel(CuentasContablesTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCuentasContablessRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final CuentasContables CuentasContables = (CuentasContables)Model_;

       RepositoryFactory.getInstance().getCuentasContablessRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCuentasContablessRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}