package com.era.views.tables;

import com.era.models.Maxminconf;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MaxminconfTableModel;
import java.util.List;

public class MaxminconfTable extends BaseJTable {

   public MaxminconfTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MaxminconfTableModel MaxminconfTableModel = new MaxminconfTableModel(items,this.ShowColumns);
        this.setModel(MaxminconfTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MaxminconfTableModel MaxminconfTableModel = (MaxminconfTableModel)this.getModel();
       final List<Maxminconf> items_ = (List<Maxminconf>) MaxminconfTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Maxminconf> items_ = (List<Maxminconf>) RepositoryFactory.getInstance().getMaxminconfsRepository().getAll();
       final MaxminconfTableModel MaxminconfTableModel = new MaxminconfTableModel(items_,this.ShowColumns);
       this.setModel(MaxminconfTableModel);
   }

}