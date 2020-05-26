package com.era.views.tables;

import com.era.models.Banco;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.BancoTableModel;
import java.util.List;

public class BancoTable extends BaseJTable {

   public BancoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final BancoTableModel BancoTableModel = new BancoTableModel(items,this.ShowColumns);
        this.setModel(BancoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final BancoTableModel BancoTableModel = (BancoTableModel)this.getModel();
       final List<Banco> items_ = (List<Banco>) BancoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Banco> items_ = (List<Banco>) RepositoryFactory.getInstance().getBancosRepository().getAll();
       final BancoTableModel BancoTableModel = new BancoTableModel(items_,this.ShowColumns);
       this.setModel(BancoTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getBancosRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Banco Banco = (Banco)Model;

       RepositoryFactory.getInstance().getBancosRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getBancosRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}