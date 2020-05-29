package com.era.views.tables;

import com.era.models.Msjs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MsjsTableModel;
import java.util.List;

public class MsjsTable extends BaseJTable {

   public MsjsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MsjsTableModel MsjsTableModel = new MsjsTableModel(items,this.ShowColumns);
        this.setModel(MsjsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MsjsTableModel MsjsTableModel = (MsjsTableModel)this.getModel();
       final List<Msjs> items_ = (List<Msjs>) MsjsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Msjs> items_ = (List<Msjs>) RepositoryFactory.getInstance().getMsjssRepository().getAll();
       final MsjsTableModel MsjsTableModel = new MsjsTableModel(items_,this.ShowColumns);
       this.setModel(MsjsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Msjs> items_ = (List<Msjs>) RepositoryFactory.getInstance().getMsjssRepository().getByLikeEncabezados(search);
       final MsjsTableModel MsjsTableModel = new MsjsTableModel(items_,this.ShowColumns);
       this.setModel(MsjsTableModel);
   }

}