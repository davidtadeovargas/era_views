package com.era.views.tables;

import com.era.models.PartcomprsTmp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartcomprsTmpTableModel;
import java.util.List;

public class PartcomprsTmpTable extends BaseJTable {

   public PartcomprsTmpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartcomprsTmpTableModel PartcomprsTmpTableModel = new PartcomprsTmpTableModel(items,this.ShowColumns);
        this.setModel(PartcomprsTmpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartcomprsTmpTableModel PartcomprsTmpTableModel = (PartcomprsTmpTableModel)this.getModel();
       final List<PartcomprsTmp> items_ = (List<PartcomprsTmp>) PartcomprsTmpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PartcomprsTmp> items_ = (List<PartcomprsTmp>) RepositoryFactory.getInstance().getPartcomprsTmpsRepository().getAll();
       final PartcomprsTmpTableModel PartcomprsTmpTableModel = new PartcomprsTmpTableModel(items_,this.ShowColumns);
       this.setModel(PartcomprsTmpTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPartcomprsTmpsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final PartcomprsTmp PartcomprsTmp = (PartcomprsTmp)Model_;

       RepositoryFactory.getInstance().getPartcomprsTmpsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPartcomprsTmpsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}