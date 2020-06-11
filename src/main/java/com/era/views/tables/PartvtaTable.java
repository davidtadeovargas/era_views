package com.era.views.tables;

import com.era.models.Partvta;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartvtaTableModel;
import java.util.List;

public class PartvtaTable extends BaseJTable {

   public PartvtaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartvtaTableModel PartvtaTableModel = new PartvtaTableModel(items,this.ShowColumns);
        this.setModel(PartvtaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartvtaTableModel PartvtaTableModel = (PartvtaTableModel)this.getModel();
       final List<Partvta> items_ = (List<Partvta>) PartvtaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partvta> items_ = (List<Partvta>) RepositoryFactory.getInstance().getPartvtasRepository().getAll();
       final PartvtaTableModel PartvtaTableModel = new PartvtaTableModel(items_,this.ShowColumns);
       this.setModel(PartvtaTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Partvta> items_ = (List<Partvta>) RepositoryFactory.getInstance().getPartvtasRepository().getByLikeEncabezados(search);
       final PartvtaTableModel PartvtaTableModel = new PartvtaTableModel(items_,this.ShowColumns);
       this.setModel(PartvtaTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Partvta ObjectIteration_ = (Partvta)ObjectIteration;
       final Partvta ObjectToCompare_ = (Partvta)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}