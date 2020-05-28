package com.era.views.tables;

import com.era.models.Ords;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.OrdsTableModel;
import java.util.List;

public class OrdsTable extends BaseJTable {

   public OrdsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final OrdsTableModel OrdsTableModel = new OrdsTableModel(items,this.ShowColumns);
        this.setModel(OrdsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final OrdsTableModel OrdsTableModel = (OrdsTableModel)this.getModel();
       final List<Ords> items_ = (List<Ords>) OrdsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Ords> items_ = (List<Ords>) RepositoryFactory.getInstance().getOrdssRepository().getAll();
       final OrdsTableModel OrdsTableModel = new OrdsTableModel(items_,this.ShowColumns);
       this.setModel(OrdsTableModel);
   }

}