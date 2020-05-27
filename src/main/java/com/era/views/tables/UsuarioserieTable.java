package com.era.views.tables;

import com.era.models.Usuarioserie;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.UsuarioserieTableModel;
import java.util.List;

public class UsuarioserieTable extends BaseJTable {

   public UsuarioserieTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final UsuarioserieTableModel UsuarioserieTableModel = new UsuarioserieTableModel(items,this.ShowColumns);
        this.setModel(UsuarioserieTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final UsuarioserieTableModel UsuarioserieTableModel = (UsuarioserieTableModel)this.getModel();
       final List<Usuarioserie> items_ = (List<Usuarioserie>) UsuarioserieTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Usuarioserie> items_ = (List<Usuarioserie>) RepositoryFactory.getInstance().getUsuarioseriesRepository().getAll();
       final UsuarioserieTableModel UsuarioserieTableModel = new UsuarioserieTableModel(items_,this.ShowColumns);
       this.setModel(UsuarioserieTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getUsuarioseriesRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Usuarioserie Usuarioserie = (Usuarioserie)Model_;

       RepositoryFactory.getInstance().getUsuarioseriesRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getUsuarioseriesRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}