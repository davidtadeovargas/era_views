package com.era.views.tables;

import com.era.models.Cxc;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CxcTableModel;
import java.util.List;

public class CxcTable extends BaseJTable {

   public CxcTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CxcTableModel CxcTableModel = new CxcTableModel(items,this.ShowColumns);
        this.setModel(CxcTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CxcTableModel CxcTableModel = (CxcTableModel)this.getModel();
       final List<Cxc> items_ = (List<Cxc>) CxcTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cxc> items_ = (List<Cxc>) RepositoryFactory.getInstance().getCxcsRepository().getAll();
       final CxcTableModel CxcTableModel = new CxcTableModel(items_,this.ShowColumns);
       this.setModel(CxcTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Cxc> items_ = (List<Cxc>) RepositoryFactory.getInstance().getCxcsRepository().getByLikeEncabezados(search);
       final CxcTableModel CxcTableModel = new CxcTableModel(items_,this.ShowColumns);
       this.setModel(CxcTableModel);
   }

}