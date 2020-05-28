package com.era.views.tables;

import com.era.models.BasDats;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.BasDatsTableModel;
import java.util.List;

public class BasDatsTable extends BaseJTable {

   public BasDatsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final BasDatsTableModel BasDatsTableModel = new BasDatsTableModel(items,this.ShowColumns);
        this.setModel(BasDatsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final BasDatsTableModel BasDatsTableModel = (BasDatsTableModel)this.getModel();
       final List<BasDats> items_ = (List<BasDats>) BasDatsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<BasDats> items_ = (List<BasDats>) RepositoryFactory.getInstance().getBasDatssRepository().getAll();
       final BasDatsTableModel BasDatsTableModel = new BasDatsTableModel(items_,this.ShowColumns);
       this.setModel(BasDatsTableModel);
   }

}