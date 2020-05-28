package com.era.views.tables;

import com.era.models.Cortes;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CortesTableModel;
import java.util.List;

public class CortesTable extends BaseJTable {

   public CortesTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CortesTableModel CortesTableModel = new CortesTableModel(items,this.ShowColumns);
        this.setModel(CortesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CortesTableModel CortesTableModel = (CortesTableModel)this.getModel();
       final List<Cortes> items_ = (List<Cortes>) CortesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cortes> items_ = (List<Cortes>) RepositoryFactory.getInstance().getCortessRepository().getAll();
       final CortesTableModel CortesTableModel = new CortesTableModel(items_,this.ShowColumns);
       this.setModel(CortesTableModel);
   }

}