package com.era.views.tables;

import com.era.models.MovimientosPagos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MovimientosPagosTableModel;
import java.util.List;

public class MovimientosPagosTable extends BaseJTable {

   public MovimientosPagosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MovimientosPagosTableModel MovimientosPagosTableModel = new MovimientosPagosTableModel(items,this.ShowColumns);
        this.setModel(MovimientosPagosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MovimientosPagosTableModel MovimientosPagosTableModel = (MovimientosPagosTableModel)this.getModel();
       final List<MovimientosPagos> items_ = (List<MovimientosPagos>) MovimientosPagosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<MovimientosPagos> items_ = (List<MovimientosPagos>) RepositoryFactory.getInstance().getMovimientosPagossRepository().getAll();
       final MovimientosPagosTableModel MovimientosPagosTableModel = new MovimientosPagosTableModel(items_,this.ShowColumns);
       this.setModel(MovimientosPagosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getMovimientosPagossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final MovimientosPagos MovimientosPagos = (MovimientosPagos)Model;

       RepositoryFactory.getInstance().getMovimientosPagossRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getMovimientosPagossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}