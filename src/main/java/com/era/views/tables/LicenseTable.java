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
       final LicenseTableModel LicenseTableModel = new LicenseTableModel(this,items,this.ShowColumns);
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
       final LicenseTableModel LicenseTableModel = new LicenseTableModel(this,items_,this.ShowColumns);
       this.setModel(LicenseTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<License> items_ = (List<License>) RepositoryFactory.getInstance().getLicensesRepository().getByLikeEncabezados(search);
       final LicenseTableModel LicenseTableModel = new LicenseTableModel(this,items_,this.ShowColumns);
       this.setModel(LicenseTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final License ObjectIteration_ = (License)ObjectIteration;
       final License ObjectToCompare_ = (License)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}