package com.era.views.tables;

import com.era.models.Clasprov;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasprovTableModel;
import java.util.List;

public class ClasprovTable extends BaseJTable {

   public ClasprovTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasprovTableModel ClasprovTableModel = new ClasprovTableModel(items,this.ShowColumns);
        this.setModel(ClasprovTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasprovTableModel ClasprovTableModel = (ClasprovTableModel)this.getModel();
       final List<Clasprov> items_ = (List<Clasprov>) ClasprovTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasprov> items_ = (List<Clasprov>) RepositoryFactory.getInstance().getClasprovsRepository().getAll();
       final ClasprovTableModel ClasprovTableModel = new ClasprovTableModel(items_,this.ShowColumns);
       this.setModel(ClasprovTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getClasprovsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Clasprov Clasprov = (Clasprov)Model_;

       RepositoryFactory.getInstance().getClasprovsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getClasprovsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}