package com.era.views.tables;

import com.era.models.Pes;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PesTableModel;
import java.util.List;

public class PesTable extends BaseJTable {

   public PesTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PesTableModel PesTableModel = new PesTableModel(items,this.ShowColumns);
        this.setModel(PesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PesTableModel PesTableModel = (PesTableModel)this.getModel();
       final List<Pes> items_ = (List<Pes>) PesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Pes> items_ = (List<Pes>) RepositoryFactory.getInstance().getPessRepository().getAll();
       final PesTableModel PesTableModel = new PesTableModel(items_,this.ShowColumns);
       this.setModel(PesTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPessRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Pes Pes = (Pes)Model_;

       RepositoryFactory.getInstance().getPessRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPessRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}