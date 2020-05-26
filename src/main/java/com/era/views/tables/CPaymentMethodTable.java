package com.era.views.tables;

import com.era.models.CPaymentMethod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CPaymentMethodTableModel;
import java.util.List;

public class CPaymentMethodTable extends BaseJTable {

   public CPaymentMethodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CPaymentMethodTableModel CPaymentMethodTableModel = new CPaymentMethodTableModel(items,this.ShowColumns);
        this.setModel(CPaymentMethodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CPaymentMethodTableModel CPaymentMethodTableModel = (CPaymentMethodTableModel)this.getModel();
       final List<CPaymentMethod> items_ = (List<CPaymentMethod>) CPaymentMethodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CPaymentMethod> items_ = (List<CPaymentMethod>) RepositoryFactory.getInstance().getCPaymentMethodsRepository().getAll();
       final CPaymentMethodTableModel CPaymentMethodTableModel = new CPaymentMethodTableModel(items_,this.ShowColumns);
       this.setModel(CPaymentMethodTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCPaymentMethodsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final CPaymentMethod CPaymentMethod = (CPaymentMethod)Model;

       RepositoryFactory.getInstance().getCPaymentMethodsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCPaymentMethodsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}