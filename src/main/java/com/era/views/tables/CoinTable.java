package com.era.views.tables;

import com.era.models.Coin;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CoinTableModel;
import java.util.List;

public class CoinTable extends BaseJTable {

   public CoinTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CoinTableModel CoinTableModel = new CoinTableModel(items,this.ShowColumns);
        this.setModel(CoinTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CoinTableModel CoinTableModel = (CoinTableModel)this.getModel();
       final List<Coin> items_ = (List<Coin>) CoinTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Coin> items_ = (List<Coin>) RepositoryFactory.getInstance().getCoinsRepository().getAll();
       final CoinTableModel CoinTableModel = new CoinTableModel(items_,this.ShowColumns);
       this.setModel(CoinTableModel);
   }

}