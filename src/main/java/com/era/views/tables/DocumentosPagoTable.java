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
   public void getByLikeEncabezados(final String search) throws Exception {
       final List<DocumentosPago> items_ = (List<DocumentosPago>) RepositoryFactory.getInstance().getDocumentosPagosRepository().getByLikeEncabezados(search);
       final DocumentosPagoTableModel DocumentosPagoTableModel = new DocumentosPagoTableModel(items_,this.ShowColumns);
       this.setModel(DocumentosPagoTableModel);
   }

}