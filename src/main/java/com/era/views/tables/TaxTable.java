package com.era.views.tables;

import com.era.models.Tax;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TaxTableModel;
import java.util.List;

public class TaxTable extends BaseJTable {

   public TaxTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TaxTableModel TaxTableModel = new TaxTableModel(this,items,this.ShowColumns);
        this.setModel(TaxTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TaxTableModel TaxTableModel = (TaxTableModel)this.getModel();
       final List<Tax> items_ = (List<Tax>) TaxTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tax> items_ = (List<Tax>) RepositoryFactory.getInstance().getTaxesRepository().getAll();
       final TaxTableModel TaxTableModel = new TaxTableModel(this,items_,this.ShowColumns);
       this.setModel(TaxTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Tax> items_ = (List<Tax>) RepositoryFactory.getInstance().getTaxesRepository().getByLikeEncabezados(search);
       final TaxTableModel TaxTableModel = new TaxTableModel(this,items_,this.ShowColumns);
       this.setModel(TaxTableModel);
   }
   
   @Override
   public boolean equal(final Object ObjectIteration, final Object ObjectToCompare){
       
       //Cast the models
       final Tax ObjectIteration_ = (Tax)ObjectIteration;
       final Tax ObjectToCompare_ = (Tax)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCode().compareTo(ObjectToCompare_.getCode())==0;
   }
}