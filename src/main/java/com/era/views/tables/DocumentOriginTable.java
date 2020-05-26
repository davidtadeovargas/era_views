package com.era.views.tables;

import com.era.models.DocumentOrigin;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.DocumentOriginTableModel;
import java.util.List;

public class DocumentOriginTable extends BaseJTable {

   public DocumentOriginTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final DocumentOriginTableModel DocumentOriginTableModel = new DocumentOriginTableModel(items,this.ShowColumns);
        this.setModel(DocumentOriginTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final DocumentOriginTableModel DocumentOriginTableModel = (DocumentOriginTableModel)this.getModel();
       final List<DocumentOrigin> items_ = (List<DocumentOrigin>) DocumentOriginTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<DocumentOrigin> items_ = (List<DocumentOrigin>) RepositoryFactory.getInstance().getDocumentOriginsRepository().getAll();
       final DocumentOriginTableModel DocumentOriginTableModel = new DocumentOriginTableModel(items_,this.ShowColumns);
       this.setModel(DocumentOriginTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getDocumentOriginsRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final DocumentOrigin DocumentOrigin = (DocumentOrigin)Model;

       RepositoryFactory.getInstance().getDocumentOriginsRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getDocumentOriginsRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}