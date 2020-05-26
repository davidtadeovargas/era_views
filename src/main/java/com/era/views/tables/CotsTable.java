package com.era.views.tables;

import com.era.models.Cots;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CotsTableModel;
import java.util.List;

public class CotsTable extends BaseJTable {

   public CotsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CotsTableModel CotsTableModel = new CotsTableModel(items,this.ShowColumns);
        this.setModel(CotsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CotsTableModel CotsTableModel = (CotsTableModel)this.getModel();
       final List<Cots> items_ = (List<Cots>) CotsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cots> items_ = (List<Cots>) RepositoryFactory.getInstance().getCotssRepository().getAll();
       final CotsTableModel CotsTableModel = new CotsTableModel(items_,this.ShowColumns);
       this.setModel(CotsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCotssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Cots Cots = (Cots)Model;

       RepositoryFactory.getInstance().getCotssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCotssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}