package com.era.views.tables;

import com.era.models.Existalma;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ExistalmaTableModel;
import java.util.List;

public class ExistalmaTable extends BaseJTable {

   public ExistalmaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ExistalmaTableModel ExistalmaTableModel = new ExistalmaTableModel(items,this.ShowColumns);
        this.setModel(ExistalmaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ExistalmaTableModel ExistalmaTableModel = (ExistalmaTableModel)this.getModel();
       final List<Existalma> items_ = (List<Existalma>) ExistalmaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Existalma> items_ = (List<Existalma>) RepositoryFactory.getInstance().getExistalmasRepository().getAll();
       final ExistalmaTableModel ExistalmaTableModel = new ExistalmaTableModel(items_,this.ShowColumns);
       this.setModel(ExistalmaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getExistalmasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Existalma Existalma = (Existalma)Model;

       RepositoryFactory.getInstance().getExistalmasRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getExistalmasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}