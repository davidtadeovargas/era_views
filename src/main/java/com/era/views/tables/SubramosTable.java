package com.era.views.tables;

import com.era.models.Subramos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SubramosTableModel;
import java.util.List;

public class SubramosTable extends BaseJTable {

   public SubramosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SubramosTableModel SubramosTableModel = new SubramosTableModel(items,this.ShowColumns);
        this.setModel(SubramosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SubramosTableModel SubramosTableModel = (SubramosTableModel)this.getModel();
       final List<Subramos> items_ = (List<Subramos>) SubramosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Subramos> items_ = (List<Subramos>) RepositoryFactory.getInstance().getSubramossRepository().getAll();
       final SubramosTableModel SubramosTableModel = new SubramosTableModel(items_,this.ShowColumns);
       this.setModel(SubramosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getSubramossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Subramos Subramos = (Subramos)Model_;

       RepositoryFactory.getInstance().getSubramossRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getSubramossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}