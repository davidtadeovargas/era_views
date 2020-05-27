package com.era.views.tables;

import com.era.models.PedidosParts;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PedidosPartsTableModel;
import java.util.List;

public class PedidosPartsTable extends BaseJTable {

   public PedidosPartsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PedidosPartsTableModel PedidosPartsTableModel = new PedidosPartsTableModel(items,this.ShowColumns);
        this.setModel(PedidosPartsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PedidosPartsTableModel PedidosPartsTableModel = (PedidosPartsTableModel)this.getModel();
       final List<PedidosParts> items_ = (List<PedidosParts>) PedidosPartsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PedidosParts> items_ = (List<PedidosParts>) RepositoryFactory.getInstance().getPedidosPartssRepository().getAll();
       final PedidosPartsTableModel PedidosPartsTableModel = new PedidosPartsTableModel(items_,this.ShowColumns);
       this.setModel(PedidosPartsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPedidosPartssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final PedidosParts PedidosParts = (PedidosParts)Model_;

       RepositoryFactory.getInstance().getPedidosPartssRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPedidosPartssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}