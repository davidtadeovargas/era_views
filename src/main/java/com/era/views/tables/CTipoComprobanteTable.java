package com.era.views.tables;

import com.era.models.CTipoComprobante;
import com.era.repositories.RepositoryFactory;
import com.era.views.tables.tablemodels.CTipoComprobanteTableModel;
import java.util.List;

public class CTipoComprobanteTable extends BaseJTable {

   public CTipoComprobanteTable(){
       super();
    }

   @Override
   public void initTable(List<?> items) {
       final CTipoComprobanteTableModel CTipoComprobanteTableModel = new CTipoComprobanteTableModel(items,this.ShowColumns);
        this.setModel(CTipoComprobanteTableModel);
   }

   @Override
   public List<?> getAllItemsInTable() throws Exception {
       final CTipoComprobanteTableModel CTipoComprobanteTableModel = (CTipoComprobanteTableModel)this.getModel();
       final List<CTipoComprobante> items_ = (List<CTipoComprobante>) CTipoComprobanteTableModel.getItems();
       return items_;
   }

   @Override
   public void loadAllItemsInTable() throws Exception {
       final List<CTipoComprobante> items_ = (List<CTipoComprobante>) RepositoryFactory.getInstance().getCTipoComprobantesRepository().getAll();
       final CTipoComprobanteTableModel CTipoComprobanteTableModel = new CTipoComprobanteTableModel(items_,this.ShowColumns);
       this.setModel(CTipoComprobanteTableModel);
   }

   @Override
   public void deleteObjectInTable(Object Model) throws Exception{
       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPrevDelete(Model);
        }

       RepositoryFactory.getInstance().getCTipoComprobantesRepository().delete(Model);

       if(IDeleteObjectInTable != null){
            IDeleteObjectInTable.onPostDelete(Model);
        }
   }

   @Override
   public void insertNewObjectToTable(Object Model) throws Exception {
       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPrevInsert(Model);
        }

       final CTipoComprobante CTipoComprobante = (CTipoComprobante)Model;

       RepositoryFactory.getInstance().getCTipoComprobantesRepository().save(Model);

       if(IInsertNewObjectToTable != null){
            IInsertNewObjectToTable.onPostInsert(Model);
        }
   }

   @Override
   public void deleteAllObjectsInTable() throws Exception {
       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPrevDelete();
        }

       RepositoryFactory.getInstance().getCTipoComprobantesRepository().deleteAll();

       if(this.IDeleteAllItemsInTable != null){
            this.IDeleteAllItemsInTable.onPostDelete();
        }
   }

}