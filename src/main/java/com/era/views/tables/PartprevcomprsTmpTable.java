package com.era.views.tables;

import com.era.models.PartprevcomprsTmp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartprevcomprsTmpTableModel;
import java.util.List;

public class PartprevcomprsTmpTable extends BaseJTable {

   public PartprevcomprsTmpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartprevcomprsTmpTableModel PartprevcomprsTmpTableModel = new PartprevcomprsTmpTableModel(this,items,this.ShowColumns);
        this.setModel(PartprevcomprsTmpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartprevcomprsTmpTableModel PartprevcomprsTmpTableModel = (PartprevcomprsTmpTableModel)this.getModel();
       final List<PartprevcomprsTmp> items_ = (List<PartprevcomprsTmp>) PartprevcomprsTmpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PartprevcomprsTmp> items_ = (List<PartprevcomprsTmp>) RepositoryFactory.getInstance().getPartprevcomprsTmpsRepository().getAll();
       final PartprevcomprsTmpTableModel PartprevcomprsTmpTableModel = new PartprevcomprsTmpTableModel(this,items_,this.ShowColumns);
       this.setModel(PartprevcomprsTmpTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<PartprevcomprsTmp> items_ = (List<PartprevcomprsTmp>) RepositoryFactory.getInstance().getPartprevcomprsTmpsRepository().getByLikeEncabezados(search);
       final PartprevcomprsTmpTableModel PartprevcomprsTmpTableModel = new PartprevcomprsTmpTableModel(this,items_,this.ShowColumns);
       this.setModel(PartprevcomprsTmpTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final PartprevcomprsTmp ObjectIteration_ = (PartprevcomprsTmp)ObjectIteration;
       final PartprevcomprsTmp ObjectToCompare_ = (PartprevcomprsTmp)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}