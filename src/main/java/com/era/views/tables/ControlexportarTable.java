package com.era.views.tables;

import com.era.models.Controlexportar;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ControlexportarTableModel;
import java.util.List;

public class ControlexportarTable extends BaseJTable {

   public ControlexportarTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ControlexportarTableModel ControlexportarTableModel = new ControlexportarTableModel(this,items,this.ShowColumns);
        this.setModel(ControlexportarTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ControlexportarTableModel ControlexportarTableModel = (ControlexportarTableModel)this.getModel();
       final List<Controlexportar> items_ = (List<Controlexportar>) ControlexportarTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Controlexportar> items_ = (List<Controlexportar>) RepositoryFactory.getInstance().getControlexportarsRepository().getAll();
       final ControlexportarTableModel ControlexportarTableModel = new ControlexportarTableModel(this,items_,this.ShowColumns);
       this.setModel(ControlexportarTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Controlexportar> items_ = (List<Controlexportar>) RepositoryFactory.getInstance().getControlexportarsRepository().getByLikeEncabezados(search);
       final ControlexportarTableModel ControlexportarTableModel = new ControlexportarTableModel(this,items_,this.ShowColumns);
       this.setModel(ControlexportarTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Controlexportar ObjectIteration_ = (Controlexportar)ObjectIteration;
       final Controlexportar ObjectToCompare_ = (Controlexportar)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}