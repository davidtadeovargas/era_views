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
       final GeneralConfigTableModel GeneralConfigTableModel = new GeneralConfigTableModel(items,this.ShowColumns);
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
       final GeneralConfigTableModel GeneralConfigTableModel = new GeneralConfigTableModel(items_,this.ShowColumns);
       this.setModel(GeneralConfigTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getGeneralConfigsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final GeneralConfig GeneralConfig = (GeneralConfig)Model_;

       RepositoryFactory.getInstance().getGeneralConfigsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getGeneralConfigsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}