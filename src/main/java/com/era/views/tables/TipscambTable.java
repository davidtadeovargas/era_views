package com.era.views.tables;

import com.era.models.Tipscamb;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TipscambTableModel;
import java.util.List;

public class TipscambTable extends BaseJTable {

   public TipscambTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TipscambTableModel TipscambTableModel = new TipscambTableModel(items,this.ShowColumns);
        this.setModel(TipscambTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TipscambTableModel TipscambTableModel = (TipscambTableModel)this.getModel();
       final List<Tipscamb> items_ = (List<Tipscamb>) TipscambTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Tipscamb> items_ = (List<Tipscamb>) RepositoryFactory.getInstance().getTipscambsRepository().getAll();
       final TipscambTableModel TipscambTableModel = new TipscambTableModel(items_,this.ShowColumns);
       this.setModel(TipscambTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Tipscamb> items_ = (List<Tipscamb>) RepositoryFactory.getInstance().getTipscambsRepository().getByLikeEncabezados(search);
       final TipscambTableModel TipscambTableModel = new TipscambTableModel(items_,this.ShowColumns);
       this.setModel(TipscambTableModel);
   }

}