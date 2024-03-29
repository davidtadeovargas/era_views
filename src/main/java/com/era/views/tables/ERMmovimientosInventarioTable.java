package com.era.views.tables;

import com.era.models.ERMmovimientosInventario;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ERMmovimientosInventarioTableModel;
import java.util.List;

public class ERMmovimientosInventarioTable extends BaseJTable {

   public ERMmovimientosInventarioTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ERMmovimientosInventarioTableModel ERMmovimientosInventarioTableModel = new ERMmovimientosInventarioTableModel(this,items,this.ShowColumns);
        this.setModel(ERMmovimientosInventarioTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ERMmovimientosInventarioTableModel ERMmovimientosInventarioTableModel = (ERMmovimientosInventarioTableModel)this.getModel();
       final List<ERMmovimientosInventario> items_ = (List<ERMmovimientosInventario>) ERMmovimientosInventarioTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ERMmovimientosInventario> items_ = (List<ERMmovimientosInventario>) RepositoryFactory.getInstance().getERMmovimientosInventariosRepository().getAll();
       final ERMmovimientosInventarioTableModel ERMmovimientosInventarioTableModel = new ERMmovimientosInventarioTableModel(this,items_,this.ShowColumns);
       this.setModel(ERMmovimientosInventarioTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ERMmovimientosInventario> items_ = (List<ERMmovimientosInventario>) RepositoryFactory.getInstance().getERMmovimientosInventariosRepository().getByLikeEncabezados(search);
       final ERMmovimientosInventarioTableModel ERMmovimientosInventarioTableModel = new ERMmovimientosInventarioTableModel(this,items_,this.ShowColumns);
       this.setModel(ERMmovimientosInventarioTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final ERMmovimientosInventario ObjectIteration_ = (ERMmovimientosInventario)ObjectIteration;
       final ERMmovimientosInventario ObjectToCompare_ = (ERMmovimientosInventario)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}