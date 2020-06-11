package com.era.views.tables;

import com.era.models.Kits;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.KitsTableModel;
import java.util.List;

public class KitsTable extends BaseJTable {

   public KitsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final KitsTableModel KitsTableModel = new KitsTableModel(items,this.ShowColumns);
        this.setModel(KitsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final KitsTableModel KitsTableModel = (KitsTableModel)this.getModel();
       final List<Kits> items_ = (List<Kits>) KitsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Kits> items_ = (List<Kits>) RepositoryFactory.getInstance().getKitssRepository().getAll();
       final KitsTableModel KitsTableModel = new KitsTableModel(items_,this.ShowColumns);
       this.setModel(KitsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Kits> items_ = (List<Kits>) RepositoryFactory.getInstance().getKitssRepository().getByLikeEncabezados(search);
       final KitsTableModel KitsTableModel = new KitsTableModel(items_,this.ShowColumns);
       this.setModel(KitsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Kits ObjectIteration_ = (Kits)ObjectIteration;
       final Kits ObjectToCompare_ = (Kits)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}