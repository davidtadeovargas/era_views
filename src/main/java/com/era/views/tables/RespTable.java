package com.era.views.tables;

import com.era.models.Resp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.RespTableModel;
import java.util.List;

public class RespTable extends BaseJTable {

   public RespTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final RespTableModel RespTableModel = new RespTableModel(items,this.ShowColumns);
        this.setModel(RespTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final RespTableModel RespTableModel = (RespTableModel)this.getModel();
       final List<Resp> items_ = (List<Resp>) RespTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Resp> items_ = (List<Resp>) RepositoryFactory.getInstance().getRespsRepository().getAll();
       final RespTableModel RespTableModel = new RespTableModel(items_,this.ShowColumns);
       this.setModel(RespTableModel);
   }

}