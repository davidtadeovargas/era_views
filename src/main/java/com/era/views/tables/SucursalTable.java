package com.era.views.tables;

import com.era.models.Sucursal;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SucursalTableModel;
import java.util.List;

public class SucursalTable extends BaseJTable {

   public SucursalTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SucursalTableModel SucursalTableModel = new SucursalTableModel(items,this.ShowColumns);
        this.setModel(SucursalTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SucursalTableModel SucursalTableModel = (SucursalTableModel)this.getModel();
       final List<Sucursal> items_ = (List<Sucursal>) SucursalTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Sucursal> items_ = (List<Sucursal>) RepositoryFactory.getInstance().getSucursalsRepository().getAll();
       final SucursalTableModel SucursalTableModel = new SucursalTableModel(items_,this.ShowColumns);
       this.setModel(SucursalTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getSucursalsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Sucursal Sucursal = (Sucursal)Model;

       RepositoryFactory.getInstance().getSucursalsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getSucursalsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}