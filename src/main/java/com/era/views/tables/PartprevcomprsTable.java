package com.era.views.tables;

import com.era.models.Partprevcomprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartprevcomprsTableModel;
import java.util.List;

public class PartprevcomprsTable extends BaseJTable {

   public PartprevcomprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartprevcomprsTableModel PartprevcomprsTableModel = new PartprevcomprsTableModel(this,items,this.ShowColumns);
        this.setModel(PartprevcomprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartprevcomprsTableModel PartprevcomprsTableModel = (PartprevcomprsTableModel)this.getModel();
       final List<Partprevcomprs> items_ = (List<Partprevcomprs>) PartprevcomprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partprevcomprs> items_ = (List<Partprevcomprs>) RepositoryFactory.getInstance().getPartprevcomprssRepository().getAll();
       final PartprevcomprsTableModel PartprevcomprsTableModel = new PartprevcomprsTableModel(this,items_,this.ShowColumns);
       this.setModel(PartprevcomprsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Partprevcomprs> items_ = (List<Partprevcomprs>) RepositoryFactory.getInstance().getPartprevcomprssRepository().getByLikeEncabezados(search);
       final PartprevcomprsTableModel PartprevcomprsTableModel = new PartprevcomprsTableModel(this,items_,this.ShowColumns);
       this.setModel(PartprevcomprsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Partprevcomprs ObjectIteration_ = (Partprevcomprs)ObjectIteration;
       final Partprevcomprs ObjectToCompare_ = (Partprevcomprs)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}