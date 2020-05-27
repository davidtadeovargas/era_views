package com.era.views.tables;

import com.era.models.Msjs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MsjsTableModel;
import java.util.List;

public class MsjsTable extends BaseJTable {

   public MsjsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MsjsTableModel MsjsTableModel = new MsjsTableModel(items,this.ShowColumns);
        this.setModel(MsjsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MsjsTableModel MsjsTableModel = (MsjsTableModel)this.getModel();
       final List<Msjs> items_ = (List<Msjs>) MsjsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Msjs> items_ = (List<Msjs>) RepositoryFactory.getInstance().getMsjssRepository().getAll();
       final MsjsTableModel MsjsTableModel = new MsjsTableModel(items_,this.ShowColumns);
       this.setModel(MsjsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getMsjssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Msjs Msjs = (Msjs)Model_;

       RepositoryFactory.getInstance().getMsjssRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getMsjssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}