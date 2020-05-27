package com.era.views.tables;

import com.era.models.Partcot;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartcotTableModel;
import java.util.List;

public class PartcotTable extends BaseJTable {

   public PartcotTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartcotTableModel PartcotTableModel = new PartcotTableModel(items,this.ShowColumns);
        this.setModel(PartcotTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartcotTableModel PartcotTableModel = (PartcotTableModel)this.getModel();
       final List<Partcot> items_ = (List<Partcot>) PartcotTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partcot> items_ = (List<Partcot>) RepositoryFactory.getInstance().getPartcotsRepository().getAll();
       final PartcotTableModel PartcotTableModel = new PartcotTableModel(items_,this.ShowColumns);
       this.setModel(PartcotTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPartcotsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Partcot Partcot = (Partcot)Model_;

       RepositoryFactory.getInstance().getPartcotsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPartcotsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}