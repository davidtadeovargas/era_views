package com.era.views.tables;

import com.era.models.Tars;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TarsTableModel;
import java.util.List;

public class TarsTable extends BaseJTable {

   public TarsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TarsTableModel TarsTableModel = new TarsTableModel(this,items,this.ShowColumns);
        this.setModel(TarsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TarsTableModel TarsTableModel = (TarsTableModel)this.getModel();
       final List<Tars> items_ = (List<Tars>) TarsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tars> items_ = (List<Tars>) RepositoryFactory.getInstance().getTarssRepository().getAll();
       final TarsTableModel TarsTableModel = new TarsTableModel(this,items_,this.ShowColumns);
       this.setModel(TarsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Tars> items_ = (List<Tars>) RepositoryFactory.getInstance().getTarssRepository().getByLikeEncabezados(search);
       final TarsTableModel TarsTableModel = new TarsTableModel(this,items_,this.ShowColumns);
       this.setModel(TarsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Tars ObjectIteration_ = (Tars)ObjectIteration;
       final Tars ObjectToCompare_ = (Tars)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getTar() == ObjectToCompare_.getTar();
    }
}