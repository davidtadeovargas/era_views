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
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = new ImpuesxpartidapedTableModel(this,items,this.ShowColumns);
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
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = new ImpuesxpartidapedTableModel(this,items_,this.ShowColumns);
       this.setModel(ImpuesxpartidapedTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Impuesxpartidaped> items_ = (List<Impuesxpartidaped>) RepositoryFactory.getInstance().getImpuesxpartidapedsRepository().getByLikeEncabezados(search);
       final ImpuesxpartidapedTableModel ImpuesxpartidapedTableModel = new ImpuesxpartidapedTableModel(this,items_,this.ShowColumns);
       this.setModel(ImpuesxpartidapedTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Impuesxpartidaped ObjectIteration_ = (Impuesxpartidaped)ObjectIteration;
       final Impuesxpartidaped ObjectToCompare_ = (Impuesxpartidaped)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}