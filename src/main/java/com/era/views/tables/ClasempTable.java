package com.era.views.tables;

import com.era.models.Clasemp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ClasempTableModel;
import java.util.List;

public class ClasempTable extends BaseJTable {

   public ClasempTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ClasempTableModel ClasempTableModel = new ClasempTableModel(items,this.ShowColumns);
        this.setModel(ClasempTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ClasempTableModel ClasempTableModel = (ClasempTableModel)this.getModel();
       final List<Clasemp> items_ = (List<Clasemp>) ClasempTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Clasemp> items_ = (List<Clasemp>) RepositoryFactory.getInstance().getClasempsRepository().getAll();
       final ClasempTableModel ClasempTableModel = new ClasempTableModel(items_,this.ShowColumns);
       this.setModel(ClasempTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Clasemp> items_ = (List<Clasemp>) RepositoryFactory.getInstance().getClasempsRepository().getByLikeEncabezados(search);
       final ClasempTableModel ClasempTableModel = new ClasempTableModel(items_,this.ShowColumns);
       this.setModel(ClasempTableModel);
   }

}