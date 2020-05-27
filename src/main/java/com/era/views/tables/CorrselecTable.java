package com.era.views.tables;

import com.era.models.Corrselec;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CorrselecTableModel;
import java.util.List;

public class CorrselecTable extends BaseJTable {

   public CorrselecTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CorrselecTableModel CorrselecTableModel = new CorrselecTableModel(items,this.ShowColumns);
        this.setModel(CorrselecTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CorrselecTableModel CorrselecTableModel = (CorrselecTableModel)this.getModel();
       final List<Corrselec> items_ = (List<Corrselec>) CorrselecTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Corrselec> items_ = (List<Corrselec>) RepositoryFactory.getInstance().getCorrselecsRepository().getAll();
       final CorrselecTableModel CorrselecTableModel = new CorrselecTableModel(items_,this.ShowColumns);
       this.setModel(CorrselecTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCorrselecsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Corrselec Corrselec = (Corrselec)Model_;

       RepositoryFactory.getInstance().getCorrselecsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCorrselecsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}