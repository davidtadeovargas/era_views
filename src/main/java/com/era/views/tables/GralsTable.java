package com.era.views.tables;

import com.era.models.Grals;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.GralsTableModel;
import java.util.List;

public class GralsTable extends BaseJTable {

   public GralsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final GralsTableModel GralsTableModel = new GralsTableModel(items,this.ShowColumns);
        this.setModel(GralsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final GralsTableModel GralsTableModel = (GralsTableModel)this.getModel();
       final List<Grals> items_ = (List<Grals>) GralsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Grals> items_ = (List<Grals>) RepositoryFactory.getInstance().getGralssRepository().getAll();
       final GralsTableModel GralsTableModel = new GralsTableModel(items_,this.ShowColumns);
       this.setModel(GralsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getGralssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Grals Grals = (Grals)Model;

       RepositoryFactory.getInstance().getGralssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getGralssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}