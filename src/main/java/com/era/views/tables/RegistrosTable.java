package com.era.views.tables;

import com.era.models.Registros;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.RegistrosTableModel;
import java.util.List;

public class RegistrosTable extends BaseJTable {

   public RegistrosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final RegistrosTableModel RegistrosTableModel = new RegistrosTableModel(items,this.ShowColumns);
        this.setModel(RegistrosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final RegistrosTableModel RegistrosTableModel = (RegistrosTableModel)this.getModel();
       final List<Registros> items_ = (List<Registros>) RegistrosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Registros> items_ = (List<Registros>) RepositoryFactory.getInstance().getRegistrossRepository().getAll();
       final RegistrosTableModel RegistrosTableModel = new RegistrosTableModel(items_,this.ShowColumns);
       this.setModel(RegistrosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Registros> items_ = (List<Registros>) RepositoryFactory.getInstance().getRegistrossRepository().getByLikeEncabezados(search);
       final RegistrosTableModel RegistrosTableModel = new RegistrosTableModel(items_,this.ShowColumns);
       this.setModel(RegistrosTableModel);
   }

}