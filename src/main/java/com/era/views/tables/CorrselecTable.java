package com.era.views.tables;

import com.era.models.Corrselec;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CorrselecTableModel;
import java.util.List;

public class CorrselecTable extends BaseJTable {

   public CorrselecTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CorrselecTableModel CorrselecTableModel = new CorrselecTableModel(items,this.ShowColumns);
        this.setModel(CorrselecTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CorrselecTableModel CorrselecTableModel = (CorrselecTableModel)this.getModel();
       final List<Corrselec> items_ = (List<Corrselec>) CorrselecTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Corrselec> items_ = (List<Corrselec>) RepositoryFactory.getInstance().getCorrselecsRepository().getAll();
       final CorrselecTableModel CorrselecTableModel = new CorrselecTableModel(items_,this.ShowColumns);
       this.setModel(CorrselecTableModel);
   }

}