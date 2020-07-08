package com.era.views.tables;

import com.era.models.Model;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ModelTableModel;
import java.util.List;

public class ModelTable extends BaseJTable {

   public ModelTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ModelTableModel ModelTableModel = new ModelTableModel(this,items,this.ShowColumns);
        this.setModel(ModelTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ModelTableModel ModelTableModel = (ModelTableModel)this.getModel();
       final List<Model> items_ = (List<Model>) ModelTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Model> items_ = (List<Model>) RepositoryFactory.getInstance().getModelsRepository().getAll();
       final ModelTableModel ModelTableModel = new ModelTableModel(this,items_,this.ShowColumns);
       this.setModel(ModelTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Model> items_ = (List<Model>) RepositoryFactory.getInstance().getModelsRepository().getByLikeEncabezados(search);
       final ModelTableModel ModelTableModel = new ModelTableModel(this,items_,this.ShowColumns);
       this.setModel(ModelTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Model ObjectIteration_ = (Model)ObjectIteration;
       final Model ObjectToCompare_ = (Model)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}