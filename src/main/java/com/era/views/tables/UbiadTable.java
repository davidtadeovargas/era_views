package com.era.views.tables;

import com.era.models.Ubiad;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UbiadTableModel;
import java.util.List;

public class UbiadTable extends BaseJTable {

   public UbiadTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final UbiadTableModel UbiadTableModel = new UbiadTableModel(items,this.ShowColumns);
        this.setModel(UbiadTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final UbiadTableModel UbiadTableModel = (UbiadTableModel)this.getModel();
       final List<Ubiad> items_ = (List<Ubiad>) UbiadTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Ubiad> items_ = (List<Ubiad>) RepositoryFactory.getInstance().getUbiadsRepository().getAll();
       final UbiadTableModel UbiadTableModel = new UbiadTableModel(items_,this.ShowColumns);
       this.setModel(UbiadTableModel);
   }

}