package com.era.views.tables;

import com.era.models.Fluj;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.FlujTableModel;
import java.util.List;

public class FlujTable extends BaseJTable {

   public FlujTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final FlujTableModel FlujTableModel = new FlujTableModel(items,this.ShowColumns);
        this.setModel(FlujTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final FlujTableModel FlujTableModel = (FlujTableModel)this.getModel();
       final List<Fluj> items_ = (List<Fluj>) FlujTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Fluj> items_ = (List<Fluj>) RepositoryFactory.getInstance().getFlujsRepository().getAll();
       final FlujTableModel FlujTableModel = new FlujTableModel(items_,this.ShowColumns);
       this.setModel(FlujTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Fluj> items_ = (List<Fluj>) RepositoryFactory.getInstance().getFlujsRepository().getByLikeEncabezados(search);
       final FlujTableModel FlujTableModel = new FlujTableModel(items_,this.ShowColumns);
       this.setModel(FlujTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Fluj ObjectIteration_ = (Fluj)ObjectIteration;
       final Fluj ObjectToCompare_ = (Fluj)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}