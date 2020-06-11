package com.era.views.tables;

import com.era.models.Garan;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.GaranTableModel;
import java.util.List;

public class GaranTable extends BaseJTable {

   public GaranTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final GaranTableModel GaranTableModel = new GaranTableModel(items,this.ShowColumns);
        this.setModel(GaranTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final GaranTableModel GaranTableModel = (GaranTableModel)this.getModel();
       final List<Garan> items_ = (List<Garan>) GaranTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Garan> items_ = (List<Garan>) RepositoryFactory.getInstance().getGaransRepository().getAll();
       final GaranTableModel GaranTableModel = new GaranTableModel(items_,this.ShowColumns);
       this.setModel(GaranTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Garan> items_ = (List<Garan>) RepositoryFactory.getInstance().getGaransRepository().getByLikeEncabezados(search);
       final GaranTableModel GaranTableModel = new GaranTableModel(items_,this.ShowColumns);
       this.setModel(GaranTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Garan ObjectIteration_ = (Garan)ObjectIteration;
       final Garan ObjectToCompare_ = (Garan)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}