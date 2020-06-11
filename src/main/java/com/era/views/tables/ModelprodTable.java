package com.era.views.tables;

import com.era.models.Modelprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ModelprodTableModel;
import java.util.List;

public class ModelprodTable extends BaseJTable {

   public ModelprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ModelprodTableModel ModelprodTableModel = new ModelprodTableModel(items,this.ShowColumns);
        this.setModel(ModelprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ModelprodTableModel ModelprodTableModel = (ModelprodTableModel)this.getModel();
       final List<Modelprod> items_ = (List<Modelprod>) ModelprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Modelprod> items_ = (List<Modelprod>) RepositoryFactory.getInstance().getModelprodsRepository().getAll();
       final ModelprodTableModel ModelprodTableModel = new ModelprodTableModel(items_,this.ShowColumns);
       this.setModel(ModelprodTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Modelprod> items_ = (List<Modelprod>) RepositoryFactory.getInstance().getModelprodsRepository().getByLikeEncabezados(search);
       final ModelprodTableModel ModelprodTableModel = new ModelprodTableModel(items_,this.ShowColumns);
       this.setModel(ModelprodTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Modelprod ObjectIteration_ = (Modelprod)ObjectIteration;
       final Modelprod ObjectToCompare_ = (Modelprod)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}