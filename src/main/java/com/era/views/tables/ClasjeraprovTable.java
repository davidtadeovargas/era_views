package com.era.views.tables;

import com.era.models.Clasjeraprov;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasjeraprovTableModel;
import java.util.List;

public class ClasjeraprovTable extends BaseJTable {

   public ClasjeraprovTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasjeraprovTableModel ClasjeraprovTableModel = new ClasjeraprovTableModel(items,this.ShowColumns);
        this.setModel(ClasjeraprovTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasjeraprovTableModel ClasjeraprovTableModel = (ClasjeraprovTableModel)this.getModel();
       final List<Clasjeraprov> items_ = (List<Clasjeraprov>) ClasjeraprovTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasjeraprov> items_ = (List<Clasjeraprov>) RepositoryFactory.getInstance().getClasjeraprovsRepository().getAll();
       final ClasjeraprovTableModel ClasjeraprovTableModel = new ClasjeraprovTableModel(items_,this.ShowColumns);
       this.setModel(ClasjeraprovTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getClasjeraprovsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Clasjeraprov Clasjeraprov = (Clasjeraprov)Model;

       RepositoryFactory.getInstance().getClasjeraprovsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getClasjeraprovsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}