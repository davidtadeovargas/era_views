package com.era.views.tables;

import com.era.models.Line;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.LineTableModel;
import java.util.List;

public class LineTable extends BaseJTable {

   public LineTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final LineTableModel LineTableModel = new LineTableModel(this,items,this.ShowColumns);
        this.setModel(LineTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final LineTableModel LineTableModel = (LineTableModel)this.getModel();
       final List<Line> items_ = (List<Line>) LineTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<Line> items_ = (List<Line>) RepositoryFactory.getInstance().getLinesRepository().getAll();
       final LineTableModel LineTableModel = new LineTableModel(this,items_,this.ShowColumns);
       this.setModel(LineTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<Line> items_ = (List<Line>) RepositoryFactory.getInstance().getLinesRepository().getByLikeEncabezados(search);
       final LineTableModel LineTableModel = new LineTableModel(this,items_,this.ShowColumns);
       this.setModel(LineTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final Line ObjectIteration_ = (Line)ObjectIteration;
       final Line ObjectToCompare_ = (Line)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}