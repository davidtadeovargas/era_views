package com.era.views.tables;

import com.era.models.Tax;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TaxTableModel;
import java.util.List;

public class TaxTable extends BaseJTable {

   public TaxTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TaxTableModel TaxTableModel = new TaxTableModel(items,this.ShowColumns);
        this.setModel(TaxTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TaxTableModel TaxTableModel = (TaxTableModel)this.getModel();
       final List<Tax> items_ = (List<Tax>) TaxTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tax> items_ = (List<Tax>) RepositoryFactory.getInstance().getTaxsRepository().getAll();
       final TaxTableModel TaxTableModel = new TaxTableModel(items_,this.ShowColumns);
       this.setModel(TaxTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTaxsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Tax Tax = (Tax)Model;

       RepositoryFactory.getInstance().getTaxsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTaxsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}