package com.era.views.tables;

import com.era.models.Estadiscor;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.EstadiscorTableModel;
import java.util.List;

public class EstadiscorTable extends BaseJTable {

   public EstadiscorTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final EstadiscorTableModel EstadiscorTableModel = new EstadiscorTableModel(items,this.ShowColumns);
        this.setModel(EstadiscorTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final EstadiscorTableModel EstadiscorTableModel = (EstadiscorTableModel)this.getModel();
       final List<Estadiscor> items_ = (List<Estadiscor>) EstadiscorTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Estadiscor> items_ = (List<Estadiscor>) RepositoryFactory.getInstance().getEstadiscorsRepository().getAll();
       final EstadiscorTableModel EstadiscorTableModel = new EstadiscorTableModel(items_,this.ShowColumns);
       this.setModel(EstadiscorTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Estadiscor> items_ = (List<Estadiscor>) RepositoryFactory.getInstance().getEstadiscorsRepository().getByLikeEncabezados(search);
       final EstadiscorTableModel EstadiscorTableModel = new EstadiscorTableModel(items_,this.ShowColumns);
       this.setModel(EstadiscorTableModel);
   }

}