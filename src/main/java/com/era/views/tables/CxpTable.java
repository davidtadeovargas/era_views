package com.era.views.tables;

import com.era.models.Cxp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CxpTableModel;
import java.util.List;

public class CxpTable extends BaseJTable {

   public CxpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CxpTableModel CxpTableModel = new CxpTableModel(this,items,this.ShowColumns);
        this.setModel(CxpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CxpTableModel CxpTableModel = (CxpTableModel)this.getModel();
       final List<Cxp> items_ = (List<Cxp>) CxpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Cxp> items_ = (List<Cxp>) RepositoryFactory.getInstance().getCxpsRepository().getAll();
       final CxpTableModel CxpTableModel = new CxpTableModel(this,items_,this.ShowColumns);
       this.setModel(CxpTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Cxp> items_ = (List<Cxp>) RepositoryFactory.getInstance().getCxpsRepository().getByLikeEncabezados(search);
       final CxpTableModel CxpTableModel = new CxpTableModel(this,items_,this.ShowColumns);
       this.setModel(CxpTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Cxp ObjectIteration_ = (Cxp)ObjectIteration;
       final Cxp ObjectToCompare_ = (Cxp)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}