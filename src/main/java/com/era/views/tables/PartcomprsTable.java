package com.era.views.tables;

import com.era.models.Partcomprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartcomprsTableModel;
import java.util.List;

public class PartcomprsTable extends BaseJTable {

   public PartcomprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartcomprsTableModel PartcomprsTableModel = new PartcomprsTableModel(items,this.ShowColumns);
        this.setModel(PartcomprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartcomprsTableModel PartcomprsTableModel = (PartcomprsTableModel)this.getModel();
       final List<Partcomprs> items_ = (List<Partcomprs>) PartcomprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partcomprs> items_ = (List<Partcomprs>) RepositoryFactory.getInstance().getPartcomprssRepository().getAll();
       final PartcomprsTableModel PartcomprsTableModel = new PartcomprsTableModel(items_,this.ShowColumns);
       this.setModel(PartcomprsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPartcomprssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Partcomprs Partcomprs = (Partcomprs)Model;

       RepositoryFactory.getInstance().getPartcomprssRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPartcomprssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}