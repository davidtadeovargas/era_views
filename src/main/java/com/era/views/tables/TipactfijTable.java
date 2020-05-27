package com.era.views.tables;

import com.era.models.Tipactfij;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TipactfijTableModel;
import java.util.List;

public class TipactfijTable extends BaseJTable {

   public TipactfijTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TipactfijTableModel TipactfijTableModel = new TipactfijTableModel(items,this.ShowColumns);
        this.setModel(TipactfijTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TipactfijTableModel TipactfijTableModel = (TipactfijTableModel)this.getModel();
       final List<Tipactfij> items_ = (List<Tipactfij>) TipactfijTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tipactfij> items_ = (List<Tipactfij>) RepositoryFactory.getInstance().getTipactfijsRepository().getAll();
       final TipactfijTableModel TipactfijTableModel = new TipactfijTableModel(items_,this.ShowColumns);
       this.setModel(TipactfijTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTipactfijsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Tipactfij Tipactfij = (Tipactfij)Model_;

       RepositoryFactory.getInstance().getTipactfijsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTipactfijsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}