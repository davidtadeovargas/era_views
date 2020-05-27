package com.era.views.tables;

import com.era.models.CClaveUnidad;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CClaveUnidadTableModel;
import java.util.List;

public class CClaveUnidadTable extends BaseJTable {

   public CClaveUnidadTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CClaveUnidadTableModel CClaveUnidadTableModel = new CClaveUnidadTableModel(items,this.ShowColumns);
        this.setModel(CClaveUnidadTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CClaveUnidadTableModel CClaveUnidadTableModel = (CClaveUnidadTableModel)this.getModel();
       final List<CClaveUnidad> items_ = (List<CClaveUnidad>) CClaveUnidadTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CClaveUnidad> items_ = (List<CClaveUnidad>) RepositoryFactory.getInstance().getCClaveUnidadsRepository().getAll();
       final CClaveUnidadTableModel CClaveUnidadTableModel = new CClaveUnidadTableModel(items_,this.ShowColumns);
       this.setModel(CClaveUnidadTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCClaveUnidadsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final CClaveUnidad CClaveUnidad = (CClaveUnidad)Model_;

       RepositoryFactory.getInstance().getCClaveUnidadsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCClaveUnidadsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}