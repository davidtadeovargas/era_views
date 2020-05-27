package com.era.views.tables;

import com.era.models.Costs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CostsTableModel;
import java.util.List;

public class CostsTable extends BaseJTable {

   public CostsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CostsTableModel CostsTableModel = new CostsTableModel(items,this.ShowColumns);
        this.setModel(CostsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CostsTableModel CostsTableModel = (CostsTableModel)this.getModel();
       final List<Costs> items_ = (List<Costs>) CostsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Costs> items_ = (List<Costs>) RepositoryFactory.getInstance().getCostssRepository().getAll();
       final CostsTableModel CostsTableModel = new CostsTableModel(items_,this.ShowColumns);
       this.setModel(CostsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCostssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Costs Costs = (Costs)Model_;

       RepositoryFactory.getInstance().getCostssRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCostssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}