package com.era.views.tables;

import com.era.models.Cumple;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CumpleTableModel;
import java.util.List;

public class CumpleTable extends BaseJTable {

   public CumpleTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CumpleTableModel CumpleTableModel = new CumpleTableModel(items,this.ShowColumns);
        this.setModel(CumpleTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CumpleTableModel CumpleTableModel = (CumpleTableModel)this.getModel();
       final List<Cumple> items_ = (List<Cumple>) CumpleTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cumple> items_ = (List<Cumple>) RepositoryFactory.getInstance().getCumplesRepository().getAll();
       final CumpleTableModel CumpleTableModel = new CumpleTableModel(items_,this.ShowColumns);
       this.setModel(CumpleTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCumplesRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Cumple Cumple = (Cumple)Model_;

       RepositoryFactory.getInstance().getCumplesRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCumplesRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}