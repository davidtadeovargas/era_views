package com.era.views.tables;

import com.era.models.ComprsTmp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ComprsTmpTableModel;
import java.util.List;

public class ComprsTmpTable extends BaseJTable {

   public ComprsTmpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ComprsTmpTableModel ComprsTmpTableModel = new ComprsTmpTableModel(items,this.ShowColumns);
        this.setModel(ComprsTmpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ComprsTmpTableModel ComprsTmpTableModel = (ComprsTmpTableModel)this.getModel();
       final List<ComprsTmp> items_ = (List<ComprsTmp>) ComprsTmpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ComprsTmp> items_ = (List<ComprsTmp>) RepositoryFactory.getInstance().getComprsTmpsRepository().getAll();
       final ComprsTmpTableModel ComprsTmpTableModel = new ComprsTmpTableModel(items_,this.ShowColumns);
       this.setModel(ComprsTmpTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getComprsTmpsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final ComprsTmp ComprsTmp = (ComprsTmp)Model_;

       RepositoryFactory.getInstance().getComprsTmpsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getComprsTmpsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}