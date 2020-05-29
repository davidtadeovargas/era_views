package com.era.views.tables;

import com.era.models.ERPermisos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ERPermisosTableModel;
import java.util.List;

public class ERPermisosTable extends BaseJTable {

   public ERPermisosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ERPermisosTableModel ERPermisosTableModel = new ERPermisosTableModel(items,this.ShowColumns);
        this.setModel(ERPermisosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ERPermisosTableModel ERPermisosTableModel = (ERPermisosTableModel)this.getModel();
       final List<ERPermisos> items_ = (List<ERPermisos>) ERPermisosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ERPermisos> items_ = (List<ERPermisos>) RepositoryFactory.getInstance().getERPermisossRepository().getAll();
       final ERPermisosTableModel ERPermisosTableModel = new ERPermisosTableModel(items_,this.ShowColumns);
       this.setModel(ERPermisosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ERPermisos> items_ = (List<ERPermisos>) RepositoryFactory.getInstance().getERPermisossRepository().getByLikeEncabezados(search);
       final ERPermisosTableModel ERPermisosTableModel = new ERPermisosTableModel(items_,this.ShowColumns);
       this.setModel(ERPermisosTableModel);
   }

}