package com.era.views.tables;

import com.era.models.Zona;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ZonaTableModel;
import java.util.List;

public class ZonaTable extends BaseJTable {

   public ZonaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ZonaTableModel ZonaTableModel = new ZonaTableModel(items,this.ShowColumns);
        this.setModel(ZonaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ZonaTableModel ZonaTableModel = (ZonaTableModel)this.getModel();
       final List<Zona> items_ = (List<Zona>) ZonaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Zona> items_ = (List<Zona>) RepositoryFactory.getInstance().getZonasRepository().getAll();
       final ZonaTableModel ZonaTableModel = new ZonaTableModel(items_,this.ShowColumns);
       this.setModel(ZonaTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Zona> items_ = (List<Zona>) RepositoryFactory.getInstance().getZonasRepository().getByLikeEncabezados(search);
       final ZonaTableModel ZonaTableModel = new ZonaTableModel(items_,this.ShowColumns);
       this.setModel(ZonaTableModel);
   }

}