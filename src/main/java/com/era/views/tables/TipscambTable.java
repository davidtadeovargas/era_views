package com.era.views.tables;

import com.era.models.Tipscamb;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TipscambTableModel;
import java.util.List;

public class TipscambTable extends BaseJTable {

   public TipscambTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TipscambTableModel TipscambTableModel = new TipscambTableModel(items,this.ShowColumns);
        this.setModel(TipscambTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TipscambTableModel TipscambTableModel = (TipscambTableModel)this.getModel();
       final List<Tipscamb> items_ = (List<Tipscamb>) TipscambTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tipscamb> items_ = (List<Tipscamb>) RepositoryFactory.getInstance().getTipscambsRepository().getAll();
       final TipscambTableModel TipscambTableModel = new TipscambTableModel(items_,this.ShowColumns);
       this.setModel(TipscambTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTipscambsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Tipscamb Tipscamb = (Tipscamb)Model;

       RepositoryFactory.getInstance().getTipscambsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTipscambsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}