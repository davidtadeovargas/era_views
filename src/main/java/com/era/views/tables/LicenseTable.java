package com.era.views.tables;

import com.era.models.License;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.LicenseTableModel;
import java.util.List;

public class LicenseTable extends BaseJTable {

   public LicenseTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final LicenseTableModel LicenseTableModel = new LicenseTableModel(items,this.ShowColumns);
        this.setModel(LicenseTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final LicenseTableModel LicenseTableModel = (LicenseTableModel)this.getModel();
       final List<License> items_ = (List<License>) LicenseTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<License> items_ = (List<License>) RepositoryFactory.getInstance().getLicensesRepository().getAll();
       final LicenseTableModel LicenseTableModel = new LicenseTableModel(items_,this.ShowColumns);
       this.setModel(LicenseTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getLicensesRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final License License = (License)Model_;

       RepositoryFactory.getInstance().getLicensesRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getLicensesRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}