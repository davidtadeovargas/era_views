package com.era.views.tables;

import com.era.models.Ords;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.OrdsTableModel;
import java.util.List;

public class OrdsTable extends BaseJTable {

   public OrdsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final OrdsTableModel OrdsTableModel = new OrdsTableModel(items,this.ShowColumns);
        this.setModel(OrdsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final OrdsTableModel OrdsTableModel = (OrdsTableModel)this.getModel();
       final List<Ords> items_ = (List<Ords>) OrdsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Ords> items_ = (List<Ords>) RepositoryFactory.getInstance().getOrdssRepository().getAll();
       final OrdsTableModel OrdsTableModel = new OrdsTableModel(items_,this.ShowColumns);
       this.setModel(OrdsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getOrdssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Ords Ords = (Ords)Model;

       RepositoryFactory.getInstance().getOrdssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getOrdssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}