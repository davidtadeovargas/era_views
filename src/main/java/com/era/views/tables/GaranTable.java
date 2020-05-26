package com.era.views.tables;

import com.era.models.Garan;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.GaranTableModel;
import java.util.List;

public class GaranTable extends BaseJTable {

   public GaranTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final GaranTableModel GaranTableModel = new GaranTableModel(items,this.ShowColumns);
        this.setModel(GaranTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final GaranTableModel GaranTableModel = (GaranTableModel)this.getModel();
       final List<Garan> items_ = (List<Garan>) GaranTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Garan> items_ = (List<Garan>) RepositoryFactory.getInstance().getGaransRepository().getAll();
       final GaranTableModel GaranTableModel = new GaranTableModel(items_,this.ShowColumns);
       this.setModel(GaranTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getGaransRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Garan Garan = (Garan)Model;

       RepositoryFactory.getInstance().getGaransRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getGaransRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}