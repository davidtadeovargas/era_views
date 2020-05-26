package com.era.views.tables;

import com.era.models.Termarcamodelo;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TermarcamodeloTableModel;
import java.util.List;

public class TermarcamodeloTable extends BaseJTable {

   public TermarcamodeloTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TermarcamodeloTableModel TermarcamodeloTableModel = new TermarcamodeloTableModel(items,this.ShowColumns);
        this.setModel(TermarcamodeloTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TermarcamodeloTableModel TermarcamodeloTableModel = (TermarcamodeloTableModel)this.getModel();
       final List<Termarcamodelo> items_ = (List<Termarcamodelo>) TermarcamodeloTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Termarcamodelo> items_ = (List<Termarcamodelo>) RepositoryFactory.getInstance().getTermarcamodelosRepository().getAll();
       final TermarcamodeloTableModel TermarcamodeloTableModel = new TermarcamodeloTableModel(items_,this.ShowColumns);
       this.setModel(TermarcamodeloTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTermarcamodelosRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Termarcamodelo Termarcamodelo = (Termarcamodelo)Model;

       RepositoryFactory.getInstance().getTermarcamodelosRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTermarcamodelosRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}