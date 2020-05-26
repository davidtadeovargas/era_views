package com.era.views.tables;

import com.era.models.Serie;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SerieTableModel;
import java.util.List;

public class SerieTable extends BaseJTable {

   public SerieTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SerieTableModel SerieTableModel = new SerieTableModel(items,this.ShowColumns);
        this.setModel(SerieTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SerieTableModel SerieTableModel = (SerieTableModel)this.getModel();
       final List<Serie> items_ = (List<Serie>) SerieTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Serie> items_ = (List<Serie>) RepositoryFactory.getInstance().getSeriesRepository().getAll();
       final SerieTableModel SerieTableModel = new SerieTableModel(items_,this.ShowColumns);
       this.setModel(SerieTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getSeriesRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Serie Serie = (Serie)Model;

       RepositoryFactory.getInstance().getSeriesRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getSeriesRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}