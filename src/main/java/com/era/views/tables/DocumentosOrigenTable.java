package com.era.views.tables;

import com.era.models.DocumentosOrigen;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DocumentosOrigenTableModel;
import java.util.List;

public class DocumentosOrigenTable extends BaseJTable {

   public DocumentosOrigenTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DocumentosOrigenTableModel DocumentosOrigenTableModel = new DocumentosOrigenTableModel(items,this.ShowColumns);
        this.setModel(DocumentosOrigenTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DocumentosOrigenTableModel DocumentosOrigenTableModel = (DocumentosOrigenTableModel)this.getModel();
       final List<DocumentosOrigen> items_ = (List<DocumentosOrigen>) DocumentosOrigenTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<DocumentosOrigen> items_ = (List<DocumentosOrigen>) RepositoryFactory.getInstance().getDocumentosOrigensRepository().getAll();
       final DocumentosOrigenTableModel DocumentosOrigenTableModel = new DocumentosOrigenTableModel(items_,this.ShowColumns);
       this.setModel(DocumentosOrigenTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getDocumentosOrigensRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final DocumentosOrigen DocumentosOrigen = (DocumentosOrigen)Model;

       RepositoryFactory.getInstance().getDocumentosOrigensRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getDocumentosOrigensRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}