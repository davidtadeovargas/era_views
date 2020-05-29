package com.era.views.tables;

import com.era.models.Prodpart;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ProdpartTableModel;
import java.util.List;

public class ProdpartTable extends BaseJTable {

   public ProdpartTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ProdpartTableModel ProdpartTableModel = new ProdpartTableModel(items,this.ShowColumns);
        this.setModel(ProdpartTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ProdpartTableModel ProdpartTableModel = (ProdpartTableModel)this.getModel();
       final List<Prodpart> items_ = (List<Prodpart>) ProdpartTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Prodpart> items_ = (List<Prodpart>) RepositoryFactory.getInstance().getProdpartsRepository().getAll();
       final ProdpartTableModel ProdpartTableModel = new ProdpartTableModel(items_,this.ShowColumns);
       this.setModel(ProdpartTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Prodpart> items_ = (List<Prodpart>) RepositoryFactory.getInstance().getProdpartsRepository().getByLikeEncabezados(search);
       final ProdpartTableModel ProdpartTableModel = new ProdpartTableModel(items_,this.ShowColumns);
       this.setModel(ProdpartTableModel);
   }

}