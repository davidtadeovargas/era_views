package com.era.views.tables;

import com.era.models.Clasjeraprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasjeraprodTableModel;
import java.util.List;

public class ClasjeraprodTable extends BaseJTable {

   public ClasjeraprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasjeraprodTableModel ClasjeraprodTableModel = new ClasjeraprodTableModel(items,this.ShowColumns);
        this.setModel(ClasjeraprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasjeraprodTableModel ClasjeraprodTableModel = (ClasjeraprodTableModel)this.getModel();
       final List<Clasjeraprod> items_ = (List<Clasjeraprod>) ClasjeraprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasjeraprod> items_ = (List<Clasjeraprod>) RepositoryFactory.getInstance().getClasjeraprodsRepository().getAll();
       final ClasjeraprodTableModel ClasjeraprodTableModel = new ClasjeraprodTableModel(items_,this.ShowColumns);
       this.setModel(ClasjeraprodTableModel);
   }

}