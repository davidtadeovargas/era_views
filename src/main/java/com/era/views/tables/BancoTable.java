package com.era.views.tables;

import com.era.models.Banco;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.BancoTableModel;
import java.util.List;

public class BancoTable extends BaseJTable {

   public BancoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final BancoTableModel BancoTableModel = new BancoTableModel(items,this.ShowColumns);
        this.setModel(BancoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final BancoTableModel BancoTableModel = (BancoTableModel)this.getModel();
       final List<Banco> items_ = (List<Banco>) BancoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Banco> items_ = (List<Banco>) RepositoryFactory.getInstance().getBancosRepository().getAll();
       final BancoTableModel BancoTableModel = new BancoTableModel(items_,this.ShowColumns);
       this.setModel(BancoTableModel);
   }

}