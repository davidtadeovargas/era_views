package com.era.views.tables;

import com.era.models.PartprevcomprsTmp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartprevcomprsTmpTableModel;
import java.util.List;

public class PartprevcomprsTmpTable extends BaseJTable {

   public PartprevcomprsTmpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartprevcomprsTmpTableModel PartprevcomprsTmpTableModel = new PartprevcomprsTmpTableModel(items,this.ShowColumns);
        this.setModel(PartprevcomprsTmpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartprevcomprsTmpTableModel PartprevcomprsTmpTableModel = (PartprevcomprsTmpTableModel)this.getModel();
       final List<PartprevcomprsTmp> items_ = (List<PartprevcomprsTmp>) PartprevcomprsTmpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PartprevcomprsTmp> items_ = (List<PartprevcomprsTmp>) RepositoryFactory.getInstance().getPartprevcomprsTmpsRepository().getAll();
       final PartprevcomprsTmpTableModel PartprevcomprsTmpTableModel = new PartprevcomprsTmpTableModel(items_,this.ShowColumns);
       this.setModel(PartprevcomprsTmpTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPartprevcomprsTmpsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final PartprevcomprsTmp PartprevcomprsTmp = (PartprevcomprsTmp)Model_;

       RepositoryFactory.getInstance().getPartprevcomprsTmpsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPartprevcomprsTmpsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}