package com.era.views.tables;

import com.era.models.DocumentosContabilizados;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DocumentosContabilizadosTableModel;
import java.util.List;

public class DocumentosContabilizadosTable extends BaseJTable {

   public DocumentosContabilizadosTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DocumentosContabilizadosTableModel DocumentosContabilizadosTableModel = new DocumentosContabilizadosTableModel(items,this.ShowColumns);
        this.setModel(DocumentosContabilizadosTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DocumentosContabilizadosTableModel DocumentosContabilizadosTableModel = (DocumentosContabilizadosTableModel)this.getModel();
       final List<DocumentosContabilizados> items_ = (List<DocumentosContabilizados>) DocumentosContabilizadosTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<DocumentosContabilizados> items_ = (List<DocumentosContabilizados>) RepositoryFactory.getInstance().getDocumentosContabilizadossRepository().getAll();
       final DocumentosContabilizadosTableModel DocumentosContabilizadosTableModel = new DocumentosContabilizadosTableModel(items_,this.ShowColumns);
       this.setModel(DocumentosContabilizadosTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getDocumentosContabilizadossRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model_) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model_);
        }

       final DocumentosContabilizados DocumentosContabilizados = (DocumentosContabilizados)Model_;

       RepositoryFactory.getInstance().getDocumentosContabilizadossRepository().save(Model_);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model_);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getDocumentosContabilizadossRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}