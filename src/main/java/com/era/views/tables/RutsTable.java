package com.era.views.tables;

import com.era.models.Ruts;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.RutsTableModel;
import java.util.List;

public class RutsTable extends BaseJTable {

   public RutsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final RutsTableModel RutsTableModel = new RutsTableModel(items,this.ShowColumns);
        this.setModel(RutsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final RutsTableModel RutsTableModel = (RutsTableModel)this.getModel();
       final List<Ruts> items_ = (List<Ruts>) RutsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Ruts> items_ = (List<Ruts>) RepositoryFactory.getInstance().getRutssRepository().getAll();
       final RutsTableModel RutsTableModel = new RutsTableModel(items_,this.ShowColumns);
       this.setModel(RutsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getRutssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Ruts Ruts = (Ruts)Model;

       RepositoryFactory.getInstance().getRutssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getRutssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}