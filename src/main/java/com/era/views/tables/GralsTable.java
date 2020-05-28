package com.era.views.tables;

import com.era.models.Grals;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.GralsTableModel;
import java.util.List;

public class GralsTable extends BaseJTable {

   public GralsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final GralsTableModel GralsTableModel = new GralsTableModel(items,this.ShowColumns);
        this.setModel(GralsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final GralsTableModel GralsTableModel = (GralsTableModel)this.getModel();
       final List<Grals> items_ = (List<Grals>) GralsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Grals> items_ = (List<Grals>) RepositoryFactory.getInstance().getGralssRepository().getAll();
       final GralsTableModel GralsTableModel = new GralsTableModel(items_,this.ShowColumns);
       this.setModel(GralsTableModel);
   }

}