package com.era.views.tables;

import com.era.models.Pes;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PesTableModel;
import java.util.List;

public class PesTable extends BaseJTable {

   public PesTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PesTableModel PesTableModel = new PesTableModel(items,this.ShowColumns);
        this.setModel(PesTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PesTableModel PesTableModel = (PesTableModel)this.getModel();
       final List<Pes> items_ = (List<Pes>) PesTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Pes> items_ = (List<Pes>) RepositoryFactory.getInstance().getPessRepository().getAll();
       final PesTableModel PesTableModel = new PesTableModel(items_,this.ShowColumns);
       this.setModel(PesTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Pes> items_ = (List<Pes>) RepositoryFactory.getInstance().getPessRepository().getByLikeEncabezados(search);
       final PesTableModel PesTableModel = new PesTableModel(items_,this.ShowColumns);
       this.setModel(PesTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Pes ObjectIteration_ = (Pes)ObjectIteration;
       final Pes ObjectToCompare_ = (Pes)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}