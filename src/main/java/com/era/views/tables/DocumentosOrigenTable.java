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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<DocumentosOrigen> items_ = (List<DocumentosOrigen>) RepositoryFactory.getInstance().getDocumentosOrigensRepository().getByLikeEncabezados(search);
       final DocumentosOrigenTableModel DocumentosOrigenTableModel = new DocumentosOrigenTableModel(items_,this.ShowColumns);
       this.setModel(DocumentosOrigenTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final DocumentosOrigen ObjectIteration_ = (DocumentosOrigen)ObjectIteration;
       final DocumentosOrigen ObjectToCompare_ = (DocumentosOrigen)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}