package com.era.views.tables;

import com.era.models.Partflujact;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartflujactTableModel;
import java.util.List;

public class PartflujactTable extends BaseJTable {

   public PartflujactTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartflujactTableModel PartflujactTableModel = new PartflujactTableModel(this,items,this.ShowColumns);
        this.setModel(PartflujactTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartflujactTableModel PartflujactTableModel = (PartflujactTableModel)this.getModel();
       final List<Partflujact> items_ = (List<Partflujact>) PartflujactTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partflujact> items_ = (List<Partflujact>) RepositoryFactory.getInstance().getPartflujactsRepository().getAll();
       final PartflujactTableModel PartflujactTableModel = new PartflujactTableModel(this,items_,this.ShowColumns);
       this.setModel(PartflujactTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Partflujact> items_ = (List<Partflujact>) RepositoryFactory.getInstance().getPartflujactsRepository().getByLikeEncabezados(search);
       final PartflujactTableModel PartflujactTableModel = new PartflujactTableModel(this,items_,this.ShowColumns);
       this.setModel(PartflujactTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Partflujact ObjectIteration_ = (Partflujact)ObjectIteration;
       final Partflujact ObjectToCompare_ = (Partflujact)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}