package com.era.views.tables;

import com.era.models.Impuesxpartidaped;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuesxpartidapedTableModel;
import java.util.List;

public class ImpuesxpartidapedTable extends BaseJTable {

   public ImpuesxpartidapedTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = new ImpuesxpartidapedTableModel(items,this.ShowColumns);
        this.setModel(ImpuesxpartidapedTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = (ImpuesxpartidapedTableModel)this.getModel();
       final List<Impuesxpartidaped> items_ = (List<Impuesxpartidaped>) ImpuesxpartidapedTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Impuesxpartidaped> items_ = (List<Impuesxpartidaped>) RepositoryFactory.getInstance().getImpuesxpartidapedsRepository().getAll();
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = new ImpuesxpartidapedTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesxpartidapedTableModel);
   }

}