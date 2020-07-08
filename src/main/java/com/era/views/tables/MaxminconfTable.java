package com.era.views.tables;

import com.era.models.Maxminconf;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MaxminconfTableModel;
import java.util.List;

public class MaxminconfTable extends BaseJTable {

   public MaxminconfTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MaxminconfTableModel MaxminconfTableModel = new MaxminconfTableModel(this,items,this.ShowColumns);
        this.setModel(MaxminconfTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MaxminconfTableModel MaxminconfTableModel = (MaxminconfTableModel)this.getModel();
       final List<Maxminconf> items_ = (List<Maxminconf>) MaxminconfTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Maxminconf> items_ = (List<Maxminconf>) RepositoryFactory.getInstance().getMaxminconfsRepository().getAll();
       final MaxminconfTableModel MaxminconfTableModel = new MaxminconfTableModel(this,items_,this.ShowColumns);
       this.setModel(MaxminconfTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Maxminconf> items_ = (List<Maxminconf>) RepositoryFactory.getInstance().getMaxminconfsRepository().getByLikeEncabezados(search);
       final MaxminconfTableModel MaxminconfTableModel = new MaxminconfTableModel(this,items_,this.ShowColumns);
       this.setModel(MaxminconfTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Maxminconf ObjectIteration_ = (Maxminconf)ObjectIteration;
       final Maxminconf ObjectToCompare_ = (Maxminconf)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}