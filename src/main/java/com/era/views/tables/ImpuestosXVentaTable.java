package com.era.views.tables;

import com.era.models.ImpuestosXVenta;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuestosXVentaTableModel;
import java.util.List;

public class ImpuestosXVentaTable extends BaseJTable {

   public ImpuestosXVentaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = new ImpuestosXVentaTableModel(items,this.ShowColumns);
        this.setModel(ImpuestosXVentaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = (ImpuestosXVentaTableModel)this.getModel();
       final List<ImpuestosXVenta> items_ = (List<ImpuestosXVenta>) ImpuestosXVentaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuestosXVenta> items_ = (List<ImpuestosXVenta>) RepositoryFactory.getInstance().getImpuestosXVentasRepository().getAll();
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = new ImpuestosXVentaTableModel(items_,this.ShowColumns);
       this.setModel(ImpuestosXVentaTableModel);
   }

}