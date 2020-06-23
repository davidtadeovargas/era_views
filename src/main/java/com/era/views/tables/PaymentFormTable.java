package com.era.views.tables;

import com.era.models.CPaymentForm;
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
       final List<CPaymentForm> items_ = (List<CPaymentForm>) PaymentFormTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CPaymentForm> items_ = (List<CPaymentForm>) RepositoryFactory.getInstance().getPaymentFormsRepository().getAll();
       final PaymentFormTableModel PaymentFormTableModel = new PaymentFormTableModel(items_,this.ShowColumns);
       this.setModel(PaymentFormTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CPaymentForm> items_ = (List<CPaymentForm>) RepositoryFactory.getInstance().getPaymentFormsRepository().getByLikeEncabezados(search);
       final PaymentFormTableModel PaymentFormTableModel = new PaymentFormTableModel(items_,this.ShowColumns);
       this.setModel(PaymentFormTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final CPaymentForm ObjectIteration_ = (CPaymentForm)ObjectIteration;
       final CPaymentForm ObjectToCompare_ = (CPaymentForm)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}