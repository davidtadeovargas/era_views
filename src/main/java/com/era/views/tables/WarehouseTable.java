package com.era.views.tables;

import com.era.models.Warehouse;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.WarehouseTableModel;
import java.util.List;

public class WarehouseTable extends BaseJTable {

   public WarehouseTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final WarehouseTableModel WarehouseTableModel = new WarehouseTableModel(items,this.ShowColumns);
        this.setModel(WarehouseTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final WarehouseTableModel WarehouseTableModel = (WarehouseTableModel)this.getModel();
       final List<Warehouse> items_ = (List<Warehouse>) WarehouseTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Warehouse> items_ = (List<Warehouse>) RepositoryFactory.getInstance().getWarehousesRepository().getAll();
       final WarehouseTableModel WarehouseTableModel = new WarehouseTableModel(items_,this.ShowColumns);
       this.setModel(WarehouseTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getWarehousesRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Warehouse Warehouse = (Warehouse)Model;

       RepositoryFactory.getInstance().getWarehousesRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getWarehousesRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}