package com.era.views.tables;

import com.era.models.Activos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ActivosTableModel;
import java.util.List;

public class ActivosTable extends BaseJTable {

   public ActivosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ActivosTableModel ActivosTableModel = new ActivosTableModel(this,items,this.ShowColumns);
        this.setModel(ActivosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ActivosTableModel ActivosTableModel = (ActivosTableModel)this.getModel();
       final List<Activos> items_ = (List<Activos>) ActivosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Activos> items_ = (List<Activos>) RepositoryFactory.getInstance().getActivossRepository().getAll();
       final ActivosTableModel ActivosTableModel = new ActivosTableModel(this,items_,this.ShowColumns);
       this.setModel(ActivosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Activos> items_ = (List<Activos>) RepositoryFactory.getInstance().getActivossRepository().getByLikeEncabezados(search);
       final ActivosTableModel ActivosTableModel = new ActivosTableModel(this,items_,this.ShowColumns);
       this.setModel(ActivosTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Activos ObjectIteration_ = (Activos)ObjectIteration;
       final Activos ObjectToCompare_ = (Activos)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}