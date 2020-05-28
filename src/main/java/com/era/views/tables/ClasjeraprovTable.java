package com.era.views.tables;

import com.era.models.Clasjeraprov;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasjeraprovTableModel;
import java.util.List;

public class ClasjeraprovTable extends BaseJTable {

   public ClasjeraprovTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasjeraprovTableModel ClasjeraprovTableModel = new ClasjeraprovTableModel(items,this.ShowColumns);
        this.setModel(ClasjeraprovTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasjeraprovTableModel ClasjeraprovTableModel = (ClasjeraprovTableModel)this.getModel();
       final List<Clasjeraprov> items_ = (List<Clasjeraprov>) ClasjeraprovTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasjeraprov> items_ = (List<Clasjeraprov>) RepositoryFactory.getInstance().getClasjeraprovsRepository().getAll();
       final ClasjeraprovTableModel ClasjeraprovTableModel = new ClasjeraprovTableModel(items_,this.ShowColumns);
       this.setModel(ClasjeraprovTableModel);
   }

}