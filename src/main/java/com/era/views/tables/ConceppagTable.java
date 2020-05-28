package com.era.views.tables;

import com.era.models.Conceppag;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConceppagTableModel;
import java.util.List;

public class ConceppagTable extends BaseJTable {

   public ConceppagTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConceppagTableModel ConceppagTableModel = new ConceppagTableModel(items,this.ShowColumns);
        this.setModel(ConceppagTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConceppagTableModel ConceppagTableModel = (ConceppagTableModel)this.getModel();
       final List<Conceppag> items_ = (List<Conceppag>) ConceppagTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Conceppag> items_ = (List<Conceppag>) RepositoryFactory.getInstance().getConceppagsRepository().getAll();
       final ConceppagTableModel ConceppagTableModel = new ConceppagTableModel(items_,this.ShowColumns);
       this.setModel(ConceppagTableModel);
   }

}