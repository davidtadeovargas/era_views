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

}