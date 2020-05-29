package com.era.views.tables;

import com.era.models.Conceps;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConcepsTableModel;
import java.util.List;

public class ConcepsTable extends BaseJTable {

   public ConcepsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(items,this.ShowColumns);
        this.setModel(ConcepsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConcepsTableModel ConcepsTableModel = (ConcepsTableModel)this.getModel();
       final List<Conceps> items_ = (List<Conceps>) ConcepsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Conceps> items_ = (List<Conceps>) RepositoryFactory.getInstance().getConcepssRepository().getAll();
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(items_,this.ShowColumns);
       this.setModel(ConcepsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Conceps> items_ = (List<Conceps>) RepositoryFactory.getInstance().getConcepssRepository().getByLikeEncabezados(search);
       final ConcepsTableModel ConcepsTableModel = new ConcepsTableModel(items_,this.ShowColumns);
       this.setModel(ConcepsTableModel);
   }

}