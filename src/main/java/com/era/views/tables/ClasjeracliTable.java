package com.era.views.tables;

import com.era.models.Clasjeracli;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasjeracliTableModel;
import java.util.List;

public class ClasjeracliTable extends BaseJTable {

   public ClasjeracliTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasjeracliTableModel ClasjeracliTableModel = new ClasjeracliTableModel(items,this.ShowColumns);
        this.setModel(ClasjeracliTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasjeracliTableModel ClasjeracliTableModel = (ClasjeracliTableModel)this.getModel();
       final List<Clasjeracli> items_ = (List<Clasjeracli>) ClasjeracliTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasjeracli> items_ = (List<Clasjeracli>) RepositoryFactory.getInstance().getClasjeraclisRepository().getAll();
       final ClasjeracliTableModel ClasjeracliTableModel = new ClasjeracliTableModel(items_,this.ShowColumns);
       this.setModel(ClasjeracliTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getClasjeraclisRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Clasjeracli Clasjeracli = (Clasjeracli)Model;

       RepositoryFactory.getInstance().getClasjeraclisRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getClasjeraclisRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}