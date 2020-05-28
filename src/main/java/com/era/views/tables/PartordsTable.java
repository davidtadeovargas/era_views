package com.era.views.tables;

import com.era.models.Partords;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartordsTableModel;
import java.util.List;

public class PartordsTable extends BaseJTable {

   public PartordsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartordsTableModel PartordsTableModel = new PartordsTableModel(items,this.ShowColumns);
        this.setModel(PartordsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartordsTableModel PartordsTableModel = (PartordsTableModel)this.getModel();
       final List<Partords> items_ = (List<Partords>) PartordsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partords> items_ = (List<Partords>) RepositoryFactory.getInstance().getPartordssRepository().getAll();
       final PartordsTableModel PartordsTableModel = new PartordsTableModel(items_,this.ShowColumns);
       this.setModel(PartordsTableModel);
   }

}