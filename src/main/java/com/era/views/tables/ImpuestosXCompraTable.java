package com.era.views.tables;

import com.era.models.ImpuestosXCompra;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuestosXCompraTableModel;
import java.util.List;

public class ImpuestosXCompraTable extends BaseJTable {

   public ImpuestosXCompraTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuestosXCompraTableModel ImpuestosXCompraTableModel = new ImpuestosXCompraTableModel(items,this.ShowColumns);
        this.setModel(ImpuestosXCompraTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuestosXCompraTableModel ImpuestosXCompraTableModel = (ImpuestosXCompraTableModel)this.getModel();
       final List<ImpuestosXCompra> items_ = (List<ImpuestosXCompra>) ImpuestosXCompraTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuestosXCompra> items_ = (List<ImpuestosXCompra>) RepositoryFactory.getInstance().getImpuestosXComprasRepository().getAll();
       final ImpuestosXCompraTableModel ImpuestosXCompraTableModel = new ImpuestosXCompraTableModel(items_,this.ShowColumns);
       this.setModel(ImpuestosXCompraTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getImpuestosXComprasRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final ImpuestosXCompra ImpuestosXCompra = (ImpuestosXCompra)Model;

       RepositoryFactory.getInstance().getImpuestosXComprasRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getImpuestosXComprasRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}