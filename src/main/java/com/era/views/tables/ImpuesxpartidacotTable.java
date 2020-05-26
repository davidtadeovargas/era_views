package com.era.views.tables;

import com.era.models.Impuesxpartidacot;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuesxpartidacotTableModel;
import java.util.List;

public class ImpuesxpartidacotTable extends BaseJTable {

   public ImpuesxpartidacotTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuesxpartidacotTableModel ImpuesxpartidacotTableModel = new ImpuesxpartidacotTableModel(items,this.ShowColumns);
        this.setModel(ImpuesxpartidacotTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuesxpartidacotTableModel ImpuesxpartidacotTableModel = (ImpuesxpartidacotTableModel)this.getModel();
       final List<Impuesxpartidacot> items_ = (List<Impuesxpartidacot>) ImpuesxpartidacotTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Impuesxpartidacot> items_ = (List<Impuesxpartidacot>) RepositoryFactory.getInstance().getImpuesxpartidacotsRepository().getAll();
       final ImpuesxpartidacotTableModel ImpuesxpartidacotTableModel = new ImpuesxpartidacotTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesxpartidacotTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getImpuesxpartidacotsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final Impuesxpartidacot Impuesxpartidacot = (Impuesxpartidacot)Model;

       RepositoryFactory.getInstance().getImpuesxpartidacotsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getImpuesxpartidacotsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}