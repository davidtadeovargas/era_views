package com.era.views.tables;

import com.era.models.Costs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CostsTableModel;
import java.util.List;

public class CostsTable extends BaseJTable {

   public CostsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CostsTableModel CostsTableModel = new CostsTableModel(items,this.ShowColumns);
        this.setModel(CostsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CostsTableModel CostsTableModel = (CostsTableModel)this.getModel();
       final List<Costs> items_ = (List<Costs>) CostsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Costs> items_ = (List<Costs>) RepositoryFactory.getInstance().getCostssRepository().getAll();
       final CostsTableModel CostsTableModel = new CostsTableModel(items_,this.ShowColumns);
       this.setModel(CostsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Costs> items_ = (List<Costs>) RepositoryFactory.getInstance().getCostssRepository().getByLikeEncabezados(search);
       final CostsTableModel CostsTableModel = new CostsTableModel(items_,this.ShowColumns);
       this.setModel(CostsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Costs ObjectIteration_ = (Costs)ObjectIteration;
       final Costs ObjectToCompare_ = (Costs)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}