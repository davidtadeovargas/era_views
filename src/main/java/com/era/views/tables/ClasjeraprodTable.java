package com.era.views.tables;

import com.era.models.Clasjeraprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasjeraprodTableModel;
import java.util.List;

public class ClasjeraprodTable extends BaseJTable {

   public ClasjeraprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasjeraprodTableModel ClasjeraprodTableModel = new ClasjeraprodTableModel(items,this.ShowColumns);
        this.setModel(ClasjeraprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasjeraprodTableModel ClasjeraprodTableModel = (ClasjeraprodTableModel)this.getModel();
       final List<Clasjeraprod> items_ = (List<Clasjeraprod>) ClasjeraprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasjeraprod> items_ = (List<Clasjeraprod>) RepositoryFactory.getInstance().getClasjeraprodsRepository().getAll();
       final ClasjeraprodTableModel ClasjeraprodTableModel = new ClasjeraprodTableModel(items_,this.ShowColumns);
       this.setModel(ClasjeraprodTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getClasjeraprodsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Clasjeraprod Clasjeraprod = (Clasjeraprod)Model_;

       RepositoryFactory.getInstance().getClasjeraprodsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getClasjeraprodsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}