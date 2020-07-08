package com.era.views.tables;

import com.era.models.GeneralConfig;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.GeneralConfigTableModel;
import java.util.List;

public class GeneralConfigTable extends BaseJTable {

   public GeneralConfigTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final GeneralConfigTableModel GeneralConfigTableModel = new GeneralConfigTableModel(this,items,this.ShowColumns);
        this.setModel(GeneralConfigTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final GeneralConfigTableModel GeneralConfigTableModel = (GeneralConfigTableModel)this.getModel();
       final List<GeneralConfig> items_ = (List<GeneralConfig>) GeneralConfigTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<GeneralConfig> items_ = (List<GeneralConfig>) RepositoryFactory.getInstance().getGeneralConfigsRepository().getAll();
       final GeneralConfigTableModel GeneralConfigTableModel = new GeneralConfigTableModel(this,items_,this.ShowColumns);
       this.setModel(GeneralConfigTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<GeneralConfig> items_ = (List<GeneralConfig>) RepositoryFactory.getInstance().getGeneralConfigsRepository().getByLikeEncabezados(search);
       final GeneralConfigTableModel GeneralConfigTableModel = new GeneralConfigTableModel(this,items_,this.ShowColumns);
       this.setModel(GeneralConfigTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final GeneralConfig ObjectIteration_ = (GeneralConfig)ObjectIteration;
       final GeneralConfig ObjectToCompare_ = (GeneralConfig)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}