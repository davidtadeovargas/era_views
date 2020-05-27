package com.era.views.tables;

import com.era.models.Resplog;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ResplogTableModel;
import java.util.List;

public class ResplogTable extends BaseJTable {

   public ResplogTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ResplogTableModel ResplogTableModel = new ResplogTableModel(items,this.ShowColumns);
        this.setModel(ResplogTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ResplogTableModel ResplogTableModel = (ResplogTableModel)this.getModel();
       final List<Resplog> items_ = (List<Resplog>) ResplogTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Resplog> items_ = (List<Resplog>) RepositoryFactory.getInstance().getResplogsRepository().getAll();
       final ResplogTableModel ResplogTableModel = new ResplogTableModel(items_,this.ShowColumns);
       this.setModel(ResplogTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getResplogsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Resplog Resplog = (Resplog)Model_;

       RepositoryFactory.getInstance().getResplogsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getResplogsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}