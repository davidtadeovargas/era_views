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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<PaymentForm> items_ = (List<PaymentForm>) RepositoryFactory.getInstance().getPaymentFormsRepository().getByLikeEncabezados(search);
       final PaymentFormTableModel PaymentFormTableModel = new PaymentFormTableModel(items_,this.ShowColumns);
       this.setModel(PaymentFormTableModel);
   }

}