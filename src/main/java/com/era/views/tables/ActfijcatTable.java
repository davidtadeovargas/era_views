package com.era.views.tables;

import com.era.models.Actfijcat;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ActfijcatTableModel;
import java.util.List;

public class ActfijcatTable extends BaseJTable {

   public ActfijcatTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ActfijcatTableModel ActfijcatTableModel = new ActfijcatTableModel(items,this.ShowColumns);
        this.setModel(ActfijcatTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ActfijcatTableModel ActfijcatTableModel = (ActfijcatTableModel)this.getModel();
       final List<Actfijcat> items_ = (List<Actfijcat>) ActfijcatTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Actfijcat> items_ = (List<Actfijcat>) RepositoryFactory.getInstance().getActfijcatsRepository().getAll();
       final ActfijcatTableModel ActfijcatTableModel = new ActfijcatTableModel(items_,this.ShowColumns);
       this.setModel(ActfijcatTableModel);
   }

}