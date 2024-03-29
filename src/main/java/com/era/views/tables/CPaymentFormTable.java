package com.era.views.tables;

import com.era.models.CPaymentForm;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CPaymentFormTableModel;
import java.util.List;

public class CPaymentFormTable extends BaseJTable {

   public CPaymentFormTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CPaymentFormTableModel CPaymentFormTableModel = new CPaymentFormTableModel(this,items,this.ShowColumns);
        this.setModel(CPaymentFormTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CPaymentFormTableModel CPaymentFormTableModel = (CPaymentFormTableModel)this.getModel();
       final List<CPaymentForm> items_ = (List<CPaymentForm>) CPaymentFormTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CPaymentForm> items_ = (List<CPaymentForm>) RepositoryFactory.getInstance().getCPaymentFormsRepository().getAll();
       final CPaymentFormTableModel CPaymentFormTableModel = new CPaymentFormTableModel(this,items_,this.ShowColumns);
       this.setModel(CPaymentFormTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CPaymentForm> items_ = (List<CPaymentForm>) RepositoryFactory.getInstance().getCPaymentFormsRepository().getByLikeEncabezados(search);
       final CPaymentFormTableModel CPaymentFormTableModel = new CPaymentFormTableModel(this,items_,this.ShowColumns);
       this.setModel(CPaymentFormTableModel);
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