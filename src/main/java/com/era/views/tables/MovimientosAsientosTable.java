package com.era.views.tables;

import com.era.models.MovimientosAsientos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MovimientosAsientosTableModel;
import java.util.List;

public class MovimientosAsientosTable extends BaseJTable {

   public MovimientosAsientosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MovimientosAsientosTableModel MovimientosAsientosTableModel = new MovimientosAsientosTableModel(items,this.ShowColumns);
        this.setModel(MovimientosAsientosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MovimientosAsientosTableModel MovimientosAsientosTableModel = (MovimientosAsientosTableModel)this.getModel();
       final List<MovimientosAsientos> items_ = (List<MovimientosAsientos>) MovimientosAsientosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<MovimientosAsientos> items_ = (List<MovimientosAsientos>) RepositoryFactory.getInstance().getMovimientosAsientossRepository().getAll();
       final MovimientosAsientosTableModel MovimientosAsientosTableModel = new MovimientosAsientosTableModel(items_,this.ShowColumns);
       this.setModel(MovimientosAsientosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<MovimientosAsientos> items_ = (List<MovimientosAsientos>) RepositoryFactory.getInstance().getMovimientosAsientossRepository().getByLikeEncabezados(search);
       final MovimientosAsientosTableModel MovimientosAsientosTableModel = new MovimientosAsientosTableModel(items_,this.ShowColumns);
       this.setModel(MovimientosAsientosTableModel);
   }

}