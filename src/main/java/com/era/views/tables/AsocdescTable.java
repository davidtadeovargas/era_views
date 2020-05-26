package com.era.views.tables;

import com.era.models.Asocdesc;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AsocdescTableModel;
import java.util.List;

public class AsocdescTable extends BaseJTable {

   public AsocdescTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AsocdescTableModel AsocdescTableModel = new AsocdescTableModel(items,this.ShowColumns);
        this.setModel(AsocdescTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AsocdescTableModel AsocdescTableModel = (AsocdescTableModel)this.getModel();
       final List<Asocdesc> items_ = (List<Asocdesc>) AsocdescTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Asocdesc> items_ = (List<Asocdesc>) RepositoryFactory.getInstance().getAsocdescsRepository().getAll();
       final AsocdescTableModel AsocdescTableModel = new AsocdescTableModel(items_,this.ShowColumns);
       this.setModel(AsocdescTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getAsocdescsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Asocdesc Asocdesc = (Asocdesc)Model;

       RepositoryFactory.getInstance().getAsocdescsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getAsocdescsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}