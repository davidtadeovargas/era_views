package com.era.views.tables;

import com.era.models.Resp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.RespTableModel;
import java.util.List;

public class RespTable extends BaseJTable {

   public RespTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final RespTableModel RespTableModel = new RespTableModel(items,this.ShowColumns);
        this.setModel(RespTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final RespTableModel RespTableModel = (RespTableModel)this.getModel();
       final List<Resp> items_ = (List<Resp>) RespTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Resp> items_ = (List<Resp>) RepositoryFactory.getInstance().getRespsRepository().getAll();
       final RespTableModel RespTableModel = new RespTableModel(items_,this.ShowColumns);
       this.setModel(RespTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getRespsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Resp Resp = (Resp)Model_;

       RepositoryFactory.getInstance().getRespsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getRespsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}