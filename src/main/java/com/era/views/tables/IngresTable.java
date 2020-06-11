package com.era.views.tables;

import com.era.models.Ingres;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.IngresTableModel;
import java.util.List;

public class IngresTable extends BaseJTable {

   public IngresTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final IngresTableModel IngresTableModel = new IngresTableModel(items,this.ShowColumns);
        this.setModel(IngresTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final IngresTableModel IngresTableModel = (IngresTableModel)this.getModel();
       final List<Ingres> items_ = (List<Ingres>) IngresTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Ingres> items_ = (List<Ingres>) RepositoryFactory.getInstance().getIngressRepository().getAll();
       final IngresTableModel IngresTableModel = new IngresTableModel(items_,this.ShowColumns);
       this.setModel(IngresTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Ingres> items_ = (List<Ingres>) RepositoryFactory.getInstance().getIngressRepository().getByLikeEncabezados(search);
       final IngresTableModel IngresTableModel = new IngresTableModel(items_,this.ShowColumns);
       this.setModel(IngresTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Ingres ObjectIteration_ = (Ingres)ObjectIteration;
       final Ingres ObjectToCompare_ = (Ingres)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}