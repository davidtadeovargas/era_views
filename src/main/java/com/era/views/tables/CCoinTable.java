package com.era.views.tables;

import com.era.models.CCoin;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CCoinTableModel;
import java.util.List;

public class CCoinTable extends BaseJTable {

   public CCoinTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(items,this.ShowColumns);
        this.setModel(CCoinTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CCoinTableModel CCoinTableModel = (CCoinTableModel)this.getModel();
       final List<CCoin> items_ = (List<CCoin>) CCoinTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CCoin> items_ = (List<CCoin>) RepositoryFactory.getInstance().getCCoinsRepository().getAll();
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(items_,this.ShowColumns);
       this.setModel(CCoinTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CCoin> items_ = (List<CCoin>) RepositoryFactory.getInstance().getCCoinsRepository().getByLikeEncabezados(search);
       final CCoinTableModel CCoinTableModel = new CCoinTableModel(items_,this.ShowColumns);
       this.setModel(CCoinTableModel);
   }

}