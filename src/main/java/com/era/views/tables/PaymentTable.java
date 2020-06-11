package com.era.views.tables;

import com.era.models.Payment;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PaymentTableModel;
import java.util.List;

public class PaymentTable extends BaseJTable {

   public PaymentTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PaymentTableModel PaymentTableModel = new PaymentTableModel(items,this.ShowColumns);
        this.setModel(PaymentTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PaymentTableModel PaymentTableModel = (PaymentTableModel)this.getModel();
       final List<Payment> items_ = (List<Payment>) PaymentTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Payment> items_ = (List<Payment>) RepositoryFactory.getInstance().getPaymentsRepository().getAll();
       final PaymentTableModel PaymentTableModel = new PaymentTableModel(items_,this.ShowColumns);
       this.setModel(PaymentTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Payment> items_ = (List<Payment>) RepositoryFactory.getInstance().getPaymentsRepository().getByLikeEncabezados(search);
       final PaymentTableModel PaymentTableModel = new PaymentTableModel(items_,this.ShowColumns);
       this.setModel(PaymentTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Payment ObjectIteration_ = (Payment)ObjectIteration;
       final Payment ObjectToCompare_ = (Payment)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}