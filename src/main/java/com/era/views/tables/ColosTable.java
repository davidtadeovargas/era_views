package com.era.views.tables;

import com.era.models.Colos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ColosTableModel;
import java.util.List;

public class ColosTable extends BaseJTable {

   public ColosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ColosTableModel ColosTableModel = new ColosTableModel(items,this.ShowColumns);
        this.setModel(ColosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ColosTableModel ColosTableModel = (ColosTableModel)this.getModel();
       final List<Colos> items_ = (List<Colos>) ColosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Colos> items_ = (List<Colos>) RepositoryFactory.getInstance().getColossRepository().getAll();
       final ColosTableModel ColosTableModel = new ColosTableModel(items_,this.ShowColumns);
       this.setModel(ColosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getColossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Colos Colos = (Colos)Model;

       RepositoryFactory.getInstance().getColossRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getColossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}