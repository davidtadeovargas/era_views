package com.era.views.tables;

import com.era.models.Serie;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SerieTableModel;
import java.util.List;

public class SerieTable extends BaseJTable {

   public SerieTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SerieTableModel SerieTableModel = new SerieTableModel(this,items,this.ShowColumns);
        this.setModel(SerieTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SerieTableModel SerieTableModel = (SerieTableModel)this.getModel();
       final List<Serie> items_ = (List<Serie>) SerieTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Serie> items_ = (List<Serie>) RepositoryFactory.getInstance().getSeriesRepository().getAll();
       final SerieTableModel SerieTableModel = new SerieTableModel(this,items_,this.ShowColumns);
       this.setModel(SerieTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Serie> items_ = (List<Serie>) RepositoryFactory.getInstance().getSeriesRepository().getByLikeEncabezados(search);
       final SerieTableModel SerieTableModel = new SerieTableModel(this,items_,this.ShowColumns);
       this.setModel(SerieTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Serie ObjectIteration_ = (Serie)ObjectIteration;
       final Serie ObjectToCompare_ = (Serie)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCode().compareTo(ObjectToCompare_.getCode())==0;
    }
}