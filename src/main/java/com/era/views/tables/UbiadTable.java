package com.era.views.tables;

import com.era.models.Ubiad;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UbiadTableModel;
import java.util.List;

public class UbiadTable extends BaseJTable {

   public UbiadTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final UbiadTableModel UbiadTableModel = new UbiadTableModel(items,this.ShowColumns);
        this.setModel(UbiadTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final UbiadTableModel UbiadTableModel = (UbiadTableModel)this.getModel();
       final List<Ubiad> items_ = (List<Ubiad>) UbiadTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Ubiad> items_ = (List<Ubiad>) RepositoryFactory.getInstance().getUbiadsRepository().getAll();
       final UbiadTableModel UbiadTableModel = new UbiadTableModel(items_,this.ShowColumns);
       this.setModel(UbiadTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getUbiadsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Ubiad Ubiad = (Ubiad)Model_;

       RepositoryFactory.getInstance().getUbiadsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getUbiadsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}