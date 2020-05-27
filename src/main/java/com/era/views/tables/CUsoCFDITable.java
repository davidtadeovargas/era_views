package com.era.views.tables;

import com.era.models.CUsoCFDI;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CUsoCFDITableModel;
import java.util.List;

public class CUsoCFDITable extends BaseJTable {

   public CUsoCFDITable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CUsoCFDITableModel CUsoCFDITableModel = new CUsoCFDITableModel(items,this.ShowColumns);
        this.setModel(CUsoCFDITableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CUsoCFDITableModel CUsoCFDITableModel = (CUsoCFDITableModel)this.getModel();
       final List<CUsoCFDI> items_ = (List<CUsoCFDI>) CUsoCFDITableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CUsoCFDI> items_ = (List<CUsoCFDI>) RepositoryFactory.getInstance().getCUsoCFDIsRepository().getAll();
       final CUsoCFDITableModel CUsoCFDITableModel = new CUsoCFDITableModel(items_,this.ShowColumns);
       this.setModel(CUsoCFDITableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCUsoCFDIsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final CUsoCFDI CUsoCFDI = (CUsoCFDI)Model_;

       RepositoryFactory.getInstance().getCUsoCFDIsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCUsoCFDIsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}