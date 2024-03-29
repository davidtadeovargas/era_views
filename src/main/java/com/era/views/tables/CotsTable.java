package com.era.views.tables;

import com.era.models.Cots;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CotsTableModel;
import java.util.List;

public class CotsTable extends BaseJTable {

   public CotsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CotsTableModel CotsTableModel = new CotsTableModel(this,items,this.ShowColumns);
        this.setModel(CotsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CotsTableModel CotsTableModel = (CotsTableModel)this.getModel();
       final List<Cots> items_ = (List<Cots>) CotsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cots> items_ = (List<Cots>) RepositoryFactory.getInstance().getCotssRepository().getAll();
       final CotsTableModel CotsTableModel = new CotsTableModel(this,items_,this.ShowColumns);
       this.setModel(CotsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Cots> items_ = (List<Cots>) RepositoryFactory.getInstance().getCotssRepository().getByLikeEncabezados(search);
       final CotsTableModel CotsTableModel = new CotsTableModel(this,items_,this.ShowColumns);
       this.setModel(CotsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Cots ObjectIteration_ = (Cots)ObjectIteration;
       final Cots ObjectToCompare_ = (Cots)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}