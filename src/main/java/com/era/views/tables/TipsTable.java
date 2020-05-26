package com.era.views.tables;

import com.era.models.Tips;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TipsTableModel;
import java.util.List;

public class TipsTable extends BaseJTable {

   public TipsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TipsTableModel TipsTableModel = new TipsTableModel(items,this.ShowColumns);
        this.setModel(TipsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TipsTableModel TipsTableModel = (TipsTableModel)this.getModel();
       final List<Tips> items_ = (List<Tips>) TipsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tips> items_ = (List<Tips>) RepositoryFactory.getInstance().getTipssRepository().getAll();
       final TipsTableModel TipsTableModel = new TipsTableModel(items_,this.ShowColumns);
       this.setModel(TipsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTipssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Tips Tips = (Tips)Model;

       RepositoryFactory.getInstance().getTipssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTipssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}