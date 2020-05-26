package com.era.views.tables;

import com.era.models.UsoCFDI;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UsoCFDITableModel;
import java.util.List;

public class UsoCFDITable extends BaseJTable {

   public UsoCFDITable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final UsoCFDITableModel UsoCFDITableModel = new UsoCFDITableModel(items,this.ShowColumns);
        this.setModel(UsoCFDITableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final UsoCFDITableModel UsoCFDITableModel = (UsoCFDITableModel)this.getModel();
       final List<UsoCFDI> items_ = (List<UsoCFDI>) UsoCFDITableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<UsoCFDI> items_ = (List<UsoCFDI>) RepositoryFactory.getInstance().getUsoCFDIsRepository().getAll();
       final UsoCFDITableModel UsoCFDITableModel = new UsoCFDITableModel(items_,this.ShowColumns);
       this.setModel(UsoCFDITableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getUsoCFDIsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final UsoCFDI UsoCFDI = (UsoCFDI)Model;

       RepositoryFactory.getInstance().getUsoCFDIsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getUsoCFDIsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}