package com.era.views.tables;

import com.era.models.Prevcomprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PrevcomprsTableModel;
import java.util.List;

public class PrevcomprsTable extends BaseJTable {

   public PrevcomprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PrevcomprsTableModel PrevcomprsTableModel = new PrevcomprsTableModel(items,this.ShowColumns);
        this.setModel(PrevcomprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PrevcomprsTableModel PrevcomprsTableModel = (PrevcomprsTableModel)this.getModel();
       final List<Prevcomprs> items_ = (List<Prevcomprs>) PrevcomprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Prevcomprs> items_ = (List<Prevcomprs>) RepositoryFactory.getInstance().getPrevcomprssRepository().getAll();
       final PrevcomprsTableModel PrevcomprsTableModel = new PrevcomprsTableModel(items_,this.ShowColumns);
       this.setModel(PrevcomprsTableModel);
   }

}