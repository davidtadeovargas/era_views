package com.era.views.tables;

import com.era.models.ImpuestosXVenta;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuestosXVentaTableModel;
import java.util.List;

public class ImpuestosXVentaTable extends BaseJTable {

   public ImpuestosXVentaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = new ImpuestosXVentaTableModel(this,items,this.ShowColumns);
        this.setModel(ImpuestosXVentaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = (ImpuestosXVentaTableModel)this.getModel();
       final List<ImpuestosXVenta> items_ = (List<ImpuestosXVenta>) ImpuestosXVentaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuestosXVenta> items_ = (List<ImpuestosXVenta>) RepositoryFactory.getInstance().getImpuestosXVentasRepository().getAll();
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = new ImpuestosXVentaTableModel(this,items_,this.ShowColumns);
       this.setModel(ImpuestosXVentaTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ImpuestosXVenta> items_ = (List<ImpuestosXVenta>) RepositoryFactory.getInstance().getImpuestosXVentasRepository().getByLikeEncabezados(search);
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = new ImpuestosXVentaTableModel(this,items_,this.ShowColumns);
       this.setModel(ImpuestosXVentaTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final ImpuestosXVenta ObjectIteration_ = (ImpuestosXVenta)ObjectIteration;
       final ImpuestosXVenta ObjectToCompare_ = (ImpuestosXVenta)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId_partida() == ObjectToCompare_.getId_partida();
    }
}