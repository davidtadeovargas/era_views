package com.era.views.tables;

import com.era.models.Traspas;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TraspasTableModel;
import java.util.List;

public class TraspasTable extends BaseJTable {

   public TraspasTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TraspasTableModel TraspasTableModel = new TraspasTableModel(items,this.ShowColumns);
        this.setModel(TraspasTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TraspasTableModel TraspasTableModel = (TraspasTableModel)this.getModel();
       final List<Traspas> items_ = (List<Traspas>) TraspasTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Traspas> items_ = (List<Traspas>) RepositoryFactory.getInstance().getTraspassRepository().getAll();
       final TraspasTableModel TraspasTableModel = new TraspasTableModel(items_,this.ShowColumns);
       this.setModel(TraspasTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Traspas> items_ = (List<Traspas>) RepositoryFactory.getInstance().getTraspassRepository().getByLikeEncabezados(search);
       final TraspasTableModel TraspasTableModel = new TraspasTableModel(items_,this.ShowColumns);
       this.setModel(TraspasTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Traspas ObjectIteration_ = (Traspas)ObjectIteration;
       final Traspas ObjectToCompare_ = (Traspas)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCode().compareTo(ObjectToCompare_.getCode())==0;
    }
}