package com.era.views.tables;

import com.era.models.Sectores;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SectoresTableModel;
import java.util.List;

public class SectoresTable extends BaseJTable {

   public SectoresTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SectoresTableModel SectoresTableModel = new SectoresTableModel(items,this.ShowColumns);
        this.setModel(SectoresTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SectoresTableModel SectoresTableModel = (SectoresTableModel)this.getModel();
       final List<Sectores> items_ = (List<Sectores>) SectoresTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Sectores> items_ = (List<Sectores>) RepositoryFactory.getInstance().getSectoressRepository().getAll();
       final SectoresTableModel SectoresTableModel = new SectoresTableModel(items_,this.ShowColumns);
       this.setModel(SectoresTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getSectoressRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Sectores Sectores = (Sectores)Model_;

       RepositoryFactory.getInstance().getSectoressRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getSectoressRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}