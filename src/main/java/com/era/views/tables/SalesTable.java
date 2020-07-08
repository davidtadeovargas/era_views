package com.era.views.tables;

import com.era.models.Sales;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SalesTableModel;
import java.util.List;

public class SalesTable extends BaseJTable {

   public SalesTable(){
       super(RepositoryFactory.getInstance().getSalessRepository());
    }

   @Override
   public void initTable(List<?> items) {
       final SalesTableModel SalesTableModel = new SalesTableModel(this,items,this.ShowColumns);
        this.setModel(SalesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SalesTableModel SalesTableModel = (SalesTableModel)this.getModel();
       final List<Sales> items_ = (List<Sales>) SalesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Sales> items_ = (List<Sales>) RepositoryFactory.getInstance().getSalessRepository().getAll();
       final SalesTableModel SalesTableModel = new SalesTableModel(this,items_,this.ShowColumns);
       this.setModel(SalesTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Sales> items_ = (List<Sales>) RepositoryFactory.getInstance().getSalessRepository().getByLikeEncabezados(search);
       final SalesTableModel SalesTableModel = new SalesTableModel(this,items_,this.ShowColumns);
       this.setModel(SalesTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Sales ObjectIteration_ = (Sales)ObjectIteration;
       final Sales ObjectToCompare_ = (Sales)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}