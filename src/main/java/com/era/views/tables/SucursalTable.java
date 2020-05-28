package com.era.views.tables;

import com.era.models.Sucursal;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SucursalTableModel;
import java.util.List;

public class SucursalTable extends BaseJTable {

   public SucursalTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SucursalTableModel SucursalTableModel = new SucursalTableModel(items,this.ShowColumns);
        this.setModel(SucursalTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SucursalTableModel SucursalTableModel = (SucursalTableModel)this.getModel();
       final List<Sucursal> items_ = (List<Sucursal>) SucursalTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Sucursal> items_ = (List<Sucursal>) RepositoryFactory.getInstance().getSucursalsRepository().getAll();
       final SucursalTableModel SucursalTableModel = new SucursalTableModel(items_,this.ShowColumns);
       this.setModel(SucursalTableModel);
   }

}