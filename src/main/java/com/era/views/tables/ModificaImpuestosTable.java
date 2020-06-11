package com.era.views.tables;

import com.era.models.ModificaImpuestos;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.ModificaImpuestosTableModel;
import java.util.List;

public class ModificaImpuestosTable extends BaseJTable {

   public ModificaImpuestosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final ModificaImpuestosTableModel ModificaImpuestosTableModel = new ModificaImpuestosTableModel(items,this.ShowColumns);
        this.setModel(ModificaImpuestosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final ModificaImpuestosTableModel ModificaImpuestosTableModel = (ModificaImpuestosTableModel)this.getModel();
       final List<ModificaImpuestos> items_ = (List<ModificaImpuestos>) ModificaImpuestosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<ModificaImpuestos> items_ = (List<ModificaImpuestos>) RepositoryFactory.getInstance().getModificaImpuestossRepository().getAll();
       final ModificaImpuestosTableModel ModificaImpuestosTableModel = new ModificaImpuestosTableModel(items_,this.ShowColumns);
       this.setModel(ModificaImpuestosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<ModificaImpuestos> items_ = (List<ModificaImpuestos>) RepositoryFactory.getInstance().getModificaImpuestossRepository().getByLikeEncabezados(search);
       final ModificaImpuestosTableModel ModificaImpuestosTableModel = new ModificaImpuestosTableModel(items_,this.ShowColumns);
       this.setModel(ModificaImpuestosTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final ModificaImpuestos ObjectIteration_ = (ModificaImpuestos)ObjectIteration;
       final ModificaImpuestos ObjectToCompare_ = (ModificaImpuestos)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getVenta() == ObjectToCompare_.getVenta();
    }
}