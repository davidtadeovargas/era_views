package com.era.views.tables;

import com.era.models.MetogoPago;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MetogoPagoTableModel;
import java.util.List;

public class MetogoPagoTable extends BaseJTable {

   public MetogoPagoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MetogoPagoTableModel MetogoPagoTableModel = new MetogoPagoTableModel(this,items,this.ShowColumns);
        this.setModel(MetogoPagoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MetogoPagoTableModel MetogoPagoTableModel = (MetogoPagoTableModel)this.getModel();
       final List<MetogoPago> items_ = (List<MetogoPago>) MetogoPagoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<MetogoPago> items_ = (List<MetogoPago>) RepositoryFactory.getInstance().getMetogoPagosRepository().getAll();
       final MetogoPagoTableModel MetogoPagoTableModel = new MetogoPagoTableModel(this,items_,this.ShowColumns);
       this.setModel(MetogoPagoTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<MetogoPago> items_ = (List<MetogoPago>) RepositoryFactory.getInstance().getMetogoPagosRepository().getByLikeEncabezados(search);
       final MetogoPagoTableModel MetogoPagoTableModel = new MetogoPagoTableModel(this,items_,this.ShowColumns);
       this.setModel(MetogoPagoTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final MetogoPago ObjectIteration_ = (MetogoPago)ObjectIteration;
       final MetogoPago ObjectToCompare_ = (MetogoPago)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}