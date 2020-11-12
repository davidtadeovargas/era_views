package com.era.views.tables;

import com.era.models.CClaveUnidad;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CClaveUnidadTableModel;
import java.util.List;

public class CClaveUnidadTable extends BaseJTable {

   public CClaveUnidadTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CClaveUnidadTableModel CClaveUnidadTableModel = new CClaveUnidadTableModel(this,items,this.ShowColumns);
        this.setModel(CClaveUnidadTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CClaveUnidadTableModel CClaveUnidadTableModel = (CClaveUnidadTableModel)this.getModel();
       final List<CClaveUnidad> items_ = (List<CClaveUnidad>) CClaveUnidadTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CClaveUnidad> items_ = (List<CClaveUnidad>) RepositoryFactory.getInstance().getCClaveUnidadsRepository().getAll();
       final CClaveUnidadTableModel CClaveUnidadTableModel = new CClaveUnidadTableModel(this,items_,this.ShowColumns);
       this.setModel(CClaveUnidadTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CClaveUnidad> items_ = (List<CClaveUnidad>) RepositoryFactory.getInstance().getCClaveUnidadsRepository().getByLikeEncabezados(search);
       final CClaveUnidadTableModel CClaveUnidadTableModel = new CClaveUnidadTableModel(this,items_,this.ShowColumns);
       this.setModel(CClaveUnidadTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final CClaveUnidad ObjectIteration_ = (CClaveUnidad)ObjectIteration;
       final CClaveUnidad ObjectToCompare_ = (CClaveUnidad)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}