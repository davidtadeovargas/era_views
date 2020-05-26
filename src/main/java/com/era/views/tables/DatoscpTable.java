package com.era.views.tables;

import com.era.models.Datoscp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DatoscpTableModel;
import java.util.List;

public class DatoscpTable extends BaseJTable {

   public DatoscpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DatoscpTableModel DatoscpTableModel = new DatoscpTableModel(items,this.ShowColumns);
        this.setModel(DatoscpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DatoscpTableModel DatoscpTableModel = (DatoscpTableModel)this.getModel();
       final List<Datoscp> items_ = (List<Datoscp>) DatoscpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Datoscp> items_ = (List<Datoscp>) RepositoryFactory.getInstance().getDatoscpsRepository().getAll();
       final DatoscpTableModel DatoscpTableModel = new DatoscpTableModel(items_,this.ShowColumns);
       this.setModel(DatoscpTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getDatoscpsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Datoscp Datoscp = (Datoscp)Model;

       RepositoryFactory.getInstance().getDatoscpsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getDatoscpsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}