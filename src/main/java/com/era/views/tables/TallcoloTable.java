package com.era.views.tables;

import com.era.models.Tallcolo;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TallcoloTableModel;
import java.util.List;

public class TallcoloTable extends BaseJTable {

   public TallcoloTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TallcoloTableModel TallcoloTableModel = new TallcoloTableModel(items,this.ShowColumns);
        this.setModel(TallcoloTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TallcoloTableModel TallcoloTableModel = (TallcoloTableModel)this.getModel();
       final List<Tallcolo> items_ = (List<Tallcolo>) TallcoloTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tallcolo> items_ = (List<Tallcolo>) RepositoryFactory.getInstance().getTallcolosRepository().getAll();
       final TallcoloTableModel TallcoloTableModel = new TallcoloTableModel(items_,this.ShowColumns);
       this.setModel(TallcoloTableModel);
   }

}