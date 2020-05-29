package com.era.views.tables;

import com.era.models.Termarcamodelo;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TermarcamodeloTableModel;
import java.util.List;

public class TermarcamodeloTable extends BaseJTable {

   public TermarcamodeloTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TermarcamodeloTableModel TermarcamodeloTableModel = new TermarcamodeloTableModel(items,this.ShowColumns);
        this.setModel(TermarcamodeloTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TermarcamodeloTableModel TermarcamodeloTableModel = (TermarcamodeloTableModel)this.getModel();
       final List<Termarcamodelo> items_ = (List<Termarcamodelo>) TermarcamodeloTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Termarcamodelo> items_ = (List<Termarcamodelo>) RepositoryFactory.getInstance().getTermarcamodelosRepository().getAll();
       final TermarcamodeloTableModel TermarcamodeloTableModel = new TermarcamodeloTableModel(items_,this.ShowColumns);
       this.setModel(TermarcamodeloTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Termarcamodelo> items_ = (List<Termarcamodelo>) RepositoryFactory.getInstance().getTermarcamodelosRepository().getByLikeEncabezados(search);
       final TermarcamodeloTableModel TermarcamodeloTableModel = new TermarcamodeloTableModel(items_,this.ShowColumns);
       this.setModel(TermarcamodeloTableModel);
   }

}