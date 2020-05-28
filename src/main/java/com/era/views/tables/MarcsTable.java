package com.era.views.tables;

import com.era.models.Marcs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MarcsTableModel;
import java.util.List;

public class MarcsTable extends BaseJTable {

   public MarcsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MarcsTableModel MarcsTableModel = new MarcsTableModel(items,this.ShowColumns);
        this.setModel(MarcsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MarcsTableModel MarcsTableModel = (MarcsTableModel)this.getModel();
       final List<Marcs> items_ = (List<Marcs>) MarcsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Marcs> items_ = (List<Marcs>) RepositoryFactory.getInstance().getMarcssRepository().getAll();
       final MarcsTableModel MarcsTableModel = new MarcsTableModel(items_,this.ShowColumns);
       this.setModel(MarcsTableModel);
   }

}