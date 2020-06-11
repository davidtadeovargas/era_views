package com.era.views.tables;

import com.era.models.Fabs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.FabsTableModel;
import java.util.List;

public class FabsTable extends BaseJTable {

   public FabsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final FabsTableModel FabsTableModel = new FabsTableModel(items,this.ShowColumns);
        this.setModel(FabsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final FabsTableModel FabsTableModel = (FabsTableModel)this.getModel();
       final List<Fabs> items_ = (List<Fabs>) FabsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Fabs> items_ = (List<Fabs>) RepositoryFactory.getInstance().getFabssRepository().getAll();
       final FabsTableModel FabsTableModel = new FabsTableModel(items_,this.ShowColumns);
       this.setModel(FabsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Fabs> items_ = (List<Fabs>) RepositoryFactory.getInstance().getFabssRepository().getByLikeEncabezados(search);
       final FabsTableModel FabsTableModel = new FabsTableModel(items_,this.ShowColumns);
       this.setModel(FabsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Fabs ObjectIteration_ = (Fabs)ObjectIteration;
       final Fabs ObjectToCompare_ = (Fabs)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}