package com.era.views.tables;

import com.era.models.Subramos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.SubramosTableModel;
import java.util.List;

public class SubramosTable extends BaseJTable {

   public SubramosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final SubramosTableModel SubramosTableModel = new SubramosTableModel(items,this.ShowColumns);
        this.setModel(SubramosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final SubramosTableModel SubramosTableModel = (SubramosTableModel)this.getModel();
       final List<Subramos> items_ = (List<Subramos>) SubramosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Subramos> items_ = (List<Subramos>) RepositoryFactory.getInstance().getSubramossRepository().getAll();
       final SubramosTableModel SubramosTableModel = new SubramosTableModel(items_,this.ShowColumns);
       this.setModel(SubramosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Subramos> items_ = (List<Subramos>) RepositoryFactory.getInstance().getSubramossRepository().getByLikeEncabezados(search);
       final SubramosTableModel SubramosTableModel = new SubramosTableModel(items_,this.ShowColumns);
       this.setModel(SubramosTableModel);
   }

    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Subramos ObjectIteration_ = (Subramos)ObjectIteration;
       final Subramos ObjectToCompare_ = (Subramos)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getCode().compareTo(ObjectToCompare_.getCode())==0;
    }
}