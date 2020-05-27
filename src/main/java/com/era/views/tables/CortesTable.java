package com.era.views.tables;

import com.era.models.Cortes;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CortesTableModel;
import java.util.List;

public class CortesTable extends BaseJTable {

   public CortesTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CortesTableModel CortesTableModel = new CortesTableModel(items,this.ShowColumns);
        this.setModel(CortesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CortesTableModel CortesTableModel = (CortesTableModel)this.getModel();
       final List<Cortes> items_ = (List<Cortes>) CortesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cortes> items_ = (List<Cortes>) RepositoryFactory.getInstance().getCortessRepository().getAll();
       final CortesTableModel CortesTableModel = new CortesTableModel(items_,this.ShowColumns);
       this.setModel(CortesTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCortessRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Cortes Cortes = (Cortes)Model_;

       RepositoryFactory.getInstance().getCortessRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCortessRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}