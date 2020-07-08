package com.era.views.tables;

import com.era.models.Lugs;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.LugsTableModel;
import java.util.List;

public class LugsTable extends BaseJTable {

   public LugsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final LugsTableModel LugsTableModel = new LugsTableModel(this,items,this.ShowColumns);
        this.setModel(LugsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final LugsTableModel LugsTableModel = (LugsTableModel)this.getModel();
       final List<Lugs> items_ = (List<Lugs>) LugsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Lugs> items_ = (List<Lugs>) RepositoryFactory.getInstance().getLugssRepository().getAll();
       final LugsTableModel LugsTableModel = new LugsTableModel(this,items_,this.ShowColumns);
       this.setModel(LugsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Lugs> items_ = (List<Lugs>) RepositoryFactory.getInstance().getLugssRepository().getByLikeEncabezados(search);
       final LugsTableModel LugsTableModel = new LugsTableModel(this,items_,this.ShowColumns);
       this.setModel(LugsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Lugs ObjectIteration_ = (Lugs)ObjectIteration;
       final Lugs ObjectToCompare_ = (Lugs)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}