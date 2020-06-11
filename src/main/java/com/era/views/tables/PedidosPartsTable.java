package com.era.views.tables;

import com.era.models.PedidosParts;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PedidosPartsTableModel;
import java.util.List;

public class PedidosPartsTable extends BaseJTable {

   public PedidosPartsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PedidosPartsTableModel PedidosPartsTableModel = new PedidosPartsTableModel(items,this.ShowColumns);
        this.setModel(PedidosPartsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PedidosPartsTableModel PedidosPartsTableModel = (PedidosPartsTableModel)this.getModel();
       final List<PedidosParts> items_ = (List<PedidosParts>) PedidosPartsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<PedidosParts> items_ = (List<PedidosParts>) RepositoryFactory.getInstance().getPedidosPartssRepository().getAll();
       final PedidosPartsTableModel PedidosPartsTableModel = new PedidosPartsTableModel(items_,this.ShowColumns);
       this.setModel(PedidosPartsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<PedidosParts> items_ = (List<PedidosParts>) RepositoryFactory.getInstance().getPedidosPartssRepository().getByLikeEncabezados(search);
       final PedidosPartsTableModel PedidosPartsTableModel = new PedidosPartsTableModel(items_,this.ShowColumns);
       this.setModel(PedidosPartsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final PedidosParts ObjectIteration_ = (PedidosParts)ObjectIteration;
       final PedidosParts ObjectToCompare_ = (PedidosParts)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}