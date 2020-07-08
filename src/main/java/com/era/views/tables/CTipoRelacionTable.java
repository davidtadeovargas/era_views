package com.era.views.tables;

import com.era.models.CTipoRelacion;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CTipoRelacionTableModel;
import java.util.List;

public class CTipoRelacionTable extends BaseJTable {

   public CTipoRelacionTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CTipoRelacionTableModel CTipoRelacionTableModel = new CTipoRelacionTableModel(this,items,this.ShowColumns);
        this.setModel(CTipoRelacionTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CTipoRelacionTableModel CTipoRelacionTableModel = (CTipoRelacionTableModel)this.getModel();
       final List<CTipoRelacion> items_ = (List<CTipoRelacion>) CTipoRelacionTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CTipoRelacion> items_ = (List<CTipoRelacion>) RepositoryFactory.getInstance().getCTipoRelacionsRepository().getAll();
       final CTipoRelacionTableModel CTipoRelacionTableModel = new CTipoRelacionTableModel(this,items_,this.ShowColumns);
       this.setModel(CTipoRelacionTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<CTipoRelacion> items_ = (List<CTipoRelacion>) RepositoryFactory.getInstance().getCTipoRelacionsRepository().getByLikeEncabezados(search);
       final CTipoRelacionTableModel CTipoRelacionTableModel = new CTipoRelacionTableModel(this,items_,this.ShowColumns);
       this.setModel(CTipoRelacionTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final CTipoRelacion ObjectIteration_ = (CTipoRelacion)ObjectIteration;
       final CTipoRelacion ObjectToCompare_ = (CTipoRelacion)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}