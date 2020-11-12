package com.era.views.tables;

import com.era.models.Meds;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MedsTableModel;
import java.util.List;

public class MedsTable extends BaseJTable {

   public MedsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MedsTableModel MedsTableModel = new MedsTableModel(this,items,this.ShowColumns);
        this.setModel(MedsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MedsTableModel MedsTableModel = (MedsTableModel)this.getModel();
       final List<Meds> items_ = (List<Meds>) MedsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Meds> items_ = (List<Meds>) RepositoryFactory.getInstance().getMedssRepository().getAll();
       final MedsTableModel MedsTableModel = new MedsTableModel(this,items_,this.ShowColumns);
       this.setModel(MedsTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Meds> items_ = (List<Meds>) RepositoryFactory.getInstance().getMedssRepository().getByLikeEncabezados(search);
       final MedsTableModel MedsTableModel = new MedsTableModel(this,items_,this.ShowColumns);
       this.setModel(MedsTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Meds ObjectIteration_ = (Meds)ObjectIteration;
       final Meds ObjectToCompare_ = (Meds)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}