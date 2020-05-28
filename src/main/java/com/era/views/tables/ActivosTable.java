package com.era.views.tables;

import com.era.models.Activos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ActivosTableModel;
import java.util.List;

public class ActivosTable extends BaseJTable {

   public ActivosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ActivosTableModel ActivosTableModel = new ActivosTableModel(items,this.ShowColumns);
        this.setModel(ActivosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ActivosTableModel ActivosTableModel = (ActivosTableModel)this.getModel();
       final List<Activos> items_ = (List<Activos>) ActivosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Activos> items_ = (List<Activos>) RepositoryFactory.getInstance().getActivossRepository().getAll();
       final ActivosTableModel ActivosTableModel = new ActivosTableModel(items_,this.ShowColumns);
       this.setModel(ActivosTableModel);
   }

}