package com.era.views.tables;

import com.era.models.Resplog;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ResplogTableModel;
import java.util.List;

public class ResplogTable extends BaseJTable {

   public ResplogTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ResplogTableModel ResplogTableModel = new ResplogTableModel(items,this.ShowColumns);
        this.setModel(ResplogTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ResplogTableModel ResplogTableModel = (ResplogTableModel)this.getModel();
       final List<Resplog> items_ = (List<Resplog>) ResplogTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Resplog> items_ = (List<Resplog>) RepositoryFactory.getInstance().getResplogsRepository().getAll();
       final ResplogTableModel ResplogTableModel = new ResplogTableModel(items_,this.ShowColumns);
       this.setModel(ResplogTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Resplog> items_ = (List<Resplog>) RepositoryFactory.getInstance().getResplogsRepository().getByLikeEncabezados(search);
       final ResplogTableModel ResplogTableModel = new ResplogTableModel(items_,this.ShowColumns);
       this.setModel(ResplogTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Resplog ObjectIteration_ = (Resplog)ObjectIteration;
       final Resplog ObjectToCompare_ = (Resplog)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}