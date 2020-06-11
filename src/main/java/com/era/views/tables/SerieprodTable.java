package com.era.views.tables;

import com.era.models.Serieprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SerieprodTableModel;
import java.util.List;

public class SerieprodTable extends BaseJTable {

   public SerieprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SerieprodTableModel SerieprodTableModel = new SerieprodTableModel(items,this.ShowColumns);
        this.setModel(SerieprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SerieprodTableModel SerieprodTableModel = (SerieprodTableModel)this.getModel();
       final List<Serieprod> items_ = (List<Serieprod>) SerieprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Serieprod> items_ = (List<Serieprod>) RepositoryFactory.getInstance().getSerieprodsRepository().getAll();
       final SerieprodTableModel SerieprodTableModel = new SerieprodTableModel(items_,this.ShowColumns);
       this.setModel(SerieprodTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Serieprod> items_ = (List<Serieprod>) RepositoryFactory.getInstance().getSerieprodsRepository().getByLikeEncabezados(search);
       final SerieprodTableModel SerieprodTableModel = new SerieprodTableModel(items_,this.ShowColumns);
       this.setModel(SerieprodTableModel);
   }

    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
       return false;
    }
}