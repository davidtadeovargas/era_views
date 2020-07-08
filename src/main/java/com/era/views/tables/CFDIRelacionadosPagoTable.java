package com.era.views.tables;

import com.era.models.CFDIRelacionadosPago;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CFDIRelacionadosPagoTableModel;
import java.util.List;

public class CFDIRelacionadosPagoTable extends BaseJTable {

   public CFDIRelacionadosPagoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CFDIRelacionadosPagoTableModel CFDIRelacionadosPagoTableModel = new CFDIRelacionadosPagoTableModel(this,items,this.ShowColumns);
        this.setModel(CFDIRelacionadosPagoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CFDIRelacionadosPagoTableModel CFDIRelacionadosPagoTableModel = (CFDIRelacionadosPagoTableModel)this.getModel();
       final List<CFDIRelacionadosPago> items_ = (List<CFDIRelacionadosPago>) CFDIRelacionadosPagoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CFDIRelacionadosPago> items_ = (List<CFDIRelacionadosPago>) RepositoryFactory.getInstance().getCFDIRelacionadosPagosRepository().getAll();
       final CFDIRelacionadosPagoTableModel CFDIRelacionadosPagoTableModel = new CFDIRelacionadosPagoTableModel(this,items_,this.ShowColumns);
       this.setModel(CFDIRelacionadosPagoTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CFDIRelacionadosPago> items_ = (List<CFDIRelacionadosPago>) RepositoryFactory.getInstance().getCFDIRelacionadosPagosRepository().getByLikeEncabezados(search);
       final CFDIRelacionadosPagoTableModel CFDIRelacionadosPagoTableModel = new CFDIRelacionadosPagoTableModel(this,items_,this.ShowColumns);
       this.setModel(CFDIRelacionadosPagoTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final CFDIRelacionadosPago ObjectIteration_ = (CFDIRelacionadosPago)ObjectIteration;
       final CFDIRelacionadosPago ObjectToCompare_ = (CFDIRelacionadosPago)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}