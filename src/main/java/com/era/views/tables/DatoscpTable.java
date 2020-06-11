package com.era.views.tables;

import com.era.models.Datoscp;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DatoscpTableModel;
import java.util.List;

public class DatoscpTable extends BaseJTable {

   public DatoscpTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DatoscpTableModel DatoscpTableModel = new DatoscpTableModel(items,this.ShowColumns);
        this.setModel(DatoscpTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DatoscpTableModel DatoscpTableModel = (DatoscpTableModel)this.getModel();
       final List<Datoscp> items_ = (List<Datoscp>) DatoscpTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Datoscp> items_ = (List<Datoscp>) RepositoryFactory.getInstance().getDatoscpsRepository().getAll();
       final DatoscpTableModel DatoscpTableModel = new DatoscpTableModel(items_,this.ShowColumns);
       this.setModel(DatoscpTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Datoscp> items_ = (List<Datoscp>) RepositoryFactory.getInstance().getDatoscpsRepository().getByLikeEncabezados(search);
       final DatoscpTableModel DatoscpTableModel = new DatoscpTableModel(items_,this.ShowColumns);
       this.setModel(DatoscpTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Datoscp ObjectIteration_ = (Datoscp)ObjectIteration;
       final Datoscp ObjectToCompare_ = (Datoscp)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}