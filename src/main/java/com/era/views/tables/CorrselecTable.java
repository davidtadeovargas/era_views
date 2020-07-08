package com.era.views.tables;

import com.era.models.Corrselec;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CorrselecTableModel;
import java.util.List;

public class CorrselecTable extends BaseJTable {

   public CorrselecTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CorrselecTableModel CorrselecTableModel = new CorrselecTableModel(this,items,this.ShowColumns);
        this.setModel(CorrselecTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CorrselecTableModel CorrselecTableModel = (CorrselecTableModel)this.getModel();
       final List<Corrselec> items_ = (List<Corrselec>) CorrselecTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Corrselec> items_ = (List<Corrselec>) RepositoryFactory.getInstance().getCorrselecRepository().getAll();
       final CorrselecTableModel CorrselecTableModel = new CorrselecTableModel(this,items_,this.ShowColumns);
       this.setModel(CorrselecTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Corrselec> items_ = (List<Corrselec>) RepositoryFactory.getInstance().getCorrselecRepository().getByLikeEncabezados(search);
       final CorrselecTableModel CorrselecTableModel = new CorrselecTableModel(this,items_,this.ShowColumns);
       this.setModel(CorrselecTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Corrselec ObjectIteration_ = (Corrselec)ObjectIteration;
       final Corrselec ObjectToCompare_ = (Corrselec)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}