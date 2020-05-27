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
       final ModelTableModel ModelTableModel = new ModelTableModel(items,this.ShowColumns);
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
       final ModelTableModel ModelTableModel = new ModelTableModel(items_,this.ShowColumns);
       this.setModel(ModelTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getModelsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Model Model = (Model)Model_;

       RepositoryFactory.getInstance().getModelsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getModelsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}