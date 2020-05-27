package com.era.views.tables;

import com.era.models.ImpuestosXVenta;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuestosXVentaTableModel;
import java.util.List;

public class ImpuestosXVentaTable extends BaseJTable {

   public ImpuestosXVentaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = new ImpuestosXVentaTableModel(items,this.ShowColumns);
        this.setModel(ImpuestosXVentaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = (ImpuestosXVentaTableModel)this.getModel();
       final List<ImpuestosXVenta> items_ = (List<ImpuestosXVenta>) ImpuestosXVentaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuestosXVenta> items_ = (List<ImpuestosXVenta>) RepositoryFactory.getInstance().getImpuestosXVentasRepository().getAll();
       final ImpuestosXVentaTableModel ImpuestosXVentaTableModel = new ImpuestosXVentaTableModel(items_,this.ShowColumns);
       this.setModel(ImpuestosXVentaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getImpuestosXVentasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final ImpuestosXVenta ImpuestosXVenta = (ImpuestosXVenta)Model_;

       RepositoryFactory.getInstance().getImpuestosXVentasRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getImpuestosXVentasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}