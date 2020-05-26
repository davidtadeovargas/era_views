package com.era.views.tables;

import com.era.models.Pers;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PersTableModel;
import java.util.List;

public class PersTable extends BaseJTable {

   public PersTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PersTableModel PersTableModel = new PersTableModel(items,this.ShowColumns);
        this.setModel(PersTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PersTableModel PersTableModel = (PersTableModel)this.getModel();
       final List<Pers> items_ = (List<Pers>) PersTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Pers> items_ = (List<Pers>) RepositoryFactory.getInstance().getPerssRepository().getAll();
       final PersTableModel PersTableModel = new PersTableModel(items_,this.ShowColumns);
       this.setModel(PersTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPerssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Pers Pers = (Pers)Model;

       RepositoryFactory.getInstance().getPerssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPerssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}