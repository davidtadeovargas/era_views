package com.era.views.tables;

import com.era.models.Marcs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MarcsTableModel;
import java.util.List;

public class MarcsTable extends BaseJTable {

   public MarcsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MarcsTableModel MarcsTableModel = new MarcsTableModel(items,this.ShowColumns);
        this.setModel(MarcsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MarcsTableModel MarcsTableModel = (MarcsTableModel)this.getModel();
       final List<Marcs> items_ = (List<Marcs>) MarcsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Marcs> items_ = (List<Marcs>) RepositoryFactory.getInstance().getMarcssRepository().getAll();
       final MarcsTableModel MarcsTableModel = new MarcsTableModel(items_,this.ShowColumns);
       this.setModel(MarcsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getMarcssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Marcs Marcs = (Marcs)Model;

       RepositoryFactory.getInstance().getMarcssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getMarcssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}