package com.era.views.tables;

import com.era.models.Facturas;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.FacturasTableModel;
import java.util.List;

public class FacturasTable extends BaseJTable {

   public FacturasTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final FacturasTableModel FacturasTableModel = new FacturasTableModel(items,this.ShowColumns);
        this.setModel(FacturasTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final FacturasTableModel FacturasTableModel = (FacturasTableModel)this.getModel();
       final List<Facturas> items_ = (List<Facturas>) FacturasTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Facturas> items_ = (List<Facturas>) RepositoryFactory.getInstance().getFacturassRepository().getAll();
       final FacturasTableModel FacturasTableModel = new FacturasTableModel(items_,this.ShowColumns);
       this.setModel(FacturasTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Facturas> items_ = (List<Facturas>) RepositoryFactory.getInstance().getFacturassRepository().getByLikeEncabezados(search);
       final FacturasTableModel FacturasTableModel = new FacturasTableModel(items_,this.ShowColumns);
       this.setModel(FacturasTableModel);
   }

}