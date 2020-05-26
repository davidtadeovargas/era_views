package com.era.views.tables;

import com.era.models.Zona;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ZonaTableModel;
import java.util.List;

public class ZonaTable extends BaseJTable {

   public ZonaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ZonaTableModel ZonaTableModel = new ZonaTableModel(items,this.ShowColumns);
        this.setModel(ZonaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ZonaTableModel ZonaTableModel = (ZonaTableModel)this.getModel();
       final List<Zona> items_ = (List<Zona>) ZonaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Zona> items_ = (List<Zona>) RepositoryFactory.getInstance().getZonasRepository().getAll();
       final ZonaTableModel ZonaTableModel = new ZonaTableModel(items_,this.ShowColumns);
       this.setModel(ZonaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getZonasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Zona Zona = (Zona)Model;

       RepositoryFactory.getInstance().getZonasRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getZonasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}