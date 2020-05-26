package com.era.views.tables;

import com.era.models.Partprevcomprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartprevcomprsTableModel;
import java.util.List;

public class PartprevcomprsTable extends BaseJTable {

   public PartprevcomprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartprevcomprsTableModel PartprevcomprsTableModel = new PartprevcomprsTableModel(items,this.ShowColumns);
        this.setModel(PartprevcomprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartprevcomprsTableModel PartprevcomprsTableModel = (PartprevcomprsTableModel)this.getModel();
       final List<Partprevcomprs> items_ = (List<Partprevcomprs>) PartprevcomprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partprevcomprs> items_ = (List<Partprevcomprs>) RepositoryFactory.getInstance().getPartprevcomprssRepository().getAll();
       final PartprevcomprsTableModel PartprevcomprsTableModel = new PartprevcomprsTableModel(items_,this.ShowColumns);
       this.setModel(PartprevcomprsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPartprevcomprssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Partprevcomprs Partprevcomprs = (Partprevcomprs)Model;

       RepositoryFactory.getInstance().getPartprevcomprssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPartprevcomprssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}