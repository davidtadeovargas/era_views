package com.era.views.tables;

import com.era.models.Activos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ActivosTableModel;
import java.util.List;

public class ActivosTable extends BaseJTable {

   public ActivosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ActivosTableModel ActivosTableModel = new ActivosTableModel(items,this.ShowColumns);
        this.setModel(ActivosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ActivosTableModel ActivosTableModel = (ActivosTableModel)this.getModel();
       final List<Activos> items_ = (List<Activos>) ActivosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Activos> items_ = (List<Activos>) RepositoryFactory.getInstance().getActivossRepository().getAll();
       final ActivosTableModel ActivosTableModel = new ActivosTableModel(items_,this.ShowColumns);
       this.setModel(ActivosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getActivossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Activos Activos = (Activos)Model_;

       RepositoryFactory.getInstance().getActivossRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getActivossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}