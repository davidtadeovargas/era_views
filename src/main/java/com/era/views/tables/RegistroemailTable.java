package com.era.views.tables;

import com.era.models.Registroemail;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.RegistroemailTableModel;
import java.util.List;

public class RegistroemailTable extends BaseJTable {

   public RegistroemailTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final RegistroemailTableModel RegistroemailTableModel = new RegistroemailTableModel(this,items,this.ShowColumns);
        this.setModel(RegistroemailTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final RegistroemailTableModel RegistroemailTableModel = (RegistroemailTableModel)this.getModel();
       final List<Registroemail> items_ = (List<Registroemail>) RegistroemailTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Registroemail> items_ = (List<Registroemail>) RepositoryFactory.getInstance().getRegistroemailsRepository().getAll();
       final RegistroemailTableModel RegistroemailTableModel = new RegistroemailTableModel(this,items_,this.ShowColumns);
       this.setModel(RegistroemailTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Registroemail> items_ = (List<Registroemail>) RepositoryFactory.getInstance().getRegistroemailsRepository().getByLikeEncabezados(search);
       final RegistroemailTableModel RegistroemailTableModel = new RegistroemailTableModel(this,items_,this.ShowColumns);
       this.setModel(RegistroemailTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Registroemail ObjectIteration_ = (Registroemail)ObjectIteration;
       final Registroemail ObjectToCompare_ = (Registroemail)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}