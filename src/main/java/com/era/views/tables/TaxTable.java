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

}