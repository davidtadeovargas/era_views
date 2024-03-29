package com.era.views.tables;

import com.era.models.Prevcomprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PrevcomprsTableModel;
import java.util.List;

public class PrevcomprsTable extends BaseJTable {

   public PrevcomprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PrevcomprsTableModel PrevcomprsTableModel = new PrevcomprsTableModel(this,items,this.ShowColumns);
        this.setModel(PrevcomprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PrevcomprsTableModel PrevcomprsTableModel = (PrevcomprsTableModel)this.getModel();
       final List<Prevcomprs> items_ = (List<Prevcomprs>) PrevcomprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Prevcomprs> items_ = (List<Prevcomprs>) RepositoryFactory.getInstance().getPrevcomprssRepository().getAll();
       final PrevcomprsTableModel PrevcomprsTableModel = new PrevcomprsTableModel(this,items_,this.ShowColumns);
       this.setModel(PrevcomprsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Prevcomprs> items_ = (List<Prevcomprs>) RepositoryFactory.getInstance().getPrevcomprssRepository().getByLikeEncabezados(search);
       final PrevcomprsTableModel PrevcomprsTableModel = new PrevcomprsTableModel(this,items_,this.ShowColumns);
       this.setModel(PrevcomprsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Prevcomprs ObjectIteration_ = (Prevcomprs)ObjectIteration;
       final Prevcomprs ObjectToCompare_ = (Prevcomprs)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}