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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Warehouse> items_ = (List<Warehouse>) RepositoryFactory.getInstance().getWarehousesRepository().getByLikeEncabezados(search);
       final WarehouseTableModel WarehouseTableModel = new WarehouseTableModel(items_,this.ShowColumns);
       this.setModel(WarehouseTableModel);
   }

}