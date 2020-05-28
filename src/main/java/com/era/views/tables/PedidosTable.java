package com.era.views.tables;

import com.era.models.Pedidos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PedidosTableModel;
import java.util.List;

public class PedidosTable extends BaseJTable {

   public PedidosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PedidosTableModel PedidosTableModel = new PedidosTableModel(items,this.ShowColumns);
        this.setModel(PedidosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PedidosTableModel PedidosTableModel = (PedidosTableModel)this.getModel();
       final List<Pedidos> items_ = (List<Pedidos>) PedidosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Pedidos> items_ = (List<Pedidos>) RepositoryFactory.getInstance().getPedidossRepository().getAll();
       final PedidosTableModel PedidosTableModel = new PedidosTableModel(items_,this.ShowColumns);
       this.setModel(PedidosTableModel);
   }

}