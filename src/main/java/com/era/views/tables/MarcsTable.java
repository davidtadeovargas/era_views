package com.era.views.tables;

import com.era.models.Marcs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MarcsTableModel;
import java.util.List;

public class MarcsTable extends BaseJTable {

   public MarcsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MarcsTableModel MarcsTableModel = new MarcsTableModel(this,items,this.ShowColumns);
        this.setModel(MarcsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MarcsTableModel MarcsTableModel = (MarcsTableModel)this.getModel();
       final List<Marcs> items_ = (List<Marcs>) MarcsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Marcs> items_ = (List<Marcs>) RepositoryFactory.getInstance().getMarcssRepository().getAll();
       final MarcsTableModel MarcsTableModel = new MarcsTableModel(this,items_,this.ShowColumns);
       this.setModel(MarcsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Marcs> items_ = (List<Marcs>) RepositoryFactory.getInstance().getMarcssRepository().getByLikeEncabezados(search);
       final MarcsTableModel MarcsTableModel = new MarcsTableModel(this,items_,this.ShowColumns);
       this.setModel(MarcsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Marcs ObjectIteration_ = (Marcs)ObjectIteration;
       final Marcs ObjectToCompare_ = (Marcs)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}