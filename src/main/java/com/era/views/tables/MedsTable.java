package com.era.views.tables;

import com.era.models.Meds;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MedsTableModel;
import java.util.List;

public class MedsTable extends BaseJTable {

   public MedsTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MedsTableModel MedsTableModel = new MedsTableModel(items,this.ShowColumns);
        this.setModel(MedsTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MedsTableModel MedsTableModel = (MedsTableModel)this.getModel();
       final List<Meds> items_ = (List<Meds>) MedsTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Meds> items_ = (List<Meds>) RepositoryFactory.getInstance().getMedssRepository().getAll();
       final MedsTableModel MedsTableModel = new MedsTableModel(items_,this.ShowColumns);
       this.setModel(MedsTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getMedssRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Meds Meds = (Meds)Model_;

       RepositoryFactory.getInstance().getMedssRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getMedssRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}