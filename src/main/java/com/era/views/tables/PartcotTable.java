package com.era.views.tables;

import com.era.models.Partcot;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartcotTableModel;
import java.util.List;

public class PartcotTable extends BaseJTable {

   public PartcotTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartcotTableModel PartcotTableModel = new PartcotTableModel(this,items,this.ShowColumns);
        this.setModel(PartcotTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartcotTableModel PartcotTableModel = (PartcotTableModel)this.getModel();
       final List<Partcot> items_ = (List<Partcot>) PartcotTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partcot> items_ = (List<Partcot>) RepositoryFactory.getInstance().getPartcotsRepository().getAll();
       final PartcotTableModel PartcotTableModel = new PartcotTableModel(this,items_,this.ShowColumns);
       this.setModel(PartcotTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Partcot> items_ = (List<Partcot>) RepositoryFactory.getInstance().getPartcotsRepository().getByLikeEncabezados(search);
       final PartcotTableModel PartcotTableModel = new PartcotTableModel(this,items_,this.ShowColumns);
       this.setModel(PartcotTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Partcot ObjectIteration_ = (Partcot)ObjectIteration;
       final Partcot ObjectToCompare_ = (Partcot)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}