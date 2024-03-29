package com.era.views.tables;

import com.era.models.Pers;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PersTableModel;
import java.util.List;

public class PersTable extends BaseJTable {

   public PersTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PersTableModel PersTableModel = new PersTableModel(this,items,this.ShowColumns);
        this.setModel(PersTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PersTableModel PersTableModel = (PersTableModel)this.getModel();
       final List<Pers> items_ = (List<Pers>) PersTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Pers> items_ = (List<Pers>) RepositoryFactory.getInstance().getPerssRepository().getAll();
       final PersTableModel PersTableModel = new PersTableModel(this,items_,this.ShowColumns);
       this.setModel(PersTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Pers> items_ = (List<Pers>) RepositoryFactory.getInstance().getPerssRepository().getByLikeEncabezados(search);
       final PersTableModel PersTableModel = new PersTableModel(this,items_,this.ShowColumns);
       this.setModel(PersTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Pers ObjectIteration_ = (Pers)ObjectIteration;
       final Pers ObjectToCompare_ = (Pers)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}