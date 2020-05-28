package com.era.views.tables;

import com.era.models.Costs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CostsTableModel;
import java.util.List;

public class CostsTable extends BaseJTable {

   public CostsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CostsTableModel CostsTableModel = new CostsTableModel(items,this.ShowColumns);
        this.setModel(CostsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CostsTableModel CostsTableModel = (CostsTableModel)this.getModel();
       final List<Costs> items_ = (List<Costs>) CostsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Costs> items_ = (List<Costs>) RepositoryFactory.getInstance().getCostssRepository().getAll();
       final CostsTableModel CostsTableModel = new CostsTableModel(items_,this.ShowColumns);
       this.setModel(CostsTableModel);
   }

}