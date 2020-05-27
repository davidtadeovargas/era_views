package com.era.views.tables;

import com.era.models.Controlexportar;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ControlexportarTableModel;
import java.util.List;

public class ControlexportarTable extends BaseJTable {

   public ControlexportarTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ControlexportarTableModel ControlexportarTableModel = new ControlexportarTableModel(items,this.ShowColumns);
        this.setModel(ControlexportarTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ControlexportarTableModel ControlexportarTableModel = (ControlexportarTableModel)this.getModel();
       final List<Controlexportar> items_ = (List<Controlexportar>) ControlexportarTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Controlexportar> items_ = (List<Controlexportar>) RepositoryFactory.getInstance().getControlexportarsRepository().getAll();
       final ControlexportarTableModel ControlexportarTableModel = new ControlexportarTableModel(items_,this.ShowColumns);
       this.setModel(ControlexportarTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getControlexportarsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Controlexportar Controlexportar = (Controlexportar)Model_;

       RepositoryFactory.getInstance().getControlexportarsRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getControlexportarsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}