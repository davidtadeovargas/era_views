package com.era.views.tables;

import com.era.models.Clasprov;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasprovTableModel;
import java.util.List;

public class ClasprovTable extends BaseJTable {

   public ClasprovTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasprovTableModel ClasprovTableModel = new ClasprovTableModel(items,this.ShowColumns);
        this.setModel(ClasprovTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasprovTableModel ClasprovTableModel = (ClasprovTableModel)this.getModel();
       final List<Clasprov> items_ = (List<Clasprov>) ClasprovTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasprov> items_ = (List<Clasprov>) RepositoryFactory.getInstance().getClasprovsRepository().getAll();
       final ClasprovTableModel ClasprovTableModel = new ClasprovTableModel(items_,this.ShowColumns);
       this.setModel(ClasprovTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Clasprov> items_ = (List<Clasprov>) RepositoryFactory.getInstance().getClasprovsRepository().getByLikeEncabezados(search);
       final ClasprovTableModel ClasprovTableModel = new ClasprovTableModel(items_,this.ShowColumns);
       this.setModel(ClasprovTableModel);
   }

}