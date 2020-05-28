package com.era.views.tables;

import com.era.models.Actfij;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ActfijTableModel;
import java.util.List;

public class ActfijTable extends BaseJTable {

   public ActfijTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ActfijTableModel ActfijTableModel = new ActfijTableModel(items,this.ShowColumns);
        this.setModel(ActfijTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ActfijTableModel ActfijTableModel = (ActfijTableModel)this.getModel();
       final List<Actfij> items_ = (List<Actfij>) ActfijTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Actfij> items_ = (List<Actfij>) RepositoryFactory.getInstance().getActfijsRepository().getAll();
       final ActfijTableModel ActfijTableModel = new ActfijTableModel(items_,this.ShowColumns);
       this.setModel(ActfijTableModel);
   }

}