package com.era.views.tables;

import com.era.models.CAduana;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CAduanaTableModel;
import java.util.List;

public class CAduanaTable extends BaseJTable {

   public CAduanaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CAduanaTableModel CAduanaTableModel = new CAduanaTableModel(items,this.ShowColumns);
        this.setModel(CAduanaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CAduanaTableModel CAduanaTableModel = (CAduanaTableModel)this.getModel();
       final List<CAduana> items_ = (List<CAduana>) CAduanaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CAduana> items_ = (List<CAduana>) RepositoryFactory.getInstance().getCAduanasRepository().getAll();
       final CAduanaTableModel CAduanaTableModel = new CAduanaTableModel(items_,this.ShowColumns);
       this.setModel(CAduanaTableModel);
   }

}