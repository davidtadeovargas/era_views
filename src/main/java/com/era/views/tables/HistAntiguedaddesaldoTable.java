package com.era.views.tables;

import com.era.models.HistAntiguedaddesaldo;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.HistAntiguedaddesaldoTableModel;
import java.util.List;

public class HistAntiguedaddesaldoTable extends BaseJTable {

   public HistAntiguedaddesaldoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final HistAntiguedaddesaldoTableModel HistAntiguedaddesaldoTableModel = new HistAntiguedaddesaldoTableModel(items,this.ShowColumns);
        this.setModel(HistAntiguedaddesaldoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final HistAntiguedaddesaldoTableModel HistAntiguedaddesaldoTableModel = (HistAntiguedaddesaldoTableModel)this.getModel();
       final List<HistAntiguedaddesaldo> items_ = (List<HistAntiguedaddesaldo>) HistAntiguedaddesaldoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<HistAntiguedaddesaldo> items_ = (List<HistAntiguedaddesaldo>) RepositoryFactory.getInstance().getHistAntiguedaddesaldosRepository().getAll();
       final HistAntiguedaddesaldoTableModel HistAntiguedaddesaldoTableModel = new HistAntiguedaddesaldoTableModel(items_,this.ShowColumns);
       this.setModel(HistAntiguedaddesaldoTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getHistAntiguedaddesaldosRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final HistAntiguedaddesaldo HistAntiguedaddesaldo = (HistAntiguedaddesaldo)Model_;

       RepositoryFactory.getInstance().getHistAntiguedaddesaldosRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getHistAntiguedaddesaldosRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}