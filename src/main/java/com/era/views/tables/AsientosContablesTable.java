package com.era.views.tables;

import com.era.models.AsientosContables;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AsientosContablesTableModel;
import java.util.List;

public class AsientosContablesTable extends BaseJTable {

   public AsientosContablesTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AsientosContablesTableModel AsientosContablesTableModel = new AsientosContablesTableModel(this,items,this.ShowColumns);
        this.setModel(AsientosContablesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AsientosContablesTableModel AsientosContablesTableModel = (AsientosContablesTableModel)this.getModel();
       final List<AsientosContables> items_ = (List<AsientosContables>) AsientosContablesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<AsientosContables> items_ = (List<AsientosContables>) RepositoryFactory.getInstance().getAsientosContablessRepository().getAll();
       final AsientosContablesTableModel AsientosContablesTableModel = new AsientosContablesTableModel(this,items_,this.ShowColumns);
       this.setModel(AsientosContablesTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<AsientosContables> items_ = (List<AsientosContables>) RepositoryFactory.getInstance().getAsientosContablessRepository().getByLikeEncabezados(search);
       final AsientosContablesTableModel AsientosContablesTableModel = new AsientosContablesTableModel(this,items_,this.ShowColumns);
       this.setModel(AsientosContablesTableModel);
   }

   @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final AsientosContables ObjectIteration_ = (AsientosContables)ObjectIteration;
       final AsientosContables ObjectToCompare_ = (AsientosContables)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}