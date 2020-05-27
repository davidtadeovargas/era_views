package com.era.views.tables;

import com.era.models.Impuesxpartidaped;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuesxpartidapedTableModel;
import java.util.List;

public class ImpuesxpartidapedTable extends BaseJTable {

   public ImpuesxpartidapedTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = new ImpuesxpartidapedTableModel(items,this.ShowColumns);
        this.setModel(ImpuesxpartidapedTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = (ImpuesxpartidapedTableModel)this.getModel();
       final List<Impuesxpartidaped> items_ = (List<Impuesxpartidaped>) ImpuesxpartidapedTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Impuesxpartidaped> items_ = (List<Impuesxpartidaped>) RepositoryFactory.getInstance().getImpuesxpartidapedsRepository().getAll();
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = new ImpuesxpartidapedTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesxpartidapedTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getImpuesxpartidapedsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Impuesxpartidaped Impuesxpartidaped = (Impuesxpartidaped)Model_;

       RepositoryFactory.getInstance().getImpuesxpartidapedsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getImpuesxpartidapedsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}