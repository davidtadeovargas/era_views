package com.era.views.tables;

import com.era.models.Concepnot;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConcepnotTableModel;
import java.util.List;

public class ConcepnotTable extends BaseJTable {

   public ConcepnotTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConcepnotTableModel ConcepnotTableModel = new ConcepnotTableModel(items,this.ShowColumns);
        this.setModel(ConcepnotTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConcepnotTableModel ConcepnotTableModel = (ConcepnotTableModel)this.getModel();
       final List<Concepnot> items_ = (List<Concepnot>) ConcepnotTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Concepnot> items_ = (List<Concepnot>) RepositoryFactory.getInstance().getConcepnotsRepository().getAll();
       final ConcepnotTableModel ConcepnotTableModel = new ConcepnotTableModel(items_,this.ShowColumns);
       this.setModel(ConcepnotTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getConcepnotsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Concepnot Concepnot = (Concepnot)Model;

       RepositoryFactory.getInstance().getConcepnotsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getConcepnotsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}