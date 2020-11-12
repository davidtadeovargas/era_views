package com.era.views.tables;

import com.era.models.Coin;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CCoinTableModel;
import java.util.List;

public class CCoinTable extends BaseJTable {

   public CCoinTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(this,items,this.ShowColumns);
        this.setModel(CCoinTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CCoinTableModel CCoinTableModel = (CCoinTableModel)this.getModel();
       final List<Coin> items_ = (List<Coin>) CCoinTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Coin> items_ = (List<Coin>) RepositoryFactory.getInstance().getCoinsRepository().getAll();
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(this,items_,this.ShowColumns);
       this.setModel(CCoinTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Coin> items_ = (List<Coin>) RepositoryFactory.getInstance().getCoinsRepository().getByLikeEncabezados(search);
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(this,items_,this.ShowColumns);
       this.setModel(CCoinTableModel);
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