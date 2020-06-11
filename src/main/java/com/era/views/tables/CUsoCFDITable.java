package com.era.views.tables;

import com.era.models.CUsoCFDI;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CUsoCFDITableModel;
import java.util.List;

public class CUsoCFDITable extends BaseJTable {

   public CUsoCFDITable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CUsoCFDITableModel CUsoCFDITableModel = new CUsoCFDITableModel(items,this.ShowColumns);
        this.setModel(CUsoCFDITableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CUsoCFDITableModel CUsoCFDITableModel = (CUsoCFDITableModel)this.getModel();
       final List<CUsoCFDI> items_ = (List<CUsoCFDI>) CUsoCFDITableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CUsoCFDI> items_ = (List<CUsoCFDI>) RepositoryFactory.getInstance().getCUsoCFDIsRepository().getAll();
       final CUsoCFDITableModel CUsoCFDITableModel = new CUsoCFDITableModel(items_,this.ShowColumns);
       this.setModel(CUsoCFDITableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CUsoCFDI> items_ = (List<CUsoCFDI>) RepositoryFactory.getInstance().getCUsoCFDIsRepository().getByLikeEncabezados(search);
       final CUsoCFDITableModel CUsoCFDITableModel = new CUsoCFDITableModel(items_,this.ShowColumns);
       this.setModel(CUsoCFDITableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final CUsoCFDI ObjectIteration_ = (CUsoCFDI)ObjectIteration;
       final CUsoCFDI ObjectToCompare_ = (CUsoCFDI)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}