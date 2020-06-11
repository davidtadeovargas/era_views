package com.era.views.tables;

import com.era.models.ImpuesXProduct;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ImpuesXProductTableModel;
import java.util.List;

public class ImpuesXProductTable extends BaseJTable {

   public ImpuesXProductTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ImpuesXProductTableModel ImpuesXProductTableModel = new ImpuesXProductTableModel(items,this.ShowColumns);
        this.setModel(ImpuesXProductTableModel);
   }

   @Override
   public boolean equal(final Object ObjectIteration, final Object ObjectToCompare){
       
       //Cast the models
       final ImpuesXProduct ObjectIteration_ = (ImpuesXProduct)ObjectIteration;
       final ImpuesXProduct ObjectToCompare_ = (ImpuesXProduct)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getImpue().compareTo(ObjectToCompare_.getImpue())==0;
   }
   
   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ImpuesXProductTableModel ImpuesXProductTableModel = (ImpuesXProductTableModel)this.getModel();
       final List<ImpuesXProduct> items_ = (List<ImpuesXProduct>) ImpuesXProductTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ImpuesXProduct> items_ = (List<ImpuesXProduct>) RepositoryFactory.getInstance().getImpuesXProductRepository().getAll();
       final ImpuesXProductTableModel ImpuesXProductTableModel = new ImpuesXProductTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesXProductTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ImpuesXProduct> items_ = (List<ImpuesXProduct>) RepositoryFactory.getInstance().getImpuesXProductRepository().getByLikeEncabezados(search);
       final ImpuesXProductTableModel ImpuesXProductTableModel = new ImpuesXProductTableModel(items_,this.ShowColumns);
       this.setModel(ImpuesXProductTableModel);
   }

}