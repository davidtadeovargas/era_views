package com.era.views.tables;

import com.era.models.Auxiliar;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AuxiliarTableModel;
import java.util.List;

public class AuxiliarTable extends BaseJTable {

   public AuxiliarTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AuxiliarTableModel AuxiliarTableModel = new AuxiliarTableModel(items,this.ShowColumns);
        this.setModel(AuxiliarTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AuxiliarTableModel AuxiliarTableModel = (AuxiliarTableModel)this.getModel();
       final List<Auxiliar> items_ = (List<Auxiliar>) AuxiliarTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Auxiliar> items_ = (List<Auxiliar>) RepositoryFactory.getInstance().getAuxiliarsRepository().getAll();
       final AuxiliarTableModel AuxiliarTableModel = new AuxiliarTableModel(items_,this.ShowColumns);
       this.setModel(AuxiliarTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getAuxiliarsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Auxiliar Auxiliar = (Auxiliar)Model_;

       RepositoryFactory.getInstance().getAuxiliarsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getAuxiliarsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}