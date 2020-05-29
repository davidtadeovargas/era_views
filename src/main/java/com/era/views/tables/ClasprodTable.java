package com.era.views.tables;

import com.era.models.Clasprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasprodTableModel;
import java.util.List;

public class ClasprodTable extends BaseJTable {

   public ClasprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasprodTableModel ClasprodTableModel = new ClasprodTableModel(items,this.ShowColumns);
        this.setModel(ClasprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasprodTableModel ClasprodTableModel = (ClasprodTableModel)this.getModel();
       final List<Clasprod> items_ = (List<Clasprod>) ClasprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasprod> items_ = (List<Clasprod>) RepositoryFactory.getInstance().getClasprodsRepository().getAll();
       final ClasprodTableModel ClasprodTableModel = new ClasprodTableModel(items_,this.ShowColumns);
       this.setModel(ClasprodTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Clasprod> items_ = (List<Clasprod>) RepositoryFactory.getInstance().getClasprodsRepository().getByLikeEncabezados(search);
       final ClasprodTableModel ClasprodTableModel = new ClasprodTableModel(items_,this.ShowColumns);
       this.setModel(ClasprodTableModel);
   }

}