package com.era.views.tables;

import com.era.models.Rubr;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.RubrTableModel;
import java.util.List;

public class RubrTable extends BaseJTable {

   public RubrTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final RubrTableModel RubrTableModel = new RubrTableModel(items,this.ShowColumns);
        this.setModel(RubrTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final RubrTableModel RubrTableModel = (RubrTableModel)this.getModel();
       final List<Rubr> items_ = (List<Rubr>) RubrTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Rubr> items_ = (List<Rubr>) RepositoryFactory.getInstance().getRubrsRepository().getAll();
       final RubrTableModel RubrTableModel = new RubrTableModel(items_,this.ShowColumns);
       this.setModel(RubrTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getRubrsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Rubr Rubr = (Rubr)Model_;

       RepositoryFactory.getInstance().getRubrsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getRubrsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}