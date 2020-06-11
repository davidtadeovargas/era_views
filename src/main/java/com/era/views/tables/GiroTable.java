package com.era.views.tables;

import com.era.models.Giro;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.GiroTableModel;
import java.util.List;

public class GiroTable extends BaseJTable {

   public GiroTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final GiroTableModel GiroTableModel = new GiroTableModel(items,this.ShowColumns);
        this.setModel(GiroTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final GiroTableModel GiroTableModel = (GiroTableModel)this.getModel();
       final List<Giro> items_ = (List<Giro>) GiroTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Giro> items_ = (List<Giro>) RepositoryFactory.getInstance().getGirosRepository().getAll();
       final GiroTableModel GiroTableModel = new GiroTableModel(items_,this.ShowColumns);
       this.setModel(GiroTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Giro> items_ = (List<Giro>) RepositoryFactory.getInstance().getGirosRepository().getByLikeEncabezados(search);
       final GiroTableModel GiroTableModel = new GiroTableModel(items_,this.ShowColumns);
       this.setModel(GiroTableModel);
   }

    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Giro ObjectIteration_ = (Giro)ObjectIteration;
       final Giro ObjectToCompare_ = (Giro)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}