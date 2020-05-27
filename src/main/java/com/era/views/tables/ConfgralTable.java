package com.era.views.tables;

import com.era.models.Confgral;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConfgralTableModel;
import java.util.List;

public class ConfgralTable extends BaseJTable {

   public ConfgralTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConfgralTableModel ConfgralTableModel = new ConfgralTableModel(items,this.ShowColumns);
        this.setModel(ConfgralTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConfgralTableModel ConfgralTableModel = (ConfgralTableModel)this.getModel();
       final List<Confgral> items_ = (List<Confgral>) ConfgralTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Confgral> items_ = (List<Confgral>) RepositoryFactory.getInstance().getConfgralsRepository().getAll();
       final ConfgralTableModel ConfgralTableModel = new ConfgralTableModel(items_,this.ShowColumns);
       this.setModel(ConfgralTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getConfgralsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Confgral Confgral = (Confgral)Model_;

       RepositoryFactory.getInstance().getConfgralsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getConfgralsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}