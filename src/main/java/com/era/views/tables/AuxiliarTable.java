package com.era.views.tables;

import com.era.models.Auxiliar;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.AuxiliarTableModel;
import java.util.List;

public class AuxiliarTable extends BaseJTable {

   public AuxiliarTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final AuxiliarTableModel AuxiliarTableModel = new AuxiliarTableModel(this,items,this.ShowColumns);
        this.setModel(AuxiliarTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final AuxiliarTableModel AuxiliarTableModel = (AuxiliarTableModel)this.getModel();
       final List<Auxiliar> items_ = (List<Auxiliar>) AuxiliarTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Auxiliar> items_ = (List<Auxiliar>) RepositoryFactory.getInstance().getAuxiliarsRepository().getAll();
       final AuxiliarTableModel AuxiliarTableModel = new AuxiliarTableModel(this,items_,this.ShowColumns);
       this.setModel(AuxiliarTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Auxiliar> items_ = (List<Auxiliar>) RepositoryFactory.getInstance().getAuxiliarsRepository().getByLikeEncabezados(search);
       final AuxiliarTableModel AuxiliarTableModel = new AuxiliarTableModel(this,items_,this.ShowColumns);
       this.setModel(AuxiliarTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Auxiliar ObjectIteration_ = (Auxiliar)ObjectIteration;
       final Auxiliar ObjectToCompare_ = (Auxiliar)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}