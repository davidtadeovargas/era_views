package com.era.views.tables;

import com.era.models.CFDIRelacionadosPago;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CFDIRelacionadosPagoTableModel;
import java.util.List;

public class CFDIRelacionadosPagoTable extends BaseJTable {

   public CFDIRelacionadosPagoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CFDIRelacionadosPagoTableModel CFDIRelacionadosPagoTableModel = new CFDIRelacionadosPagoTableModel(items,this.ShowColumns);
        this.setModel(CFDIRelacionadosPagoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CFDIRelacionadosPagoTableModel CFDIRelacionadosPagoTableModel = (CFDIRelacionadosPagoTableModel)this.getModel();
       final List<CFDIRelacionadosPago> items_ = (List<CFDIRelacionadosPago>) CFDIRelacionadosPagoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CFDIRelacionadosPago> items_ = (List<CFDIRelacionadosPago>) RepositoryFactory.getInstance().getCFDIRelacionadosPagosRepository().getAll();
       final CFDIRelacionadosPagoTableModel CFDIRelacionadosPagoTableModel = new CFDIRelacionadosPagoTableModel(items_,this.ShowColumns);
       this.setModel(CFDIRelacionadosPagoTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCFDIRelacionadosPagosRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final CFDIRelacionadosPago CFDIRelacionadosPago = (CFDIRelacionadosPago)Model;

       RepositoryFactory.getInstance().getCFDIRelacionadosPagosRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCFDIRelacionadosPagosRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}