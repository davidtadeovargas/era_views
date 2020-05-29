package com.era.views.tables;

import com.era.models.Colos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ColosTableModel;
import java.util.List;

public class ColosTable extends BaseJTable {

   public ColosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ColosTableModel ColosTableModel = new ColosTableModel(items,this.ShowColumns);
        this.setModel(ColosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ColosTableModel ColosTableModel = (ColosTableModel)this.getModel();
       final List<Colos> items_ = (List<Colos>) ColosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Colos> items_ = (List<Colos>) RepositoryFactory.getInstance().getColossRepository().getAll();
       final ColosTableModel ColosTableModel = new ColosTableModel(items_,this.ShowColumns);
       this.setModel(ColosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Colos> items_ = (List<Colos>) RepositoryFactory.getInstance().getColossRepository().getByLikeEncabezados(search);
       final ColosTableModel ColosTableModel = new ColosTableModel(items_,this.ShowColumns);
       this.setModel(ColosTableModel);
   }

}