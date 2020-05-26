package com.era.views.tables;

import com.era.models.Modelprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ModelprodTableModel;
import java.util.List;

public class ModelprodTable extends BaseJTable {

   public ModelprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ModelprodTableModel ModelprodTableModel = new ModelprodTableModel(items,this.ShowColumns);
        this.setModel(ModelprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ModelprodTableModel ModelprodTableModel = (ModelprodTableModel)this.getModel();
       final List<Modelprod> items_ = (List<Modelprod>) ModelprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Modelprod> items_ = (List<Modelprod>) RepositoryFactory.getInstance().getModelprodsRepository().getAll();
       final ModelprodTableModel ModelprodTableModel = new ModelprodTableModel(items_,this.ShowColumns);
       this.setModel(ModelprodTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getModelprodsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Modelprod Modelprod = (Modelprod)Model;

       RepositoryFactory.getInstance().getModelprodsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getModelprodsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}