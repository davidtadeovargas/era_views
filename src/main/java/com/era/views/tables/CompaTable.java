package com.era.views.tables;

import com.era.models.Compa;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CompaTableModel;
import java.util.List;

public class CompaTable extends BaseJTable {

   public CompaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CompaTableModel CompaTableModel = new CompaTableModel(items,this.ShowColumns);
        this.setModel(CompaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CompaTableModel CompaTableModel = (CompaTableModel)this.getModel();
       final List<Compa> items_ = (List<Compa>) CompaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Compa> items_ = (List<Compa>) RepositoryFactory.getInstance().getCompasRepository().getAll();
       final CompaTableModel CompaTableModel = new CompaTableModel(items_,this.ShowColumns);
       this.setModel(CompaTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Compa> items_ = (List<Compa>) RepositoryFactory.getInstance().getCompasRepository().getByLikeEncabezados(search);
       final CompaTableModel CompaTableModel = new CompaTableModel(items_,this.ShowColumns);
       this.setModel(CompaTableModel);
   }

}