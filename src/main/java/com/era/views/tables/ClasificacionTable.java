package com.era.views.tables;

import com.era.models.Clasificacion;
import com.era.models.Coin;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasificacionTableModel;
import java.util.List;

public class ClasificacionTable extends BaseJTable {

   public ClasificacionTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasificacionTableModel ClasificacionTableModel = new ClasificacionTableModel(items,this.ShowColumns);
        this.setModel(ClasificacionTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasificacionTableModel ClasificacionTableModel = (ClasificacionTableModel)this.getModel();
       final List<Clasificacion> items_ = (List<Clasificacion>) ClasificacionTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasificacion> items_ = (List<Clasificacion>) RepositoryFactory.getInstance().getClasificacionsRepository().getAll();
       final ClasificacionTableModel ClasificacionTableModel = new ClasificacionTableModel(items_,this.ShowColumns);
       this.setModel(ClasificacionTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Clasificacion> items_ = (List<Clasificacion>) RepositoryFactory.getInstance().getClasificacionsRepository().getByLikeEncabezados(search);
       final ClasificacionTableModel ClasificacionTableModel = new ClasificacionTableModel(items_,this.ShowColumns);
       this.setModel(ClasificacionTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Clasificacion ObjectIteration_ = (Clasificacion)ObjectIteration;
       final Clasificacion ObjectToCompare_ = (Clasificacion)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}