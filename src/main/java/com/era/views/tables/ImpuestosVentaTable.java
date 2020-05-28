package com.era.views.tables;

import com.era.models.ImpuestosVenta;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuestosVentaTableModel;
import java.util.List;

public class ImpuestosVentaTable extends BaseJTable {

   public ImpuestosVentaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuestosVentaTableModel ImpuestosVentaTableModel = new ImpuestosVentaTableModel(items,this.ShowColumns);
        this.setModel(ImpuestosVentaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuestosVentaTableModel ImpuestosVentaTableModel = (ImpuestosVentaTableModel)this.getModel();
       final List<ImpuestosVenta> items_ = (List<ImpuestosVenta>) ImpuestosVentaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuestosVenta> items_ = (List<ImpuestosVenta>) RepositoryFactory.getInstance().getImpuestosVentasRepository().getAll();
       final ImpuestosVentaTableModel ImpuestosVentaTableModel = new ImpuestosVentaTableModel(items_,this.ShowColumns);
       this.setModel(ImpuestosVentaTableModel);
   }

}