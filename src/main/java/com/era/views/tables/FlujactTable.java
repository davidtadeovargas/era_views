package com.era.views.tables;

import com.era.models.Flujact;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.FlujactTableModel;
import java.util.List;

public class FlujactTable extends BaseJTable {

   public FlujactTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final FlujactTableModel FlujactTableModel = new FlujactTableModel(this,items,this.ShowColumns);
        this.setModel(FlujactTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final FlujactTableModel FlujactTableModel = (FlujactTableModel)this.getModel();
       final List<Flujact> items_ = (List<Flujact>) FlujactTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Flujact> items_ = (List<Flujact>) RepositoryFactory.getInstance().getFlujactsRepository().getAll();
       final FlujactTableModel FlujactTableModel = new FlujactTableModel(this,items_,this.ShowColumns);
       this.setModel(FlujactTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Flujact> items_ = (List<Flujact>) RepositoryFactory.getInstance().getFlujactsRepository().getByLikeEncabezados(search);
       final FlujactTableModel FlujactTableModel = new FlujactTableModel(this,items_,this.ShowColumns);
       this.setModel(FlujactTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Flujact ObjectIteration_ = (Flujact)ObjectIteration;
       final Flujact ObjectToCompare_ = (Flujact)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}