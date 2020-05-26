package com.era.views.tables;

import com.era.models.DocumentosPago;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DocumentosPagoTableModel;
import java.util.List;

public class DocumentosPagoTable extends BaseJTable {

   public DocumentosPagoTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DocumentosPagoTableModel DocumentosPagoTableModel = new DocumentosPagoTableModel(items,this.ShowColumns);
        this.setModel(DocumentosPagoTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DocumentosPagoTableModel DocumentosPagoTableModel = (DocumentosPagoTableModel)this.getModel();
       final List<DocumentosPago> items_ = (List<DocumentosPago>) DocumentosPagoTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<DocumentosPago> items_ = (List<DocumentosPago>) RepositoryFactory.getInstance().getDocumentosPagosRepository().getAll();
       final DocumentosPagoTableModel DocumentosPagoTableModel = new DocumentosPagoTableModel(items_,this.ShowColumns);
       this.setModel(DocumentosPagoTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getDocumentosPagosRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final DocumentosPago DocumentosPago = (DocumentosPago)Model;

       RepositoryFactory.getInstance().getDocumentosPagosRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getDocumentosPagosRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}