package com.era.views.tables;

import com.era.models.Clasprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasprodTableModel;
import java.util.List;

public class ClasprodTable extends BaseJTable {

   public ClasprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasprodTableModel ClasprodTableModel = new ClasprodTableModel(items,this.ShowColumns);
        this.setModel(ClasprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasprodTableModel ClasprodTableModel = (ClasprodTableModel)this.getModel();
       final List<Clasprod> items_ = (List<Clasprod>) ClasprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasprod> items_ = (List<Clasprod>) RepositoryFactory.getInstance().getClasprodsRepository().getAll();
       final ClasprodTableModel ClasprodTableModel = new ClasprodTableModel(items_,this.ShowColumns);
       this.setModel(ClasprodTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getClasprodsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Clasprod Clasprod = (Clasprod)Model;

       RepositoryFactory.getInstance().getClasprodsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getClasprodsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}