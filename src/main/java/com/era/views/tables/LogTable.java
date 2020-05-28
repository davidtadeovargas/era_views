package com.era.views.tables;

import com.era.models.Log;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.LogTableModel;
import java.util.List;

public class LogTable extends BaseJTable {

   public LogTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final LogTableModel LogTableModel = new LogTableModel(items,this.ShowColumns);
        this.setModel(LogTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final LogTableModel LogTableModel = (LogTableModel)this.getModel();
       final List<Log> items_ = (List<Log>) LogTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Log> items_ = (List<Log>) RepositoryFactory.getInstance().getLogsRepository().getAll();
       final LogTableModel LogTableModel = new LogTableModel(items_,this.ShowColumns);
       this.setModel(LogTableModel);
   }

}