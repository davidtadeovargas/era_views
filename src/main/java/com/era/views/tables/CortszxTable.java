package com.era.views.tables;

import com.era.models.Cortszx;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CortszxTableModel;
import java.util.List;

public class CortszxTable extends BaseJTable {

   public CortszxTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CortszxTableModel CortszxTableModel = new CortszxTableModel(items,this.ShowColumns);
        this.setModel(CortszxTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CortszxTableModel CortszxTableModel = (CortszxTableModel)this.getModel();
       final List<Cortszx> items_ = (List<Cortszx>) CortszxTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cortszx> items_ = (List<Cortszx>) RepositoryFactory.getInstance().getCortszxsRepository().getAll();
       final CortszxTableModel CortszxTableModel = new CortszxTableModel(items_,this.ShowColumns);
       this.setModel(CortszxTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCortszxsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Cortszx Cortszx = (Cortszx)Model;

       RepositoryFactory.getInstance().getCortszxsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCortszxsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}