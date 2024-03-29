package com.era.views.tables;

import com.era.models.Terprodcompa;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.TerprodcompaTableModel;
import java.util.List;

public class TerprodcompaTable extends BaseJTable {

   public TerprodcompaTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final TerprodcompaTableModel TerprodcompaTableModel = new TerprodcompaTableModel(this,items,this.ShowColumns);
        this.setModel(TerprodcompaTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final TerprodcompaTableModel TerprodcompaTableModel = (TerprodcompaTableModel)this.getModel();
       final List<Terprodcompa> items_ = (List<Terprodcompa>) TerprodcompaTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Terprodcompa> items_ = (List<Terprodcompa>) RepositoryFactory.getInstance().getTerprodcompasRepository().getAll();
       final TerprodcompaTableModel TerprodcompaTableModel = new TerprodcompaTableModel(this,items_,this.ShowColumns);
       this.setModel(TerprodcompaTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Terprodcompa> items_ = (List<Terprodcompa>) RepositoryFactory.getInstance().getTerprodcompasRepository().getByLikeEncabezados(search);
       final TerprodcompaTableModel TerprodcompaTableModel = new TerprodcompaTableModel(this,items_,this.ShowColumns);
       this.setModel(TerprodcompaTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Terprodcompa ObjectIteration_ = (Terprodcompa)ObjectIteration;
       final Terprodcompa ObjectToCompare_ = (Terprodcompa)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getMarc().compareTo(ObjectToCompare_.getMarc())==0;
    }
}