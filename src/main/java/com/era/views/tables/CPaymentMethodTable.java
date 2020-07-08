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
       final CPaymentMethodTableModel CPaymentMethodTableModel = new CPaymentMethodTableModel(this,items,this.ShowColumns);
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
       final CPaymentMethodTableModel CPaymentMethodTableModel = new CPaymentMethodTableModel(this,items_,this.ShowColumns);
       this.setModel(CPaymentMethodTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CPaymentMethod> items_ = (List<CPaymentMethod>) RepositoryFactory.getInstance().getCPaymentMethodsRepository().getByLikeEncabezados(search);
       final CPaymentMethodTableModel CPaymentMethodTableModel = new CPaymentMethodTableModel(this,items_,this.ShowColumns);
       this.setModel(CPaymentMethodTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final CPaymentMethod ObjectIteration_ = (CPaymentMethod)ObjectIteration;
       final CPaymentMethod ObjectToCompare_ = (CPaymentMethod)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}