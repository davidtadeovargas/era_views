package com.era.views.tables;

import com.era.models.Resp355834;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.Resp355834TableModel;
import java.util.List;

public class Resp355834Table extends BaseJTable {

   public Resp355834Table(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final Resp355834TableModel Resp355834TableModel = new Resp355834TableModel(items,this.ShowColumns);
        this.setModel(Resp355834TableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final Resp355834TableModel Resp355834TableModel = (Resp355834TableModel)this.getModel();
       final List<Resp355834> items_ = (List<Resp355834>) Resp355834TableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Resp355834> items_ = (List<Resp355834>) RepositoryFactory.getInstance().getResp355834sRepository().getAll();
       final Resp355834TableModel Resp355834TableModel = new Resp355834TableModel(items_,this.ShowColumns);
       this.setModel(Resp355834TableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getResp355834sRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Resp355834 Resp355834 = (Resp355834)Model;

       RepositoryFactory.getInstance().getResp355834sRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getResp355834sRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}