package com.era.views.tables;

import com.era.models.Contras;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ContrasTableModel;
import java.util.List;

public class ContrasTable extends BaseJTable {

   public ContrasTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ContrasTableModel ContrasTableModel = new ContrasTableModel(items,this.ShowColumns);
        this.setModel(ContrasTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ContrasTableModel ContrasTableModel = (ContrasTableModel)this.getModel();
       final List<Contras> items_ = (List<Contras>) ContrasTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Contras> items_ = (List<Contras>) RepositoryFactory.getInstance().getContrassRepository().getAll();
       final ContrasTableModel ContrasTableModel = new ContrasTableModel(items_,this.ShowColumns);
       this.setModel(ContrasTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getContrassRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Contras Contras = (Contras)Model_;

       RepositoryFactory.getInstance().getContrassRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getContrassRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}