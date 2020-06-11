package com.era.views.tables;

import com.era.models.Cortszx;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CortszxTableModel;
import java.util.List;

public class CortszxTable extends BaseJTable {

   public CortszxTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CortszxTableModel CortszxTableModel = new CortszxTableModel(items,this.ShowColumns);
        this.setModel(CortszxTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CortszxTableModel CortszxTableModel = (CortszxTableModel)this.getModel();
       final List<Cortszx> items_ = (List<Cortszx>) CortszxTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cortszx> items_ = (List<Cortszx>) RepositoryFactory.getInstance().getCortszxsRepository().getAll();
       final CortszxTableModel CortszxTableModel = new CortszxTableModel(items_,this.ShowColumns);
       this.setModel(CortszxTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Cortszx> items_ = (List<Cortszx>) RepositoryFactory.getInstance().getCortszxsRepository().getByLikeEncabezados(search);
       final CortszxTableModel CortszxTableModel = new CortszxTableModel(items_,this.ShowColumns);
       this.setModel(CortszxTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Cortszx ObjectIteration_ = (Cortszx)ObjectIteration;
       final Cortszx ObjectToCompare_ = (Cortszx)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}