package com.era.views.tables;

import com.era.models.Partcomprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartcomprsTableModel;
import java.util.List;

public class PartcomprsTable extends BaseJTable {

   public PartcomprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartcomprsTableModel PartcomprsTableModel = new PartcomprsTableModel(items,this.ShowColumns);
        this.setModel(PartcomprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartcomprsTableModel PartcomprsTableModel = (PartcomprsTableModel)this.getModel();
       final List<Partcomprs> items_ = (List<Partcomprs>) PartcomprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partcomprs> items_ = (List<Partcomprs>) RepositoryFactory.getInstance().getPartcomprssRepository().getAll();
       final PartcomprsTableModel PartcomprsTableModel = new PartcomprsTableModel(items_,this.ShowColumns);
       this.setModel(PartcomprsTableModel);
   }

}