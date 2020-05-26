package com.era.views.tables;

import com.era.models.Estadiscor;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.EstadiscorTableModel;
import java.util.List;

public class EstadiscorTable extends BaseJTable {

   public EstadiscorTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final EstadiscorTableModel EstadiscorTableModel = new EstadiscorTableModel(items,this.ShowColumns);
        this.setModel(EstadiscorTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final EstadiscorTableModel EstadiscorTableModel = (EstadiscorTableModel)this.getModel();
       final List<Estadiscor> items_ = (List<Estadiscor>) EstadiscorTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Estadiscor> items_ = (List<Estadiscor>) RepositoryFactory.getInstance().getEstadiscorsRepository().getAll();
       final EstadiscorTableModel EstadiscorTableModel = new EstadiscorTableModel(items_,this.ShowColumns);
       this.setModel(EstadiscorTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getEstadiscorsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Estadiscor Estadiscor = (Estadiscor)Model;

       RepositoryFactory.getInstance().getEstadiscorsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getEstadiscorsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}