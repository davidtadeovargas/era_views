package com.era.views.tables;

import com.era.models.Comprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ComprsTableModel;
import java.util.List;

public class ComprsTable extends BaseJTable {

   public ComprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ComprsTableModel ComprsTableModel = new ComprsTableModel(items,this.ShowColumns);
        this.setModel(ComprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ComprsTableModel ComprsTableModel = (ComprsTableModel)this.getModel();
       final List<Comprs> items_ = (List<Comprs>) ComprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Comprs> items_ = (List<Comprs>) RepositoryFactory.getInstance().getComprssRepository().getAll();
       final ComprsTableModel ComprsTableModel = new ComprsTableModel(items_,this.ShowColumns);
       this.setModel(ComprsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getComprssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Comprs Comprs = (Comprs)Model;

       RepositoryFactory.getInstance().getComprssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getComprssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}