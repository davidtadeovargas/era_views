package com.era.views.tables;

import com.era.models.MovimientosAsientos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MovimientosAsientosTableModel;
import java.util.List;

public class MovimientosAsientosTable extends BaseJTable {

   public MovimientosAsientosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MovimientosAsientosTableModel MovimientosAsientosTableModel = new MovimientosAsientosTableModel(items,this.ShowColumns);
        this.setModel(MovimientosAsientosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MovimientosAsientosTableModel MovimientosAsientosTableModel = (MovimientosAsientosTableModel)this.getModel();
       final List<MovimientosAsientos> items_ = (List<MovimientosAsientos>) MovimientosAsientosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<MovimientosAsientos> items_ = (List<MovimientosAsientos>) RepositoryFactory.getInstance().getMovimientosAsientossRepository().getAll();
       final MovimientosAsientosTableModel MovimientosAsientosTableModel = new MovimientosAsientosTableModel(items_,this.ShowColumns);
       this.setModel(MovimientosAsientosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getMovimientosAsientossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final MovimientosAsientos MovimientosAsientos = (MovimientosAsientos)Model;

       RepositoryFactory.getInstance().getMovimientosAsientossRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getMovimientosAsientossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}