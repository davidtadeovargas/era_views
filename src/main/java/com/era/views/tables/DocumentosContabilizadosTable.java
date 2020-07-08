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
       final DocumentosContabilizadosTableModel DocumentosContabilizadosTableModel = new DocumentosContabilizadosTableModel(this,items,this.ShowColumns);
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
       final DocumentosContabilizadosTableModel DocumentosContabilizadosTableModel = new DocumentosContabilizadosTableModel(this,items_,this.ShowColumns);
       this.setModel(DocumentosContabilizadosTableModel);
   }

   @Override
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<DocumentosContabilizados> items_ = (List<DocumentosContabilizados>) RepositoryFactory.getInstance().getDocumentosContabilizadossRepository().getByLikeEncabezados(search);
       final DocumentosContabilizadosTableModel DocumentosContabilizadosTableModel = new DocumentosContabilizadosTableModel(this,items_,this.ShowColumns);
       this.setModel(DocumentosContabilizadosTableModel);
   }
   
    @Override
    public boolean equal(Object ObjectIteration, Object ObjectToCompare) {
        
       //Cast the models
       final DocumentosContabilizados ObjectIteration_ = (DocumentosContabilizados)ObjectIteration;
       final DocumentosContabilizados ObjectToCompare_ = (DocumentosContabilizados)ObjectToCompare;
       
       //Validate if are equals
       return ObjectIteration_.getId() == ObjectToCompare_.getId();
    }
}