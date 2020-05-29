package com.era.views.tables;

import com.era.models.Contras;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ContrasTableModel;
import java.util.List;

public class ContrasTable extends BaseJTable {

   public ContrasTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ContrasTableModel ContrasTableModel = new ContrasTableModel(items,this.ShowColumns);
        this.setModel(ContrasTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ContrasTableModel ContrasTableModel = (ContrasTableModel)this.getModel();
       final List<Contras> items_ = (List<Contras>) ContrasTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Contras> items_ = (List<Contras>) RepositoryFactory.getInstance().getContrassRepository().getAll();
       final ContrasTableModel ContrasTableModel = new ContrasTableModel(items_,this.ShowColumns);
       this.setModel(ContrasTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Contras> items_ = (List<Contras>) RepositoryFactory.getInstance().getContrassRepository().getByLikeEncabezados(search);
       final ContrasTableModel ContrasTableModel = new ContrasTableModel(items_,this.ShowColumns);
       this.setModel(ContrasTableModel);
   }

}