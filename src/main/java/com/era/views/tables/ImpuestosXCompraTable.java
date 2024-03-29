package com.era.views.tables;

import com.era.models.ImpuestosXCompra;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuestosXCompraTableModel;
import java.util.List;

public class ImpuestosXCompraTable extends BaseJTable {

   public ImpuestosXCompraTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuestosXCompraTableModel ImpuestosXCompraTableModel = new ImpuestosXCompraTableModel(this,items,this.ShowColumns);
        this.setModel(ImpuestosXCompraTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuestosXCompraTableModel ImpuestosXCompraTableModel = (ImpuestosXCompraTableModel)this.getModel();
       final List<ImpuestosXCompra> items_ = (List<ImpuestosXCompra>) ImpuestosXCompraTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuestosXCompra> items_ = (List<ImpuestosXCompra>) RepositoryFactory.getInstance().getImpuestosXComprasRepository().getAll();
       final ImpuestosXCompraTableModel ImpuestosXCompraTableModel = new ImpuestosXCompraTableModel(this,items_,this.ShowColumns);
       this.setModel(ImpuestosXCompraTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ImpuestosXCompra> items_ = (List<ImpuestosXCompra>) RepositoryFactory.getInstance().getImpuestosXComprasRepository().getByLikeEncabezados(search);
       final ImpuestosXCompraTableModel ImpuestosXCompraTableModel = new ImpuestosXCompraTableModel(this,items_,this.ShowColumns);
       this.setModel(ImpuestosXCompraTableModel);
   }

    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final ImpuestosXCompra ObjectIteration_ = (ImpuestosXCompra)ObjectIteration;
       final ImpuestosXCompra ObjectToCompare_ = (ImpuestosXCompra)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCompra() == ObjectToCompare_.getCompra();
    }
}