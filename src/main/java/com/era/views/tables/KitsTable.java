package com.era.views.tables;

import com.era.models.Kits;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.KitsTableModel;
import java.util.List;

public class KitsTable extends BaseJTable {

   public KitsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final KitsTableModel KitsTableModel = new KitsTableModel(items,this.ShowColumns);
        this.setModel(KitsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final KitsTableModel KitsTableModel = (KitsTableModel)this.getModel();
       final List<Kits> items_ = (List<Kits>) KitsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Kits> items_ = (List<Kits>) RepositoryFactory.getInstance().getKitssRepository().getAll();
       final KitsTableModel KitsTableModel = new KitsTableModel(items_,this.ShowColumns);
       this.setModel(KitsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getKitssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Kits Kits = (Kits)Model_;

       RepositoryFactory.getInstance().getKitssRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getKitssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}