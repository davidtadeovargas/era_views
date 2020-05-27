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
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getModificaImpuestossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final ModificaImpuestos ModificaImpuestos = (ModificaImpuestos)Model_;

       RepositoryFactory.getInstance().getModificaImpuestossRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getModificaImpuestossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}