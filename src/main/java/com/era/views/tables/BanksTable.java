package com.era.views.tables;

import com.era.models.Banco;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.BancoTableModel;
import java.util.List;

public class BanksTable extends BaseJTable {

   public BanksTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final BancoTableModel BancoTableModel = new BancoTableModel(this,items,this.ShowColumns);
        this.setModel(BancoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final BancoTableModel BancoTableModel = (BancoTableModel)this.getModel();
       final List<Banco> items_ = (List<Banco>) BancoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Banco> items_ = (List<Banco>) RepositoryFactory.getInstance().getBancosRepository().getAll();
       final BancoTableModel BancoTableModel = new BancoTableModel(this,items_,this.ShowColumns);
       this.setModel(BancoTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Banco> items_ = (List<Banco>) RepositoryFactory.getInstance().getBancosRepository().getByLikeEncabezados(search);
       final BancoTableModel AnaqsTableModel = new BancoTableModel(this,items_,this.ShowColumns);
       this.setModel(AnaqsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Banco ObjectIteration_ = (Banco)ObjectIteration;
       final Banco ObjectToCompare_ = (Banco)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}