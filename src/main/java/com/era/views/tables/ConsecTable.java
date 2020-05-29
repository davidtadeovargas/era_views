package com.era.views.tables;

import com.era.models.Consec;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConsecTableModel;
import java.util.List;

public class ConsecTable extends BaseJTable {

   public ConsecTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConsecTableModel ConsecTableModel = new ConsecTableModel(items,this.ShowColumns);
        this.setModel(ConsecTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConsecTableModel ConsecTableModel = (ConsecTableModel)this.getModel();
       final List<Consec> items_ = (List<Consec>) ConsecTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Consec> items_ = (List<Consec>) RepositoryFactory.getInstance().getConsecsRepository().getAll();
       final ConsecTableModel ConsecTableModel = new ConsecTableModel(items_,this.ShowColumns);
       this.setModel(ConsecTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Consec> items_ = (List<Consec>) RepositoryFactory.getInstance().getConsecsRepository().getByLikeEncabezados(search);
       final ConsecTableModel ConsecTableModel = new ConsecTableModel(items_,this.ShowColumns);
       this.setModel(ConsecTableModel);
   }

}