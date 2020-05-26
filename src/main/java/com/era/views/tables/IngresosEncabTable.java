package com.era.views.tables;

import com.era.models.IngresosEncab;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.IngresosEncabTableModel;
import java.util.List;

public class IngresosEncabTable extends BaseJTable {

   public IngresosEncabTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final IngresosEncabTableModel IngresosEncabTableModel = new IngresosEncabTableModel(items,this.ShowColumns);
        this.setModel(IngresosEncabTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final IngresosEncabTableModel IngresosEncabTableModel = (IngresosEncabTableModel)this.getModel();
       final List<IngresosEncab> items_ = (List<IngresosEncab>) IngresosEncabTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<IngresosEncab> items_ = (List<IngresosEncab>) RepositoryFactory.getInstance().getIngresosEncabsRepository().getAll();
       final IngresosEncabTableModel IngresosEncabTableModel = new IngresosEncabTableModel(items_,this.ShowColumns);
       this.setModel(IngresosEncabTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getIngresosEncabsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final IngresosEncab IngresosEncab = (IngresosEncab)Model;

       RepositoryFactory.getInstance().getIngresosEncabsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getIngresosEncabsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}