package com.era.views.tables;

import com.era.models.Conceps;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConcepsTableModel;
import java.util.List;

public class ConcepsTable extends BaseJTable {

   public ConcepsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(items,this.ShowColumns);
        this.setModel(ConcepsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConcepsTableModel ConcepsTableModel = (ConcepsTableModel)this.getModel();
       final List<Conceps> items_ = (List<Conceps>) ConcepsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Conceps> items_ = (List<Conceps>) RepositoryFactory.getInstance().getConcepssRepository().getAll();
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(items_,this.ShowColumns);
       this.setModel(ConcepsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getConcepssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Conceps Conceps = (Conceps)Model_;

       RepositoryFactory.getInstance().getConcepssRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getConcepssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}