package com.era.views.tables;

import com.era.models.Cumple;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CumpleTableModel;
import java.util.List;

public class CumpleTable extends BaseJTable {

   public CumpleTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CumpleTableModel CumpleTableModel = new CumpleTableModel(items,this.ShowColumns);
        this.setModel(CumpleTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CumpleTableModel CumpleTableModel = (CumpleTableModel)this.getModel();
       final List<Cumple> items_ = (List<Cumple>) CumpleTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cumple> items_ = (List<Cumple>) RepositoryFactory.getInstance().getCumplesRepository().getAll();
       final CumpleTableModel CumpleTableModel = new CumpleTableModel(items_,this.ShowColumns);
       this.setModel(CumpleTableModel);
   }

}