package com.era.views.tables;

import com.era.models.Sectores;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SectoresTableModel;
import java.util.List;

public class SectoresTable extends BaseJTable {

   public SectoresTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SectoresTableModel SectoresTableModel = new SectoresTableModel(items,this.ShowColumns);
        this.setModel(SectoresTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SectoresTableModel SectoresTableModel = (SectoresTableModel)this.getModel();
       final List<Sectores> items_ = (List<Sectores>) SectoresTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Sectores> items_ = (List<Sectores>) RepositoryFactory.getInstance().getSectoressRepository().getAll();
       final SectoresTableModel SectoresTableModel = new SectoresTableModel(items_,this.ShowColumns);
       this.setModel(SectoresTableModel);
   }

}