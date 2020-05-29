package com.era.views.tables;

import com.era.models.Measure;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MeasureTableModel;
import java.util.List;

public class MeasureTable extends BaseJTable {

   public MeasureTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MeasureTableModel MeasureTableModel = new MeasureTableModel(items,this.ShowColumns);
        this.setModel(MeasureTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MeasureTableModel MeasureTableModel = (MeasureTableModel)this.getModel();
       final List<Measure> items_ = (List<Measure>) MeasureTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Measure> items_ = (List<Measure>) RepositoryFactory.getInstance().getMeasuresRepository().getAll();
       final MeasureTableModel MeasureTableModel = new MeasureTableModel(items_,this.ShowColumns);
       this.setModel(MeasureTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Measure> items_ = (List<Measure>) RepositoryFactory.getInstance().getMeasuresRepository().getByLikeEncabezados(search);
       final MeasureTableModel MeasureTableModel = new MeasureTableModel(items_,this.ShowColumns);
       this.setModel(MeasureTableModel);
   }

}