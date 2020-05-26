package com.era.views.tables;

import com.era.models.Unid;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UnidTableModel;
import java.util.List;

public class UnidTable extends BaseJTable {

   public UnidTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final UnidTableModel UnidTableModel = new UnidTableModel(items,this.ShowColumns);
        this.setModel(UnidTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final UnidTableModel UnidTableModel = (UnidTableModel)this.getModel();
       final List<Unid> items_ = (List<Unid>) UnidTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Unid> items_ = (List<Unid>) RepositoryFactory.getInstance().getUnidsRepository().getAll();
       final UnidTableModel UnidTableModel = new UnidTableModel(items_,this.ShowColumns);
       this.setModel(UnidTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getUnidsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Unid Unid = (Unid)Model;

       RepositoryFactory.getInstance().getUnidsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getUnidsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}