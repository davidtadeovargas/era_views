package com.era.views.tables;

import com.era.models.CClaveprodserv;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CClaveprodservTableModel;
import java.util.List;

public class CClaveprodservTable extends BaseJTable {

   public CClaveprodservTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CClaveprodservTableModel CClaveprodservTableModel = new CClaveprodservTableModel(items,this.ShowColumns);
        this.setModel(CClaveprodservTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CClaveprodservTableModel CClaveprodservTableModel = (CClaveprodservTableModel)this.getModel();
       final List<CClaveprodserv> items_ = (List<CClaveprodserv>) CClaveprodservTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CClaveprodserv> items_ = (List<CClaveprodserv>) RepositoryFactory.getInstance().getCClaveprodservsRepository().getAll();
       final CClaveprodservTableModel CClaveprodservTableModel = new CClaveprodservTableModel(items_,this.ShowColumns);
       this.setModel(CClaveprodservTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCClaveprodservsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final CClaveprodserv CClaveprodserv = (CClaveprodserv)Model;

       RepositoryFactory.getInstance().getCClaveprodservsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCClaveprodservsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}