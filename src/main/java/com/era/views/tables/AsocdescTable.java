package com.era.views.tables;

import com.era.models.Asocdesc;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AsocdescTableModel;
import java.util.List;

public class AsocdescTable extends BaseJTable {

   public AsocdescTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AsocdescTableModel AsocdescTableModel = new AsocdescTableModel(items,this.ShowColumns);
        this.setModel(AsocdescTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AsocdescTableModel AsocdescTableModel = (AsocdescTableModel)this.getModel();
       final List<Asocdesc> items_ = (List<Asocdesc>) AsocdescTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Asocdesc> items_ = (List<Asocdesc>) RepositoryFactory.getInstance().getAsocdescsRepository().getAll();
       final AsocdescTableModel AsocdescTableModel = new AsocdescTableModel(items_,this.ShowColumns);
       this.setModel(AsocdescTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Asocdesc> items_ = (List<Asocdesc>) RepositoryFactory.getInstance().getAsocdescsRepository().getByLikeEncabezados(search);
       final AsocdescTableModel AsocdescTableModel = new AsocdescTableModel(items_,this.ShowColumns);
       this.setModel(AsocdescTableModel);
   }

}