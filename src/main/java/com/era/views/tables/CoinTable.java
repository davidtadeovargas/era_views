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
       final CoinTableModel CoinTableModel = new CoinTableModel(this,items,this.ShowColumns);
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
       final CoinTableModel CoinTableModel = new CoinTableModel(this,items_,this.ShowColumns);
       this.setModel(CoinTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Coin> items_ = (List<Coin>) RepositoryFactory.getInstance().getCoinsRepository().getByLikeEncabezados(search);
       final CoinTableModel CoinTableModel = new CoinTableModel(this,items_,this.ShowColumns);
       this.setModel(CoinTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Coin ObjectIteration_ = (Coin)ObjectIteration;
       final Coin ObjectToCompare_ = (Coin)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}