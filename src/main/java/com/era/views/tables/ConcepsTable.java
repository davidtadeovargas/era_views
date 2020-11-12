package com.era.views.tables;

import com.era.models.Conceps;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConcepsTableModel;
import java.util.List;

public class ConcepsTable extends BaseJTable {

   public ConcepsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(this,items,this.ShowColumns);
        this.setModel(ConcepsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConcepsTableModel ConcepsTableModel = (ConcepsTableModel)this.getModel();
       final List<Conceps> items_ = (List<Conceps>) ConcepsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Conceps> items_ = (List<Conceps>) RepositoryFactory.getInstance().getConcepssRepository().getAll();
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(this,items_,this.ShowColumns);
       this.setModel(ConcepsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Conceps> items_ = (List<Conceps>) RepositoryFactory.getInstance().getConcepssRepository().getByLikeEncabezados(search);
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(this,items_,this.ShowColumns);
       this.setModel(ConcepsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Conceps ObjectIteration_ = (Conceps)ObjectIteration;
       final Conceps ObjectToCompare_ = (Conceps)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}