package com.era.views.tables;

import com.era.models.Tipactfij;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TipactfijTableModel;
import java.util.List;

public class TipactfijTable extends BaseJTable {

   public TipactfijTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TipactfijTableModel TipactfijTableModel = new TipactfijTableModel(this,items,this.ShowColumns);
        this.setModel(TipactfijTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TipactfijTableModel TipactfijTableModel = (TipactfijTableModel)this.getModel();
       final List<Tipactfij> items_ = (List<Tipactfij>) TipactfijTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tipactfij> items_ = (List<Tipactfij>) RepositoryFactory.getInstance().getTipactfijsRepository().getAll();
       final TipactfijTableModel TipactfijTableModel = new TipactfijTableModel(this,items_,this.ShowColumns);
       this.setModel(TipactfijTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Tipactfij> items_ = (List<Tipactfij>) RepositoryFactory.getInstance().getTipactfijsRepository().getByLikeEncabezados(search);
       final TipactfijTableModel TipactfijTableModel = new TipactfijTableModel(this,items_,this.ShowColumns);
       this.setModel(TipactfijTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Tipactfij ObjectIteration_ = (Tipactfij)ObjectIteration;
       final Tipactfij ObjectToCompare_ = (Tipactfij)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCode().compareTo(ObjectToCompare_.getCode())==0;
    }
}