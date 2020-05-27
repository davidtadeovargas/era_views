package com.era.views.tables;

import com.era.models.Terprodcompa;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TerprodcompaTableModel;
import java.util.List;

public class TerprodcompaTable extends BaseJTable {

   public TerprodcompaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TerprodcompaTableModel TerprodcompaTableModel = new TerprodcompaTableModel(items,this.ShowColumns);
        this.setModel(TerprodcompaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TerprodcompaTableModel TerprodcompaTableModel = (TerprodcompaTableModel)this.getModel();
       final List<Terprodcompa> items_ = (List<Terprodcompa>) TerprodcompaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Terprodcompa> items_ = (List<Terprodcompa>) RepositoryFactory.getInstance().getTerprodcompasRepository().getAll();
       final TerprodcompaTableModel TerprodcompaTableModel = new TerprodcompaTableModel(items_,this.ShowColumns);
       this.setModel(TerprodcompaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getTerprodcompasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Terprodcompa Terprodcompa = (Terprodcompa)Model_;

       RepositoryFactory.getInstance().getTerprodcompasRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getTerprodcompasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}