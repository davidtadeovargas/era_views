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

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPedidossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Pedidos Pedidos = (Pedidos)Model_;

       RepositoryFactory.getInstance().getPedidossRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPedidossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}