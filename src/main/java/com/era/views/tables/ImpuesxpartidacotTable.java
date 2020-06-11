package com.era.views.tables;

import com.era.models.Impuesxpartidacot;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuesxpartidacotTableModel;
import java.util.List;

public class ImpuesxpartidacotTable extends BaseJTable {

   public ImpuesxpartidacotTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuesxpartidacotTableModel ImpuesxpartidacotTableModel = new ImpuesxpartidacotTableModel(items,this.ShowColumns);
        this.setModel(ImpuesxpartidacotTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuesxpartidacotTableModel ImpuesxpartidacotTableModel = (ImpuesxpartidacotTableModel)this.getModel();
       final List<Impuesxpartidacot> items_ = (List<Impuesxpartidacot>) ImpuesxpartidacotTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Impuesxpartidacot> items_ = (List<Impuesxpartidacot>) RepositoryFactory.getInstance().getImpuesxpartidacotsRepository().getAll();
       final ImpuesxpartidacotTableModel ImpuesxpartidacotTableModel = new ImpuesxpartidacotTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesxpartidacotTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Impuesxpartidacot> items_ = (List<Impuesxpartidacot>) RepositoryFactory.getInstance().getImpuesxpartidacotsRepository().getByLikeEncabezados(search);
       final ImpuesxpartidacotTableModel ImpuesxpartidacotTableModel = new ImpuesxpartidacotTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesxpartidacotTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Impuesxpartidacot ObjectIteration_ = (Impuesxpartidacot)ObjectIteration;
       final Impuesxpartidacot ObjectToCompare_ = (Impuesxpartidacot)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}