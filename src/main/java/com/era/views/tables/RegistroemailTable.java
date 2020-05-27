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
       final RegistroemailTableModel RegistroemailTableModel = new RegistroemailTableModel(items,this.ShowColumns);
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
       final RegistroemailTableModel RegistroemailTableModel = new RegistroemailTableModel(items_,this.ShowColumns);
       this.setModel(RegistroemailTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getRegistroemailsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Registroemail Registroemail = (Registroemail)Model_;

       RepositoryFactory.getInstance().getRegistroemailsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getRegistroemailsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}