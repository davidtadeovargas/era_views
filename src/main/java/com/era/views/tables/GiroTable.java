package com.era.views.tables;

import com.era.models.Giro;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.GiroTableModel;
import java.util.List;

public class GiroTable extends BaseJTable {

   public GiroTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final GiroTableModel GiroTableModel = new GiroTableModel(items,this.ShowColumns);
        this.setModel(GiroTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final GiroTableModel GiroTableModel = (GiroTableModel)this.getModel();
       final List<Giro> items_ = (List<Giro>) GiroTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Giro> items_ = (List<Giro>) RepositoryFactory.getInstance().getGirosRepository().getAll();
       final GiroTableModel GiroTableModel = new GiroTableModel(items_,this.ShowColumns);
       this.setModel(GiroTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getGirosRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Giro Giro = (Giro)Model_;

       RepositoryFactory.getInstance().getGirosRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getGirosRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}