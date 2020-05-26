package com.era.views.tables;

import com.era.models.Ingres;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.IngresTableModel;
import java.util.List;

public class IngresTable extends BaseJTable {

   public IngresTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final IngresTableModel IngresTableModel = new IngresTableModel(items,this.ShowColumns);
        this.setModel(IngresTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final IngresTableModel IngresTableModel = (IngresTableModel)this.getModel();
       final List<Ingres> items_ = (List<Ingres>) IngresTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Ingres> items_ = (List<Ingres>) RepositoryFactory.getInstance().getIngressRepository().getAll();
       final IngresTableModel IngresTableModel = new IngresTableModel(items_,this.ShowColumns);
       this.setModel(IngresTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getIngressRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Ingres Ingres = (Ingres)Model;

       RepositoryFactory.getInstance().getIngressRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getIngressRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}