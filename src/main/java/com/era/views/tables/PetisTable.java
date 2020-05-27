package com.era.views.tables;

import com.era.models.Petis;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PetisTableModel;
import java.util.List;

public class PetisTable extends BaseJTable {

   public PetisTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PetisTableModel PetisTableModel = new PetisTableModel(items,this.ShowColumns);
        this.setModel(PetisTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PetisTableModel PetisTableModel = (PetisTableModel)this.getModel();
       final List<Petis> items_ = (List<Petis>) PetisTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Petis> items_ = (List<Petis>) RepositoryFactory.getInstance().getPetissRepository().getAll();
       final PetisTableModel PetisTableModel = new PetisTableModel(items_,this.ShowColumns);
       this.setModel(PetisTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPetissRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Petis Petis = (Petis)Model_;

       RepositoryFactory.getInstance().getPetissRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPetissRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}