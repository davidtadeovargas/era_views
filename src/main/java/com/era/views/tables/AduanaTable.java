package com.era.views.tables;

import com.era.models.Aduana;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AduanaTableModel;
import java.util.List;

public class AduanaTable extends BaseJTable {

   public AduanaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AduanaTableModel AduanaTableModel = new AduanaTableModel(this,items,this.ShowColumns);
        this.setModel(AduanaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AduanaTableModel AduanaTableModel = (AduanaTableModel)this.getModel();
       final List<Aduana> items_ = (List<Aduana>) AduanaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Aduana> items_ = (List<Aduana>) RepositoryFactory.getInstance().getAduanasRepository().getAll();
       final AduanaTableModel AduanaTableModel = new AduanaTableModel(this,items_,this.ShowColumns);
       this.setModel(AduanaTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Aduana> items_ = (List<Aduana>) RepositoryFactory.getInstance().getAduanasRepository().getByLikeEncabezados(search);
       final AduanaTableModel AduanaTableModel = new AduanaTableModel(this,items_,this.ShowColumns);
       this.setModel(AduanaTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Aduana ObjectIteration_ = (Aduana)ObjectIteration;
       final Aduana ObjectToCompare_ = (Aduana)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}