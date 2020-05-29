package com.era.views.tables;

import com.era.models.Tall;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TallTableModel;
import java.util.List;

public class TallTable extends BaseJTable {

   public TallTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TallTableModel TallTableModel = new TallTableModel(items,this.ShowColumns);
        this.setModel(TallTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TallTableModel TallTableModel = (TallTableModel)this.getModel();
       final List<Tall> items_ = (List<Tall>) TallTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tall> items_ = (List<Tall>) RepositoryFactory.getInstance().getTallsRepository().getAll();
       final TallTableModel TallTableModel = new TallTableModel(items_,this.ShowColumns);
       this.setModel(TallTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Tall> items_ = (List<Tall>) RepositoryFactory.getInstance().getTallsRepository().getByLikeEncabezados(search);
       final TallTableModel TallTableModel = new TallTableModel(items_,this.ShowColumns);
       this.setModel(TallTableModel);
   }

}