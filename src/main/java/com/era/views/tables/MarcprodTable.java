package com.era.views.tables;

import com.era.models.Marcprod;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.MarcprodTableModel;
import java.util.List;

public class MarcprodTable extends BaseJTable {

   public MarcprodTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final MarcprodTableModel MarcprodTableModel = new MarcprodTableModel(this,items,this.ShowColumns);
        this.setModel(MarcprodTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final MarcprodTableModel MarcprodTableModel = (MarcprodTableModel)this.getModel();
       final List<Marcprod> items_ = (List<Marcprod>) MarcprodTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Marcprod> items_ = (List<Marcprod>) RepositoryFactory.getInstance().getMarcprodsRepository().getAll();
       final MarcprodTableModel MarcprodTableModel = new MarcprodTableModel(this,items_,this.ShowColumns);
       this.setModel(MarcprodTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Marcprod> items_ = (List<Marcprod>) RepositoryFactory.getInstance().getMarcprodsRepository().getByLikeEncabezados(search);
       final MarcprodTableModel MarcprodTableModel = new MarcprodTableModel(this,items_,this.ShowColumns);
       this.setModel(MarcprodTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Marcprod ObjectIteration_ = (Marcprod)ObjectIteration;
       final Marcprod ObjectToCompare_ = (Marcprod)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}