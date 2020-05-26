package com.era.views.tables;

import com.era.models.Anaqs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AnaqsTableModel;
import java.util.List;

public class AnaqsTable extends BaseJTable {

   public AnaqsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AnaqsTableModel AnaqsTableModel = new AnaqsTableModel(items,this.ShowColumns);
        this.setModel(AnaqsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AnaqsTableModel AnaqsTableModel = (AnaqsTableModel)this.getModel();
       final List<Anaqs> items_ = (List<Anaqs>) AnaqsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Anaqs> items_ = (List<Anaqs>) RepositoryFactory.getInstance().getAnaqssRepository().getAll();
       final AnaqsTableModel AnaqsTableModel = new AnaqsTableModel(items_,this.ShowColumns);
       this.setModel(AnaqsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getAnaqssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Anaqs Anaqs = (Anaqs)Model;

       RepositoryFactory.getInstance().getAnaqssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getAnaqssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}