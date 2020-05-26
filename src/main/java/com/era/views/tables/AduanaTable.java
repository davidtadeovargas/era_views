package com.era.views.tables;

import com.era.models.Aduana;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AduanaTableModel;
import java.util.List;

public class AduanaTable extends BaseJTable {

   public AduanaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AduanaTableModel AduanaTableModel = new AduanaTableModel(items,this.ShowColumns);
        this.setModel(AduanaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AduanaTableModel AduanaTableModel = (AduanaTableModel)this.getModel();
       final List<Aduana> items_ = (List<Aduana>) AduanaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Aduana> items_ = (List<Aduana>) RepositoryFactory.getInstance().getAduanasRepository().getAll();
       final AduanaTableModel AduanaTableModel = new AduanaTableModel(items_,this.ShowColumns);
       this.setModel(AduanaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getAduanasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Aduana Aduana = (Aduana)Model;

       RepositoryFactory.getInstance().getAduanasRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getAduanasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}