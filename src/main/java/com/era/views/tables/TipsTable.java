package com.era.views.tables;

import com.era.models.Tips;
import com.era.models.Tipscamb;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TipsTableModel;
import java.util.List;

public class TipsTable extends BaseJTable {

   public TipsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TipsTableModel TipsTableModel = new TipsTableModel(this,items,this.ShowColumns);
       this.setModel(TipsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TipsTableModel TipsTableModel = (TipsTableModel)this.getModel();
       final List<Tips> items_ = (List<Tips>) TipsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tips> items_ = (List<Tips>) RepositoryFactory.getInstance().getTipssRepository().getAll();
       final TipsTableModel TipsTableModel = new TipsTableModel(this,items_,this.ShowColumns);
       this.setModel(TipsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Tips> items_ = (List<Tips>) RepositoryFactory.getInstance().getTipssRepository().getByLikeEncabezados(search);
       final TipsTableModel TipsTableModel = new TipsTableModel(this,items_,this.ShowColumns);
       this.setModel(TipsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Tipscamb ObjectIteration_ = (Tipscamb)ObjectIteration;
       final Tipscamb ObjectToCompare_ = (Tipscamb)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCode().compareTo(ObjectToCompare_.getCode())==0;
    }
}