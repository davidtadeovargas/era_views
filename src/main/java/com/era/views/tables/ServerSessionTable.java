package com.era.views.tables;

import com.era.models.ServerSession;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ServerSessionTableModel;
import java.util.List;

public class ServerSessionTable extends BaseJTable {

   public ServerSessionTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ServerSessionTableModel ServerSessionTableModel = new ServerSessionTableModel(items,this.ShowColumns);
        this.setModel(ServerSessionTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ServerSessionTableModel ServerSessionTableModel = (ServerSessionTableModel)this.getModel();
       final List<ServerSession> items_ = (List<ServerSession>) ServerSessionTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ServerSession> items_ = (List<ServerSession>) RepositoryFactory.getInstance().getServerSessionsRepository().getAll();
       final ServerSessionTableModel ServerSessionTableModel = new ServerSessionTableModel(items_,this.ShowColumns);
       this.setModel(ServerSessionTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ServerSession> items_ = (List<ServerSession>) RepositoryFactory.getInstance().getServerSessionsRepository().getByLikeEncabezados(search);
       final ServerSessionTableModel ServerSessionTableModel = new ServerSessionTableModel(items_,this.ShowColumns);
       this.setModel(ServerSessionTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final ServerSession ObjectIteration_ = (ServerSession)ObjectIteration;
       final ServerSession ObjectToCompare_ = (ServerSession)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCode().compareTo(ObjectToCompare_.getCode())==0;
    }
}