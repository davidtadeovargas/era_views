package com.era.views.tables;

import com.era.models.Cxp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CxpTableModel;
import java.util.List;

public class CxpTable extends BaseJTable {

   public CxpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CxpTableModel CxpTableModel = new CxpTableModel(items,this.ShowColumns);
        this.setModel(CxpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CxpTableModel CxpTableModel = (CxpTableModel)this.getModel();
       final List<Cxp> items_ = (List<Cxp>) CxpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cxp> items_ = (List<Cxp>) RepositoryFactory.getInstance().getCxpsRepository().getAll();
       final CxpTableModel CxpTableModel = new CxpTableModel(items_,this.ShowColumns);
       this.setModel(CxpTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCxpsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Cxp Cxp = (Cxp)Model;

       RepositoryFactory.getInstance().getCxpsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCxpsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}