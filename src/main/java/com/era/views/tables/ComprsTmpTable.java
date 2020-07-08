package com.era.views.tables;

import com.era.models.ComprsTmp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ComprsTmpTableModel;
import java.util.List;

public class ComprsTmpTable extends BaseJTable {

   public ComprsTmpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ComprsTmpTableModel ComprsTmpTableModel = new ComprsTmpTableModel(this,items,this.ShowColumns);
        this.setModel(ComprsTmpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ComprsTmpTableModel ComprsTmpTableModel = (ComprsTmpTableModel)this.getModel();
       final List<ComprsTmp> items_ = (List<ComprsTmp>) ComprsTmpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ComprsTmp> items_ = (List<ComprsTmp>) RepositoryFactory.getInstance().getComprsTmpsRepository().getAll();
       final ComprsTmpTableModel ComprsTmpTableModel = new ComprsTmpTableModel(this,items_,this.ShowColumns);
       this.setModel(ComprsTmpTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ComprsTmp> items_ = (List<ComprsTmp>) RepositoryFactory.getInstance().getComprsTmpsRepository().getByLikeEncabezados(search);
       final ComprsTmpTableModel ComprsTmpTableModel = new ComprsTmpTableModel(this,items_,this.ShowColumns);
       this.setModel(ComprsTmpTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final ComprsTmp ObjectIteration_ = (ComprsTmp)ObjectIteration;
       final ComprsTmp ObjectToCompare_ = (ComprsTmp)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}