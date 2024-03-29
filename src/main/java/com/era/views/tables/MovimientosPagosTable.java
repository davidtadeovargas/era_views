package com.era.views.tables;

import com.era.models.MovimientosPagos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MovimientosPagosTableModel;
import java.util.List;

public class MovimientosPagosTable extends BaseJTable {

   public MovimientosPagosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MovimientosPagosTableModel MovimientosPagosTableModel = new MovimientosPagosTableModel(this,items,this.ShowColumns);
        this.setModel(MovimientosPagosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MovimientosPagosTableModel MovimientosPagosTableModel = (MovimientosPagosTableModel)this.getModel();
       final List<MovimientosPagos> items_ = (List<MovimientosPagos>) MovimientosPagosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<MovimientosPagos> items_ = (List<MovimientosPagos>) RepositoryFactory.getInstance().getMovimientosPagossRepository().getAll();
       final MovimientosPagosTableModel MovimientosPagosTableModel = new MovimientosPagosTableModel(this,items_,this.ShowColumns);
       this.setModel(MovimientosPagosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<MovimientosPagos> items_ = (List<MovimientosPagos>) RepositoryFactory.getInstance().getMovimientosPagossRepository().getByLikeEncabezados(search);
       final MovimientosPagosTableModel MovimientosPagosTableModel = new MovimientosPagosTableModel(this,items_,this.ShowColumns);
       this.setModel(MovimientosPagosTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final MovimientosPagos ObjectIteration_ = (MovimientosPagos)ObjectIteration;
       final MovimientosPagos ObjectToCompare_ = (MovimientosPagos)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}