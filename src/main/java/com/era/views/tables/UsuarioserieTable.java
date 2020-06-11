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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Usuarioserie> items_ = (List<Usuarioserie>) RepositoryFactory.getInstance().getUsuarioseriesRepository().getByLikeEncabezados(search);
       final UsuarioserieTableModel UsuarioserieTableModel = new UsuarioserieTableModel(items_,this.ShowColumns);
       this.setModel(UsuarioserieTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Usuarioserie ObjectIteration_ = (Usuarioserie)ObjectIteration;
       final Usuarioserie ObjectToCompare_ = (Usuarioserie)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getIdserie() == ObjectToCompare_.getIdserie();
    }
}