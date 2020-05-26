package com.era.views.tables;

import com.era.models.BasDats;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.BasDatsTableModel;
import java.util.List;

public class BasDatsTable extends BaseJTable {

   public BasDatsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final BasDatsTableModel BasDatsTableModel = new BasDatsTableModel(items,this.ShowColumns);
        this.setModel(BasDatsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final BasDatsTableModel BasDatsTableModel = (BasDatsTableModel)this.getModel();
       final List<BasDats> items_ = (List<BasDats>) BasDatsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<BasDats> items_ = (List<BasDats>) RepositoryFactory.getInstance().getBasDatssRepository().getAll();
       final BasDatsTableModel BasDatsTableModel = new BasDatsTableModel(items_,this.ShowColumns);
       this.setModel(BasDatsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getBasDatssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final BasDats BasDats = (BasDats)Model;

       RepositoryFactory.getInstance().getBasDatssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getBasDatssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}