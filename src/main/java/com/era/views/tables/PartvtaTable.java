package com.era.views.tables;

import com.era.models.Partvta;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.PartvtaTableModel;
import java.util.List;

public class PartvtaTable extends BaseJTable {

   public PartvtaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final PartvtaTableModel PartvtaTableModel = new PartvtaTableModel(items,this.ShowColumns);
        this.setModel(PartvtaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final PartvtaTableModel PartvtaTableModel = (PartvtaTableModel)this.getModel();
       final List<Partvta> items_ = (List<Partvta>) PartvtaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Partvta> items_ = (List<Partvta>) RepositoryFactory.getInstance().getPartvtasRepository().getAll();
       final PartvtaTableModel PartvtaTableModel = new PartvtaTableModel(items_,this.ShowColumns);
       this.setModel(PartvtaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getPartvtasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Partvta Partvta = (Partvta)Model_;

       RepositoryFactory.getInstance().getPartvtasRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getPartvtasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}