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

}