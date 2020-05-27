package com.era.views.tables;

import com.era.models.CAduana;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CAduanaTableModel;
import java.util.List;

public class CAduanaTable extends BaseJTable {

   public CAduanaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CAduanaTableModel CAduanaTableModel = new CAduanaTableModel(items,this.ShowColumns);
        this.setModel(CAduanaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CAduanaTableModel CAduanaTableModel = (CAduanaTableModel)this.getModel();
       final List<CAduana> items_ = (List<CAduana>) CAduanaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CAduana> items_ = (List<CAduana>) RepositoryFactory.getInstance().getCAduanasRepository().getAll();
       final CAduanaTableModel CAduanaTableModel = new CAduanaTableModel(items_,this.ShowColumns);
       this.setModel(CAduanaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCAduanasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final CAduana CAduana = (CAduana)Model_;

       RepositoryFactory.getInstance().getCAduanasRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCAduanasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}