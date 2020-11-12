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
       final DocumentOriginTableModel DocumentOriginTableModel = new DocumentOriginTableModel(this,items,this.ShowColumns);
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
       final List<DocumentOrigin> items_ = (List<DocumentOrigin>) RepositoryFactory.getInstance().getDocumentOriginRepository().getAll();
       final DocumentOriginTableModel DocumentOriginTableModel = new DocumentOriginTableModel(this,items_,this.ShowColumns);
       this.setModel(DocumentOriginTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<DocumentOrigin> items_ = (List<DocumentOrigin>) RepositoryFactory.getInstance().getDocumentOriginRepository().getByLikeEncabezados(search);
       final DocumentOriginTableModel DocumentOriginTableModel = new DocumentOriginTableModel(this,items_,this.ShowColumns);
       this.setModel(DocumentOriginTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final DocumentOrigin ObjectIteration_ = (DocumentOrigin)ObjectIteration;
       final DocumentOrigin ObjectToCompare_ = (DocumentOrigin)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}