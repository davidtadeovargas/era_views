package com.era.views.tables;

import com.era.models.Anaqs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AnaqsTableModel;
import java.util.List;

public class AnaqsTable extends BaseJTable {

   public AnaqsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AnaqsTableModel AnaqsTableModel = new AnaqsTableModel(items,this.ShowColumns);
        this.setModel(AnaqsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AnaqsTableModel AnaqsTableModel = (AnaqsTableModel)this.getModel();
       final List<Anaqs> items_ = (List<Anaqs>) AnaqsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Anaqs> items_ = (List<Anaqs>) RepositoryFactory.getInstance().getAnaqssRepository().getAll();
       final AnaqsTableModel AnaqsTableModel = new AnaqsTableModel(items_,this.ShowColumns);
       this.setModel(AnaqsTableModel);
   }

}