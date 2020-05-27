package com.era.views.tables;

import com.era.models.Serieprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SerieprodTableModel;
import java.util.List;

public class SerieprodTable extends BaseJTable {

   public SerieprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SerieprodTableModel SerieprodTableModel = new SerieprodTableModel(items,this.ShowColumns);
        this.setModel(SerieprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SerieprodTableModel SerieprodTableModel = (SerieprodTableModel)this.getModel();
       final List<Serieprod> items_ = (List<Serieprod>) SerieprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Serieprod> items_ = (List<Serieprod>) RepositoryFactory.getInstance().getSerieprodsRepository().getAll();
       final SerieprodTableModel SerieprodTableModel = new SerieprodTableModel(items_,this.ShowColumns);
       this.setModel(SerieprodTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getSerieprodsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Serieprod Serieprod = (Serieprod)Model_;

       RepositoryFactory.getInstance().getSerieprodsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getSerieprodsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}