package com.era.views.tables;

import com.era.models.Responsable;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ResponsableTableModel;
import java.util.List;

public class ResponsableTable extends BaseJTable {

   public ResponsableTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ResponsableTableModel ResponsableTableModel = new ResponsableTableModel(this,items,this.ShowColumns);
        this.setModel(ResponsableTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ResponsableTableModel ResponsableTableModel = (ResponsableTableModel)this.getModel();
       final List<Responsable> items_ = (List<Responsable>) ResponsableTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Responsable> items_ = (List<Responsable>) RepositoryFactory.getInstance().getResponsablesRepository().getAll();
       final ResponsableTableModel ResponsableTableModel = new ResponsableTableModel(this,items_,this.ShowColumns);
       this.setModel(ResponsableTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Responsable> items_ = (List<Responsable>) RepositoryFactory.getInstance().getResponsablesRepository().getByLikeEncabezados(search);
       final ResponsableTableModel ResponsableTableModel = new ResponsableTableModel(this,items_,this.ShowColumns);
       this.setModel(ResponsableTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Responsable ObjectIteration_ = (Responsable)ObjectIteration;
       final Responsable ObjectToCompare_ = (Responsable)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}