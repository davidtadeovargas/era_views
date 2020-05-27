package com.era.views.tables;

import com.era.models.Traspas;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TraspasTableModel;
import java.util.List;

public class TraspasTable extends BaseJTable {

   public TraspasTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TraspasTableModel TraspasTableModel = new TraspasTableModel(items,this.ShowColumns);
        this.setModel(TraspasTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TraspasTableModel TraspasTableModel = (TraspasTableModel)this.getModel();
       final List<Traspas> items_ = (List<Traspas>) TraspasTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Traspas> items_ = (List<Traspas>) RepositoryFactory.getInstance().getTraspassRepository().getAll();
       final TraspasTableModel TraspasTableModel = new TraspasTableModel(items_,this.ShowColumns);
       this.setModel(TraspasTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTraspassRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Traspas Traspas = (Traspas)Model_;

       RepositoryFactory.getInstance().getTraspassRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTraspassRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}