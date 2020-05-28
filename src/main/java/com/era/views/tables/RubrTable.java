package com.era.views.tables;

import com.era.models.Rubr;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.RubrTableModel;
import java.util.List;

public class RubrTable extends BaseJTable {

   public RubrTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final RubrTableModel RubrTableModel = new RubrTableModel(items,this.ShowColumns);
        this.setModel(RubrTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final RubrTableModel RubrTableModel = (RubrTableModel)this.getModel();
       final List<Rubr> items_ = (List<Rubr>) RubrTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Rubr> items_ = (List<Rubr>) RepositoryFactory.getInstance().getRubrsRepository().getAll();
       final RubrTableModel RubrTableModel = new RubrTableModel(items_,this.ShowColumns);
       this.setModel(RubrTableModel);
   }

}