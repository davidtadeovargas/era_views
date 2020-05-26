package com.era.views.tables;

import com.era.models.Fabs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.FabsTableModel;
import java.util.List;

public class FabsTable extends BaseJTable {

   public FabsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final FabsTableModel FabsTableModel = new FabsTableModel(items,this.ShowColumns);
        this.setModel(FabsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final FabsTableModel FabsTableModel = (FabsTableModel)this.getModel();
       final List<Fabs> items_ = (List<Fabs>) FabsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Fabs> items_ = (List<Fabs>) RepositoryFactory.getInstance().getFabssRepository().getAll();
       final FabsTableModel FabsTableModel = new FabsTableModel(items_,this.ShowColumns);
       this.setModel(FabsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getFabssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Fabs Fabs = (Fabs)Model;

       RepositoryFactory.getInstance().getFabssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getFabssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}