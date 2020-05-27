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
       final LineTableModel LineTableModel = new LineTableModel(items,this.ShowColumns);
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
       final LineTableModel LineTableModel = new LineTableModel(items_,this.ShowColumns);
       this.setModel(LineTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getLinesRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final Line Line = (Line)Model_;

       RepositoryFactory.getInstance().getLinesRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getLinesRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}