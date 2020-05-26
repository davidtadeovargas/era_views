package com.era.views.tables;

import com.era.models.Lugs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.LugsTableModel;
import java.util.List;

public class LugsTable extends BaseJTable {

   public LugsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final LugsTableModel LugsTableModel = new LugsTableModel(items,this.ShowColumns);
        this.setModel(LugsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final LugsTableModel LugsTableModel = (LugsTableModel)this.getModel();
       final List<Lugs> items_ = (List<Lugs>) LugsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Lugs> items_ = (List<Lugs>) RepositoryFactory.getInstance().getLugssRepository().getAll();
       final LugsTableModel LugsTableModel = new LugsTableModel(items_,this.ShowColumns);
       this.setModel(LugsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getLugssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Lugs Lugs = (Lugs)Model;

       RepositoryFactory.getInstance().getLugssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getLugssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}