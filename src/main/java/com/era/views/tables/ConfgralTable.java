package com.era.views.tables;

import com.era.models.Confgral;
import com.era.models.Consec;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ConfgralTableModel;
import java.util.List;

public class ConfgralTable extends BaseJTable {

   public ConfgralTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ConfgralTableModel ConfgralTableModel = new ConfgralTableModel(this,items,this.ShowColumns);
        this.setModel(ConfgralTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ConfgralTableModel ConfgralTableModel = (ConfgralTableModel)this.getModel();
       final List<Confgral> items_ = (List<Confgral>) ConfgralTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Confgral> items_ = (List<Confgral>) RepositoryFactory.getInstance().getConfgralRepository().getAll();
       final ConfgralTableModel ConfgralTableModel = new ConfgralTableModel(this,items_,this.ShowColumns);
       this.setModel(ConfgralTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Confgral> items_ = (List<Confgral>) RepositoryFactory.getInstance().getConfgralRepository().getByLikeEncabezados(search);
       final ConfgralTableModel ConfgralTableModel = new ConfgralTableModel(this,items_,this.ShowColumns);
       this.setModel(ConfgralTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Confgral ObjectIteration_ = (Confgral)ObjectIteration;
       final Confgral ObjectToCompare_ = (Confgral)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}