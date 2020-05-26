package com.era.views.tables;

import com.era.models.EREjercicios;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.EREjerciciosTableModel;
import java.util.List;

public class EREjerciciosTable extends BaseJTable {

   public EREjerciciosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final EREjerciciosTableModel EREjerciciosTableModel = new EREjerciciosTableModel(items,this.ShowColumns);
        this.setModel(EREjerciciosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final EREjerciciosTableModel EREjerciciosTableModel = (EREjerciciosTableModel)this.getModel();
       final List<EREjercicios> items_ = (List<EREjercicios>) EREjerciciosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<EREjercicios> items_ = (List<EREjercicios>) RepositoryFactory.getInstance().getEREjerciciossRepository().getAll();
       final EREjerciciosTableModel EREjerciciosTableModel = new EREjerciciosTableModel(items_,this.ShowColumns);
       this.setModel(EREjerciciosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getEREjerciciossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final EREjercicios EREjercicios = (EREjercicios)Model;

       RepositoryFactory.getInstance().getEREjerciciossRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getEREjerciciossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}