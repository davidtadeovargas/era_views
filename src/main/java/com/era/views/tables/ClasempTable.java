package com.era.views.tables;

import com.era.models.Clasemp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasempTableModel;
import java.util.List;

public class ClasempTable extends BaseJTable {

   public ClasempTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasempTableModel ClasempTableModel = new ClasempTableModel(items,this.ShowColumns);
        this.setModel(ClasempTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasempTableModel ClasempTableModel = (ClasempTableModel)this.getModel();
       final List<Clasemp> items_ = (List<Clasemp>) ClasempTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasemp> items_ = (List<Clasemp>) RepositoryFactory.getInstance().getClasempsRepository().getAll();
       final ClasempTableModel ClasempTableModel = new ClasempTableModel(items_,this.ShowColumns);
       this.setModel(ClasempTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getClasempsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Clasemp Clasemp = (Clasemp)Model_;

       RepositoryFactory.getInstance().getClasempsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getClasempsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}