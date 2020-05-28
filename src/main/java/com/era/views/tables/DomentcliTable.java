package com.era.views.tables;

import com.era.models.Domentcli;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DomentcliTableModel;
import java.util.List;

public class DomentcliTable extends BaseJTable {

   public DomentcliTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DomentcliTableModel DomentcliTableModel = new DomentcliTableModel(items,this.ShowColumns);
        this.setModel(DomentcliTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DomentcliTableModel DomentcliTableModel = (DomentcliTableModel)this.getModel();
       final List<Domentcli> items_ = (List<Domentcli>) DomentcliTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Domentcli> items_ = (List<Domentcli>) RepositoryFactory.getInstance().getDomentclisRepository().getAll();
       final DomentcliTableModel DomentcliTableModel = new DomentcliTableModel(items_,this.ShowColumns);
       this.setModel(DomentcliTableModel);
   }

}