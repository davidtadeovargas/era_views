package com.era.views.tables;

import com.era.models.PaymentForm;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PaymentFormTableModel;
import java.util.List;

public class PaymentFormTable extends BaseJTable {

   public PaymentFormTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PaymentFormTableModel PaymentFormTableModel = new PaymentFormTableModel(items,this.ShowColumns);
        this.setModel(PaymentFormTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PaymentFormTableModel PaymentFormTableModel = (PaymentFormTableModel)this.getModel();
       final List<PaymentForm> items_ = (List<PaymentForm>) PaymentFormTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PaymentForm> items_ = (List<PaymentForm>) RepositoryFactory.getInstance().getPaymentFormsRepository().getAll();
       final PaymentFormTableModel PaymentFormTableModel = new PaymentFormTableModel(items_,this.ShowColumns);
       this.setModel(PaymentFormTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPaymentFormsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final PaymentForm PaymentForm = (PaymentForm)Model_;

       RepositoryFactory.getInstance().getPaymentFormsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPaymentFormsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}