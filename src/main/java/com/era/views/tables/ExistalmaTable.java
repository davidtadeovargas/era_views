package com.era.views.tables;

import com.era.models.Existalma;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ExistalmaTableModel;
import java.util.List;

public class ExistalmaTable extends BaseJTable {

   public ExistalmaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ExistalmaTableModel ExistalmaTableModel = new ExistalmaTableModel(items,this.ShowColumns);
        this.setModel(ExistalmaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ExistalmaTableModel ExistalmaTableModel = (ExistalmaTableModel)this.getModel();
       final List<Existalma> items_ = (List<Existalma>) ExistalmaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Existalma> items_ = (List<Existalma>) RepositoryFactory.getInstance().getExistalmasRepository().getAll();
       final ExistalmaTableModel ExistalmaTableModel = new ExistalmaTableModel(items_,this.ShowColumns);
       this.setModel(ExistalmaTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Existalma> items_ = (List<Existalma>) RepositoryFactory.getInstance().getExistalmasRepository().getByLikeEncabezados(search);
       final ExistalmaTableModel ExistalmaTableModel = new ExistalmaTableModel(items_,this.ShowColumns);
       this.setModel(ExistalmaTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Existalma ObjectIteration_ = (Existalma)ObjectIteration;
       final Existalma ObjectToCompare_ = (Existalma)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}