package com.era.views.tables;

import com.era.models.PartcomprsTmp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartcomprsTmpTableModel;
import java.util.List;

public class PartcomprsTmpTable extends BaseJTable {

   public PartcomprsTmpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartcomprsTmpTableModel PartcomprsTmpTableModel = new PartcomprsTmpTableModel(items,this.ShowColumns);
        this.setModel(PartcomprsTmpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartcomprsTmpTableModel PartcomprsTmpTableModel = (PartcomprsTmpTableModel)this.getModel();
       final List<PartcomprsTmp> items_ = (List<PartcomprsTmp>) PartcomprsTmpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PartcomprsTmp> items_ = (List<PartcomprsTmp>) RepositoryFactory.getInstance().getPartcomprsTmpsRepository().getAll();
       final PartcomprsTmpTableModel PartcomprsTmpTableModel = new PartcomprsTmpTableModel(items_,this.ShowColumns);
       this.setModel(PartcomprsTmpTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<PartcomprsTmp> items_ = (List<PartcomprsTmp>) RepositoryFactory.getInstance().getPartcomprsTmpsRepository().getByLikeEncabezados(search);
       final PartcomprsTmpTableModel PartcomprsTmpTableModel = new PartcomprsTmpTableModel(items_,this.ShowColumns);
       this.setModel(PartcomprsTmpTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final PartcomprsTmp ObjectIteration_ = (PartcomprsTmp)ObjectIteration;
       final PartcomprsTmp ObjectToCompare_ = (PartcomprsTmp)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}