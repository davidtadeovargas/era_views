package com.era.views.tables;

import com.era.models.CClaveprodserv;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CClaveprodservTableModel;
import java.util.List;

public class CClaveprodservTable extends BaseJTable {

   public CClaveprodservTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CClaveprodservTableModel CClaveprodservTableModel = new CClaveprodservTableModel(items,this.ShowColumns);
        this.setModel(CClaveprodservTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CClaveprodservTableModel CClaveprodservTableModel = (CClaveprodservTableModel)this.getModel();
       final List<CClaveprodserv> items_ = (List<CClaveprodserv>) CClaveprodservTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CClaveprodserv> items_ = (List<CClaveprodserv>) RepositoryFactory.getInstance().getCClaveprodservsRepository().getAll();
       final CClaveprodservTableModel CClaveprodservTableModel = new CClaveprodservTableModel(items_,this.ShowColumns);
       this.setModel(CClaveprodservTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CClaveprodserv> items_ = (List<CClaveprodserv>) RepositoryFactory.getInstance().getCClaveprodservsRepository().getByLikeEncabezados(search);
       final CClaveprodservTableModel CClaveprodservTableModel = new CClaveprodservTableModel(items_,this.ShowColumns);
       this.setModel(CClaveprodservTableModel);
   }

}