package com.era.views.tables;

import com.era.models.ImpuestosVenta;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuestosVentaTableModel;
import java.util.List;

public class ImpuestosVentaTable extends BaseJTable {

   public ImpuestosVentaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuestosVentaTableModel ImpuestosVentaTableModel = new ImpuestosVentaTableModel(items,this.ShowColumns);
        this.setModel(ImpuestosVentaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuestosVentaTableModel ImpuestosVentaTableModel = (ImpuestosVentaTableModel)this.getModel();
       final List<ImpuestosVenta> items_ = (List<ImpuestosVenta>) ImpuestosVentaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuestosVenta> items_ = (List<ImpuestosVenta>) RepositoryFactory.getInstance().getImpuestosVentasRepository().getAll();
       final ImpuestosVentaTableModel ImpuestosVentaTableModel = new ImpuestosVentaTableModel(items_,this.ShowColumns);
       this.setModel(ImpuestosVentaTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getImpuestosVentasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final ImpuestosVenta ImpuestosVenta = (ImpuestosVenta)Model_;

       RepositoryFactory.getInstance().getImpuestosVentasRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getImpuestosVentasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}