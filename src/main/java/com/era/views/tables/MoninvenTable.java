package com.era.views.tables;

import com.era.models.Moninven;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MoninvenTableModel;
import java.util.List;

public class MoninvenTable extends BaseJTable {

   public MoninvenTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MoninvenTableModel MoninvenTableModel = new MoninvenTableModel(items,this.ShowColumns);
        this.setModel(MoninvenTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MoninvenTableModel MoninvenTableModel = (MoninvenTableModel)this.getModel();
       final List<Moninven> items_ = (List<Moninven>) MoninvenTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Moninven> items_ = (List<Moninven>) RepositoryFactory.getInstance().getMoninvensRepository().getAll();
       final MoninvenTableModel MoninvenTableModel = new MoninvenTableModel(items_,this.ShowColumns);
       this.setModel(MoninvenTableModel);
   }

}