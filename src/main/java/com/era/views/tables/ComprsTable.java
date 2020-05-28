package com.era.views.tables;

import com.era.models.Comprs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ComprsTableModel;
import java.util.List;

public class ComprsTable extends BaseJTable {

   public ComprsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ComprsTableModel ComprsTableModel = new ComprsTableModel(items,this.ShowColumns);
        this.setModel(ComprsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ComprsTableModel ComprsTableModel = (ComprsTableModel)this.getModel();
       final List<Comprs> items_ = (List<Comprs>) ComprsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Comprs> items_ = (List<Comprs>) RepositoryFactory.getInstance().getComprssRepository().getAll();
       final ComprsTableModel ComprsTableModel = new ComprsTableModel(items_,this.ShowColumns);
       this.setModel(ComprsTableModel);
   }

}