package com.era.views.tables;

import com.era.models.Measure;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MeasureTableModel;
import java.util.List;

public class MeasureTable extends BaseJTable {

   public MeasureTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MeasureTableModel MeasureTableModel = new MeasureTableModel(items,this.ShowColumns);
        this.setModel(MeasureTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MeasureTableModel MeasureTableModel = (MeasureTableModel)this.getModel();
       final List<Measure> items_ = (List<Measure>) MeasureTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Measure> items_ = (List<Measure>) RepositoryFactory.getInstance().getMeasuresRepository().getAll();
       final MeasureTableModel MeasureTableModel = new MeasureTableModel(items_,this.ShowColumns);
       this.setModel(MeasureTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getMeasuresRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Measure Measure = (Measure)Model_;

       RepositoryFactory.getInstance().getMeasuresRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getMeasuresRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}