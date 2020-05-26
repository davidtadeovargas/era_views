package com.era.views.tables;

import com.era.models.Compa;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CompaTableModel;
import java.util.List;

public class CompaTable extends BaseJTable {

   public CompaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CompaTableModel CompaTableModel = new CompaTableModel(items,this.ShowColumns);
        this.setModel(CompaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CompaTableModel CompaTableModel = (CompaTableModel)this.getModel();
       final List<Compa> items_ = (List<Compa>) CompaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Compa> items_ = (List<Compa>) RepositoryFactory.getInstance().getCompasRepository().getAll();
       final CompaTableModel CompaTableModel = new CompaTableModel(items_,this.ShowColumns);
       this.setModel(CompaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCompasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Compa Compa = (Compa)Model;

       RepositoryFactory.getInstance().getCompasRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCompasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}